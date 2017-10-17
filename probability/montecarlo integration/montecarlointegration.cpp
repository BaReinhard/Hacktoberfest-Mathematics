#include <functional>
#include <iostream>
#include <chrono>
#include <random>
#include <cmath>
using namespace std;

//Montecarlo Estimation of a 1d function within [a,b] with T estimates.
//And they said throwing coins at things never solved anything...
//To compile: g++ -std=c++14 -o main montecarlointegration.cpp
//gionuno

double montecarlointegral(const std::function<double(double)> & f,double a,double b,int T=100000)
{
	unsigned seed = std::chrono::system_clock::now().time_since_epoch().count();
	std::default_random_engine gen(seed);
    std::uniform_real_distribution<double> dist(a,b);

	double V = b-a;
	double I = 0.0;
	for(int t=0;t<T;t++)
	{
		double xt = dist(gen);
		I += f(xt)/T;
	}
	return I*V; 
}

int main()
{
	cout.precision(17);
	cout << "pi approx " << fixed << 2.0*montecarlointegral([](double x)->double{ return sqrt(1.0-x*x);},-1.0,1.0) << endl;
	return 0;
}
