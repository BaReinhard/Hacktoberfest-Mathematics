
//input side lengths & return angles & area
import java.text.DecimalFormat;
import java.util.Scanner;
public class sidetriangle {

	public static void main(String[] args) {
		double a, b, c; // use for side lengths
		  double x, y, z; // use for the three angles
		  double area;	    //area of triangle
		  int user_choice;	//user input variable

		  Scanner keyboard = new Scanner(System.in);
		  
		  while (true) {
			  System.out.println ("-----------------------\n");
			  System.out.println ("Program Modes\n");
			  System.out.println ("(1) Enter sides\n");
			  System.out.println ("(2) Quit\n");
			  System.out.println ("Enter Mode: ");
			  user_choice = keyboard.nextInt();
			    
			  if (user_choice == 1) {
			      // ask user for sides and read the values in 
				  while (true) { // start of infinite loop
					  System.out.println ("Enter side a: ");
					  a = keyboard.nextDouble();
			      	  if (a>0){
		    			 break;
			      	  }
				  }
					while (true) { // start of infinite loop
					      System.out.println ("Enter side b: ");
					      b = keyboard.nextDouble();
			    		if (b>0){
			    			break;
			    		}
					}
			    	while (true) { // start of infinite loop
			    		 System.out.println ("Enter side c: ");
					      c = keyboard.nextDouble();
					      if (c>0){
				             break;
				    	  }
			    	}
			      
			      // determine if it's a valid triangle using the function isNotvalidTriangle
			    
			      if (isNotValidTriangle(a,b,c)) {
					System.out.println ("Not a valid triangle!\n");
					continue; /*  CONTINUE;
						     	continue forces the program to go back to the beginning
						     	of the most immediate loop that contains this command */
			      }
			      	
			      
			      // get all three angles using the function get_angle
			      x = get_angle (b, c, a);  // x is opposite a
			      y = get_angle (c,a,b);	// y is opposite b
			      z = get_angle (a,b,c);	// z is opposite c
			  
			      // get the area using get_area function
			      //  area can be calculated using any valid combination of sides and angle
			      //  and only needs to be done once b/c area will not change
			      area = get_area(b,c,x);   // b, c and x are used here. x is between b and c.
			      
			      // convert the angles from radians to degrees using rad2deg function
			      x = rad2deg(x);
			      y = rad2deg(y);
			      z = rad2deg(z);
			      // calls all three angles x, y & z
			      
			      // print out the results
			      // print angle x,y,z and the area
			      // repeat loop after
			   System.out.println("x="+df2.format(x) +" y="+df2.format(y)+" z="+df2.format(z)+" area="+df2.format(area));
			  }
			  else if (user_choice == 2) {
				  System.out.println("Goodbye!");
			      System.exit(0);
			  }
			  else {
			      System.out.println ("Invalid choice\n");
			  }
		  }	
	}

	public static double get_area (double aa, double bb, double zz) {
		  // returns the area of a triangle given the length
		  //   of two sides aa & ab  
		  //   and the angle zz in radians
		double area = 0.0;
		area=((aa*bb)*(Math.sin(zz))/2);		
		return area;
	}

	public static double rad2deg (double rad) {
		// converts the angle rad in radians and 
		//    returns the angle in degrees
		double deg = 0.0;
		deg=rad*(180/Math.PI);
		return deg;
	}

	public static double get_angle (double aa, double bb, double cc) {
		//  given three sides of a triangle aa, bb & cc
		//    returns the angle opposite of the side with length cc
		//    in radians
		double angle = 0.0;
		angle=Math.acos(((aa*aa)+(bb*bb)-(cc*cc))/(2*aa*bb));
		return angle;
	}
	private static DecimalFormat df2 = new DecimalFormat("#.00");
	//for decimal places
	

	public static boolean isNotValidTriangle (double aa, double bb, double cc) {
	    // given three sides of a triangle aa, bb & cc
		//    determines whether or not it is a valid triangle.
		// returns true if it IS NOT a valid triangle
		// returns false if it IS a valid triangle	    		
		boolean invalid = true;
		if((aa>=bb && aa>=cc && bb+cc<=aa) ||
		   (bb>=aa && bb>=cc && aa+cc<=bb)	||
		   (cc>=aa && cc>=bb && aa+bb<=cc)) { 
			invalid=true;
		}
		else {
			invalid=false;
		}
			return invalid;

	}

}
