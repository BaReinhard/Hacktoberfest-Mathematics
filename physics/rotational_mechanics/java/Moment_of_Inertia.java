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
       
