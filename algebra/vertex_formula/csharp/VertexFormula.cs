using System;

namespace csharp
{
    class VertexFormula
    {
        public static double GetVertex(double termA = 0.0, double termB = 0.0, double termC = 0.0)
        {
            if(termA == 0.0 | termB == 0.0)
                return 0.0;
            else
                return (-1 * termB) / (2 * termA);
        }
    }
}
