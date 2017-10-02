using System;

namespace csharp
{
    class VertexFormula
    {
        public static (double,double) GetVertex(double termA, double termB, double termC = 0.0)
        {
            if(termA == 0.0)
                throw new Exception("Divide by zero error. Cannot use zero for termA in GetVertex function");
            else
                return (((-1 * termB) / (2 * termA)),((4*termA*termC-termB*termB)/(4*termA)));
        }
    }
}
