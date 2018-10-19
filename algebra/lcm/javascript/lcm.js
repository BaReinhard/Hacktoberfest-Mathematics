/*
    Function to find the lcm of two numbers using javascript.
*/

function lcm (a, b)
{
    var m , n ;
    m = a;
    n = b;

    while(m!=n)
    {
	if(m < n) m = m + a;
	
	else n = n + b;
    }

    return m ;    
}