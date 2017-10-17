#include <bits/stdc++.h>

using namespace std;
/*
 * Given points as cartesian coordinates such that they form a closed polygon. It is assumed that the last point
 * connects to the first point, with no lines crossing exisiting lines of the polygon. That is, it is a simple polygon.
 * Then, area of this polygon, as given by the shoelace Formula is described below
 */
double shoelaceFormula(vector<pair<int,int> > points){
	int len = points.size();
	int area = 0;
	for(int i=0;i<len;i++){
		int x = points[i].first;
		int yPrev = points[(i-1+len)%len].second; // prevent negative indices
		int yNext = points[(i+1)%len].second; // prevent index out of bounds
		area += x*(yNext - yPrev);
	}
	return abs(area)/2.0;
}

int main(){
	vector<pair<int,int> > points;
	points.push_back(make_pair(1,0));
	points.push_back(make_pair(0,1));
	points.push_back(make_pair(0,0));
	cout<<shoelaceFormula(points);
}