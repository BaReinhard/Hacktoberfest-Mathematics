import scipy.stats as st
import math

def populationMeanConfidenceInterval(mean, stDev, numSamples, confLevel):
    """ Calculates the confidence interval for the population mean given
        a mean,
        population (not sample) standard deviation,
        number of samples,
        and confidence level.

        The confidence interval should give you an estimate of where the population mean will be
        with a certain amount of confidence that you have supplied.
    """
    z_value = st.norm.ppf(1-(1-confLevel)/2)
    interval = z_value * (stDev/(math.sqrt(numSamples)))
    confInterval = (mean - interval, mean + interval)

    return confInterval

def populationProportionConfidenceInterval(proportion, numSamples, confLevel):
    """ Calculates the confidence interval for the population proportion given
        a sample proportion
        and confidence level.

        The confidence interval should give you an estimate of where the population proportion will be
        with a certain amount of confidence that you have supplied.
    """
    z_value = st.norm.ppf(1-(1-confLevel)/2)
    interval = z_value * math.sqrt((proportion * (1-proportion)) / numSamples)
    confInterval = (proportion - interval, proportion + interval)

    return confInterval
