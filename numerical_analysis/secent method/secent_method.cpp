int SecantMethodForEquation(double& x, double x0, double x1)
{
    int n = 2;

    while( ( fabs(F(x1)) > error ) && ( n <= MAXITER ) )
    {
        x = x1 - (F(x1) * (x1 - x0)) / (F(x1) - F(x0));
        x0 = x1;
        x1 = x;

        n++;
    }

    return n;
}