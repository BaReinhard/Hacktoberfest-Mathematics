%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
%%%                   Muller's Method                             %%%  
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

clc;
clear;
close all;

%% Function Definition and Initial Conditions

%%f = @ (x) 2*x^4-3*x^2+3*x-4;
f = @(x) x^3 - 3*x^2 +x-3;
%x1 = f(16);
%disp(x1);
p0 = 1;
p1 = 0.5;
p2 = 1;

TOL = 10^-8;
N0 = 100;

format long;

h1 = p1 - p0;
h2 = p2 - p1;
DELTA1 = (f(p1) - f(p0))/h1;
DELTA2 = (f(p2) - f(p1))/h2;
d = (DELTA2 - DELTA1)/(h2 + h1);
i=3;

%% Main loop i.e. Iteration Scheme

while i <= N0
      b = DELTA2 + h2*d;
      D = (b^2 - 4*f(p2)*d)^(1/2);
      if abs(b-D) < abs(b+D)
          E = b + D;
      else
          E = b - D;
      end
      h = -2*f(p2)/E;
      p = p2 + h;
      
      fprintf('\t\t %3d \t %.4f \n', i, p )
      if abs(h) < TOL
          p
          disp(p);
          break
      end
      
      p0 = p1;
      p1 = p2;
      p2 = p;
      h1 = p1 - p0;
      h2 = p2 - p1;
      DELTA1 = (f(p1) - f(p0))/h1;
      DELTA2 = (f(p2) - f(p1))/h2;
      d = (DELTA2 - DELTA1)/(h2 + h1);
      i = i + 1;
end

%% Terminal Condition

if i > N0
      formatSpec = string('The method failed after N0 iterations,N0= %d \n');
      fprintf(formatSpec,N0);
end
