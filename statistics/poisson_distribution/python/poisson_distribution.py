from math import exp, factorial


# Probability of observing k events in an interval
# The average number of events in an interval is given by "frequency"
def probability_of_k(frequency, k):
    return pow(frequency, k)*exp(-frequency)/factorial(k)


# Return the poisson distribution from a given frequency (event rate)
def poisson_distribution(frequency, start=0, end=10, as_dict=False):
    if as_dict:
        result = dict()
        for k in range(start, end+1):
            result[k] = probability_of_k(frequency, k)
        return result
    else:
        result = list()
        for k in range(start, end+1):
            result.append(probability_of_k(frequency, k))
        return result
