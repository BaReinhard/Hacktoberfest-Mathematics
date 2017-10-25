function y = newton ( f, x0, TOL, Nmax )%NEWTON        approximate the root of an arbitrary function using Newton's%              method%%     calling sequences:%             y = newton ( @f, x0, TOL, Nmax )%             newton ( @f, x0, TOL, Nmax )%%     inputs:%             f       string containing name of m-file defining both the%                     function whose root is to be determined and it's%                     first derivative; m-file should return function%                     value and first derivative value, in that order%             x0      initial approximation to location of root%             TOL     absolute error convergence tolerance%             NMax    maximum number of iterations to be performed%%     output:%             y       approximate value of root%%     NOTE:%             if NEWTON is called with no output arguments, the %             iteration number and the current approximation to the %             root are displayed%%             if the maximum number of iterations is exceeded, a message%             to this effect will be displayed and the most recent%             approximation will be returned in the output value%for i = 1 : Nmax    [fx0, fpx0] = f(x0);	dx = fx0 / fpx0;    x0 = x0 - dx;		if ( nargout == 0 )	   fprintf ( '\t\t %3d \t %.16f \n', i, x0 )	end		if ( abs(dx) < TOL ) 	   if ( nargout > 0 )	      y = x0;	   end	   return	endenddisp('Maximum number of iterations exceeded')if ( nargout > 0 ) y = x0; end