#include<iostream>
#include<cmath>
#include<fstream>
using namespace std;
ofstream output("out.dat");
class RDCY
{
	int i,p,d,gd,n;
	float dcp,dcd,h,t,a,b,num,ran,l;
	public:
	float Rnd()
	{
		a=l*99;
		b=a/10000;
		num=int(b);
		ran=b-num;
		l=ran*10000;
		return ran;
	}
void getdata();
void cal();
};

void RDCY::getdata()
{
cout<<"enter the seed value"<<endl;
cin>>l;
cout<<"enter the no. of parent nuclei"<<endl;
cin>>p;
cout<<"enter the no. of daughter nuclei"<<endl;
cin>>d;
gd=0;
cout<<"enter the decay constant for parent nuclei"<<endl;
cin>>dcp;
cout<<"enter the decay constant for daughter nuclei"<<endl;
cin>>dcd;
cout<<"enter the time step"<<endl;
cin>>h;
t=0;
cout<<"enter the no. of time steps"<<endl;
cin>>n;
}

void RDCY::cal()
{
	for(t=0;t<n;t=t+h) 
	{
		output<<t<<"\t"<<p<<"\t"<<d<<"\t"<<gd<<endl;
		for(int i=0;i<p;i++) 
		{
			float x=Rnd();
			if(x<=dcp)
			{
				p=p-1;
				d=d+1;
			}
		}
		for(int i=0;i<d;i++) 
		{
			float x=Rnd();
			if(x<=dcd)
			{
				d=d-1;
				gd=gd+1;
			}
		}
	}
}
int main()
{
class RDCY R;
R.getdata();
R.cal();
return 0;
}
