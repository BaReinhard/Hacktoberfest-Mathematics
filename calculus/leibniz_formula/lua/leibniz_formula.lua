-- Estimation of pi using the Leibniz formula for pi.
function pi(terms)
    local output = 0

    for i = 0, terms do
        output = output + (-1)^i / (2*i + 1)
    end

    return output * 4
end