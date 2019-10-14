using System;

namespace ConsoleApp
{
    public class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter the mass: ");
            var inputMass = Console.ReadLine();
            Console.WriteLine("Enter the velocity to light speed: ");
            var inputVelToLightSpeed = Console.ReadLine();

            if (double.TryParse(inputMass, out double mass) && double.TryParse(inputVelToLightSpeed, out double velToLightSpeed))
            {
                Console.WriteLine("Relativistic Mass : " + RelativisticMass(Convert.ToDouble(mass), Convert.ToDouble(velToLightSpeed)));
            }
            else
            {
                Console.WriteLine("Please enter numeric or float value.");
            }
            Console.ReadLine();
        }

        static double RelativisticMass(double mass, double velToLightSpeed)
        {
            double relMass = 0.0;
            if (velToLightSpeed < 1)
            {
                relMass = mass / (Math.Sqrt(1 - (Math.Pow(velToLightSpeed, 2.0))));
            }
            else
            {
                Console.WriteLine("You cannot travel faster than light!");
            }

            return relMass;
        }
    }
}
0 comments on commit 5d0da2e
