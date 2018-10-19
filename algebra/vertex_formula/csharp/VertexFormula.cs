using System;

namespace csharp
{
    class VertexFormula
    {
        public static Tuple<double, double> GetVertex(Tuple<double, double> termA, Tuple<double, double> termB, Tuple<double, double> termC)
        {
            if (termA.Item1 == 0)
            {
                throw new Exception("Cannot divide by zero in GetVertex function. Term A must contain a non-zero number");
            }
            else
            {
                // First calculate the vertex point
                var vertexPoint = (-1 * termB.Item1) / (termA.Item1 * 2);

                // Plug the vertexPoint into the formula to retrieve the Y-coordinate
                var yCord = Math.Pow(termA.Item1 * vertexPoint, termA.Item2) + Math.Pow(termB.Item1 * vertexPoint, termB.Item2) + termC.Item1;

                return Tuple.Create(vertexPoint, yCord);
            }
        }
    }
}
