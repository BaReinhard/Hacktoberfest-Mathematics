function y = bisection(f, a , b, TOL)

sfa = sign(f(a));
sfb = sign(f(b));
if(sfa == sfb)
    disp("endpoint function values don't have opposite signs")
    return
end

if nargin < 4
    TOL = eps;
end

while (b-a) >= 2 * TOL
    p = a + (b-a)/2.0;
    sfp = sign(f(p));
    
    if sfp == 0
        break
    elseif (sfa * sfp < 0)
        b = p;
    else
        a = p;
        sfa = sfp;
    end
end

y = p;
end