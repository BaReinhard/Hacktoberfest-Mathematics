using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

/*
 * program in c sharp
 *
 * TYPE OF DATA USED - double
 * */

namespace arithmetic_operations
{
    class arithmetic
    {
        /// <summary>
        /// method +ve takes double value and return its +ve squareroot
        /// </summary>
        /// <param name="val"></param>
        /// <returns></returns>
        public double squareroot(double val)
        {
            return Math.Sqrt(val);   // Math is predefined static class with Sqrt as function
        }

        /// <summary>
        /// method takes double value and returns +ve cube root for +ve input and -ve cube root for -ve number
        /// </summary>
        /// <param name="val"></param>
        /// <returns></returns>
         public double cuberoot(double val)
        {
            double croot = Math.Pow(val, 1.0 / 3.0);
            if (val < 0)
            {
                return -croot;
            }
            else
            {
                return croot;
            }
        }

        /// <summary>
        /// method that will take a +ve double number and returns int value of sum of its digits
        /// </summary>
        /// <param name="val"></param>
        /// <returns></returns>
         public int digitsum(double val)
        {
            // local variable declararttion
            int dupli;
            int.TryParse(val.ToString(), out dupli);
            int sum = 0;

            // while will execute untill dupli is being processed on its values
            while (dupli != 0)
            {
                sum += dupli % 10;   // adding the last value to the previous value of sum
                dupli = dupli / 10;   // deleting the last value
            }
            return sum;   // returning the sum of digits
        }
    }
    // main class
    class Program
    {
        static void Main(string[] args)   // main function
        {
            double value = 169;   // a demo value initialize to a variable
            arithmetic arth = new arithmetic();  // declared the object of class arithmetic

            // printing of results goes here
            Console.WriteLine("{0} is used for demonstration", value);
            Console.WriteLine("square root {0}", arth.squareroot(value));
            Console.WriteLine("cube root {0}", arth.cuberoot(value));
            Console.WriteLine("sum of digits {0}", arth.digitsum(value));

            Console.ReadKey();   // used to pause the program
        }
    }
}
