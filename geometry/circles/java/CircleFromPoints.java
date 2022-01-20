/*
**  CircleFromPoints.java
**  Copyright (C) 2018 David V. Makray
**
**
**  This program is free software: you can redistribute it and/or modify
**  it under the terms of the GNU General Public License as
**  published by the Free Software Foundation, either version 3 of the
**  License, or (at your option) any later version.
**
**  This program is distributed in the hope that it will be useful,
**  but WITHOUT ANY WARRANTY; without even the implied warranty of
**  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
**  GNU General Public License for more details.
**
**  You should have received a copy of the GNU General Public License
**  along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

import java.awt.Point;
import java.lang.Math;
import java.text.MessageFormat;

public class CircleFromPoints
{
	public class CircleTelemetry
	{
		Point location;
		int radius;
	}

	public CircleTelemetry CircleCalculation(Point[] points)
	{
		if (points.length != 3)
		{
			throw new RuntimeException(MessageFormat.format(
			"Invalid Circle definition: need 3 control points, but got {0}.",
			points.length));
		}

		//Horizontal and vertical refer to the tangent lines!  
		boolean tangentline1_horizontal = false;
		boolean tangentline2_horizontal = false;
		boolean tangentline1_vertical = false;
		boolean tangentline2_vertical = false;
		double slope1 = 0;
		double slope2 = 0;

		//Find circle via slope..
		if (points[1].x == points[0].x)
			tangentline1_horizontal = true;
		else if (points[1].y == points[0].y)
			tangentline1_vertical = true;
		else
			slope1 = (double)(points[1].y - points[0].y) / (double)(points[1].x - points[0].x);

		if (points[2].x == points[1].x)
			tangentline2_horizontal = true;
		else if (points[2].y == points[1].y)
			tangentline2_vertical = true;
		else
			slope2 = (double)(points[2].y - points[1].y) / (double)(points[2].x - points[1].x);

		if ((tangentline1_horizontal && tangentline2_horizontal) || (tangentline1_vertical && tangentline2_vertical))
			return null;

		double midpoint1_x = (double)(points[1].x + points[0].x) / 2;
		double midpoint1_y = (double)(points[1].y + points[0].y) / 2;

		double midpoint2_x = (double)(points[2].x + points[1].x) / 2;
		double midpoint2_y = (double)(points[2].y + points[1].y) / 2;

		//Take the perpendicular of the slope and a midpoint to create a new line equation.
		double slope1_inverse = 0;
		if (!tangentline1_horizontal && !tangentline1_vertical)
			slope1_inverse = -1 / slope1;
		double intercept1 = midpoint1_y - (slope1_inverse * midpoint1_x);
		double intercept1_orig = midpoint1_y - (slope1 * midpoint1_x);

		double slope2_inverse = 0;
		if (!tangentline2_horizontal && !tangentline2_vertical)
			slope2_inverse = -1 / slope2;
		double intercept2 = midpoint2_y - (slope2_inverse * midpoint2_x);
		double intercept2_orig = midpoint2_y - (slope2 * midpoint2_x);

		if (tangentline1_vertical)
		{
			//First line is a vertical inverse.
			double x = midpoint1_x;
			double y = midpoint1_x * slope2_inverse + intercept2;
			float distance = (float)Math.sqrt(Math.pow(x - points[0].x, 2) + Math.pow(y - points[0].y, 2));

			CircleTelemetry circle = new CircleTelemetry();
			circle.location.x = (int)x;
			circle.location.y = (int)y;
			circle.radius = (int)distance;

			return circle;
		}
		else if (tangentline2_vertical)
		{
			//Line2 is vertical.
			double x = midpoint2_x;
			double y = midpoint2_x * slope1_inverse + intercept1;
			float distance = (float)Math.sqrt(Math.pow(x - points[0].x, 2) + Math.pow(y - points[0].y, 2));

			CircleTelemetry circle = new CircleTelemetry();
			circle.location.x = (int)x;
			circle.location.y = (int)y;
			circle.radius = (int)distance;

			return circle;
		}

		//Calculate the general case.
		//Find the interception point between the two new line equations.
		//	[1 -m1, 1 -m2] * [Y X] = [b1 b2]

		double determinant = slope1_inverse - slope2_inverse;
		if (determinant == 0)
			return null;

		double y = (slope1_inverse * intercept2 - slope2_inverse * intercept1) / determinant;
		double x = (intercept2 - intercept1) / determinant;
		float distance = (float)Math.sqrt(Math.pow(x - points[0].x, 2) + Math.pow(y - points[0].y, 2));

		CircleTelemetry circle = new CircleTelemetry();
		circle.location.x = (int)x;
		circle.location.y = (int)y;
		circle.radius = (int)distance;
		return circle;
	}
}