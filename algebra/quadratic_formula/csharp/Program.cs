using System;
using System.Numerics;
using System.Collections.Generic;

namespace CSharpQuadratic
{
    class Program
    {
        static void Main(string[] args)
        {
            var roots = QuadraticFormula(1, -6, 9);
            Console.WriteLine("x^2 + 6x + 9");
            foreach (var root in roots)
            {
                Console.WriteLine(string.Format(new ComplexFormatter(), "{0:I}", root));
            }

            Console.WriteLine();
            roots = QuadraticFormula(5, 6, 1);
            Console.WriteLine("5x^2 + 6x + 1");
            foreach (var root in roots)
            {
                Console.WriteLine(string.Format(new ComplexFormatter(), "{0:I}", root));
            }

            Console.WriteLine();
            roots = QuadraticFormula(5, 2, 1);
            Console.WriteLine("5x^2 + 2x + 1");
            foreach (var root in roots)
            {
                Console.WriteLine(string.Format(new ComplexFormatter(), "{0:I}", root));
            }
        }

        public static List<Complex> QuadraticFormula(double a, double b, double c)
        {
            List<Complex> result = new List<Complex>();

            double discriminant = b * b - 4 * a * c;

            // Two real roots
            if (discriminant > 0)
            {
                Complex root1 = (-b + Math.Sqrt(discriminant)) / (2 * a);
                result.Add(root1);
                Complex root2 = (-b - Math.Sqrt(discriminant)) / (2 * a);
                result.Add(root2);
            }
            // One real root
            else if (discriminant == 0)
            {
                Complex root1 = (-b + Math.Sqrt(discriminant)) / (2 * a);
                result.Add(root1);
            }
            // Two complex roots
            else
            {
                Complex root1 = new Complex(-b / (2 * a), Math.Sqrt(-discriminant) / (2 * a));
                result.Add(root1);
                Complex root2 = new Complex(-b / (2 * a), -Math.Sqrt(-discriminant) / (2 * a));
                result.Add(root2);
            }

            return result;
        }

        public class ComplexFormatter : IFormatProvider, ICustomFormatter
        {
            public string Format(string format, object arg, IFormatProvider formatProvider)
            {
                if (arg is Complex number)
                {
                    int precision;
                    string formatString = String.Empty;

                    if (format.Length > 1)
                    {
                        try
                        {
                            precision = int.Parse(format.Substring(1));
                        }
                        catch (FormatException)
                        {
                            precision = 0;
                        }
                        formatString = $"N{precision.ToString()}";
                    }

                    if (format.Substring(0, 1).Equals("I", StringComparison.OrdinalIgnoreCase))
                    {
                        if (number.Imaginary == 0)
                        {
                            return number.Real.ToString(formatString);
                        }
                        else
                        {
                            return number.Real.ToString(formatString) + " + " + number.Imaginary.ToString(formatString) + "i";
                        }
                    }
                    else
                    {
                        return number.ToString(format, formatProvider);
                    }
                }
                else
                {
                    if (arg is IFormattable)
                    {
                        return ((IFormattable)arg).ToString(format, formatProvider);
                    }
                    else if (arg != null)
                    {
                        return arg.ToString();
                    }
                    else
                    {
                        return string.Empty;
                    }
                }
            }

            public object GetFormat(Type formatType)
            {
                if (formatType == typeof(ICustomFormatter))
                {
                    return this;
                }
                else
                {
                    return null;
                }
            }
        }
    }
}
