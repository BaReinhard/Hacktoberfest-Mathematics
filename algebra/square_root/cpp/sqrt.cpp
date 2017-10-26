#include<iostream>
 
float sqroot(float m)
{
    float i=0;
    float x1,x2;
    while( (i*i) <= m )
            i+=0.1;
    x1=i;
    for(int j=0;j<10;j++)
    {
        x2=m;
        x2/=x1;
        x2+=x1;
        x2/=2;
        x1=x2;
    }

    return x2;
}

int main()
{
	float a;
	cout<<endl<<"Enter number to calculate the sqrt:"<<endl;
	cin>>a;
	cout<<"The area of the triangle is "<< sqroot(a)<<endl;
	return 0;
}