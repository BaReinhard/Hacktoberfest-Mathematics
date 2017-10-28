public class Moment_of_Inertia{
        /**
          *Moment Of Inertia of a Thin rod  through its Centre of mass and Perpendicular to its plane.
          *@param m mass of the rod.
          *@param l length of the rod.
         */
         public static double MI_rod(m,l){
            double MI = (m * l *l)/12 ;
            return MI;
         }
         
       /**
        *Moment of Inertia of a Circular Disc about its centre of mass and axis perpendicular to its plane.
        *@param m mass of the disc.
        *@param r radius of the disc.
        */
        public static double MI_cirDisc(m,r){
            double MI = (m * r * r)/2;
            return MI;
        }
        
      /**
       *Moment of Inertia of a uniform Cylinder about an axis through its centre of mass and perpendicular to its base.
       *@param m mass of the Cylinder.
       *@param r radius of the Cylinder.
      */
       public static double MI_Cylinder(m,r){
            double MI = (m * r * r)/2;
            return MI;
        }
    }
       /**
        *Calculates the moment of inertia of an axis parallel to the center of mass using the parallel axis theorem
        *@param m mass of the shape
        *@param r radius (if disc or cylinder), length (if rod)
        *@param d distance from center of mass to the parallel axis
        *@param shape the shape corresponding to the correct Icm method
        *@return parallel_axis the moment of inertia of the parallel axis
        */
        public static double MI_Parallel_Axis(double m, double r, double d, String shape) {
                double momentCM;
                double parallel_axis;
                if (shape.equals("rod") || shape.equals("Rod")) {
                        momentCM = MI_rod(m, r);
                } else if (shape.equals("disc") || shape.equals("Disc") || shape.equals("Circular Disc")) {
                        momentCM = MI_cirDisc(m, r);
                } else if (shape.equals("cylinder") || shape.equals("Cylinder")) {
                        momentCM = MI_Cylinder(m, r);
                } else {
                        System.out.println("Shape not recognized");
                        return;
                }
                parallel_axis = momentCM + (m * d * d)/2;
                return parallel_axis;
        }
                    
