import scipy.stats as st
import math

def populationMeanConfidenceInterval(mean, stDev, numSamples, confLevel):
    """ Calculates the confidence interval for a mean,
        population (not sample) standard deviation,
        number of samples,
        and confidence level.
    """
    z_value = st.norm.ppf(1-(1-confLevel)/2)
    interval = z_value * (stDev/(math.sqrt(numSamples)))
    confInterval = (mean - interval, mean + interval)

    return confInterval
