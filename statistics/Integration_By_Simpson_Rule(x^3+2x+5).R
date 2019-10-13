f=function(x) 
{
    return(x^3+2*x+5)
}
Simp=function(a,b,n) 
{
    h=(b-a)/n
    S=f(a)+f(b) 
    for(i in 1:n-1)
    {
        if((i%2)==0)
            S=S+2*f(a+i*h)
        else
            S=S+4*f(a+i*h)
    }       
    I=(h/3)*S
    return(I)
} 
n=as.integer(readline(prompt="Enter no. of subintervals:")) 
a=as.integer(readline(prompt="Enter lower limit:")) 
b=as.integer(readline(prompt="Enter upper limit:")) 
cat(paste("The value of the given integration is",Simp(a,b,n))) 

    
