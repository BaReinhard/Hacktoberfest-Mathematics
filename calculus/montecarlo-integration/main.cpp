#include <cmath>
#include <cstdlib>
#include <ctime>
#include <iomanip>
#include <iostream>

using namespace std;

double int_mc1(double (*)(double), double&, double, double, int);
double f(double);

int main() {
    double a, b, mc, errest;
    int i, n;
    int ntimes;
    const double pi = 3.1415926;

    cout.precision(6);
    cout.setf(ios::fixed | ios::showpoint);

    /* initial information */
    cout << "Please enter a: ";
    cin >> a;  // left endpoint
    cout << "Please enter b: ";
    cin >> b;  // right endpoint
    cout << "Please enter n: ";
    cin >> n;  // number of rectangles

    ntimes = 16;  // number of interval doublings with nmax=2^ntimes

    cout << "    Points    "
         << "Integral   "
         << " error" << endl;

    /* step 2: integration for various number of random points */
    for (i = 0; i <= ntimes; i = i + 1) {
        mc = int_mc1(f, errest, a, b, n);

        cout << setw(10) << n << setw(12) << mc << setw(12) << errest << endl;

        n = n * 2;
    }

    system("pause");
    return 0;
}

/*
 *  Function for integration
 */
double f(double x) {
    const double pi = 3.1415926;
    double y;
    // NOTE: THIS PROGRAM WILL USE SINX AS THE DEFAULT FUNCTION. CHANGE THE Y
    // VARIABLE TO THE FUNCTION YOU NEED. This does not parse functions inputed
    // by the user.,
    y = sin(x);
    // y = cos(x);
    //    y = x*x;
    //    y = 2.0*sqrt(x)/((x+1.0)*(x+1.0));
    //    y = 0.2/(pow((x-6.0),2.0) + 0.02);
    //    y = x*cos(10.0*pow(x,2.0))/(pow(x,2.0) + 1.0);
    //    y = sqrt(x)/(x*x + 1.0);
    // y = sin(pi*x*x)/((x-pi)*(x-pi)+1);
    return y;
}
double int_mc1(double (*f)(double), double& errest, double a, double b, int n) {
    double r, x, u, f2s, fs;
    /* variables fs and f2s are used to estimate an error of integration */

    srand(time(NULL)); /* initial seed value (use system time) */

    fs = 0.0;
    f2s = 0.0;

    for (int i = 1; i <= n; i = i + 1) {
        u = 1.0 * rand() /
            (RAND_MAX + 1); /* random number between 0.0 and 1.0 */
        x = a + (b - a) * u;
        fs = fs + f(x);
        f2s = f2s + f(x) * f(x);
    }
    r = fs * (b - a) / n;
    /* evaluate integration error */
    fs = fs / n;
    f2s = f2s / n;
    errest = (b - a) * sqrt((f2s - fs * fs) / n);
    return r;
}
