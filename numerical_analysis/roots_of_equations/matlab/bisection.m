%% Bisection Method for finding zeros of a function

%% Function definition
%%f=@(x) x^3+2*x^2-3*x-1;

f = @(x) x^3 - 3*x^2 + x - 3;
a=0;  b=4
%% Stopping critera
TOL = 10^(-8);
Nmax = floor ( log((b-a)/TOL) / log(2) ) + 1
pvalues=zeros(Nmax,1);                              %% This command generates array of size Nmax*1

%% Main loop i.e. Iteration Scheme
for i = 1 : Nmax
    p = (a+b)/2;
	pvalues(i)=p;                                %% This array would be used to plot the error.
    
    sfa = f(a);
    sfp = f(p);
    
    fprintf( '\t\t %3d \t (%.6f,%.6f) \t %.10f \n', i, a, b, p)
	if ( (b-a)<2*TOL || sfp == 0 ) 
	   break
	elseif ( sfa * sfp < 0 )
	   b = p;
	else
	   a = p;
	   sfa = sfp;
    end
end

%% Absolute Error computation
plast =p;
errors=pvalues-plast*ones(Nmax,1);
fprintf('Approximate value |  Absolute Error\n\n')
fprintf(' %.10f     |  %.10f\n',[pvalues errors]');

plot(errors);
title('Absolute error e_n')