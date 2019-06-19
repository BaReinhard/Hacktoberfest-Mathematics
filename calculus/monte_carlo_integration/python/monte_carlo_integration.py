#!/usr/bin/env python

"""
Provides a function to approximate a definite integral using a Monte Carlo method.
This isn't the most efficient way to calculate 1D integrals but it's invaluable
in more dimensions
"""

__author__ = "iordan93"
__version__ = "1.0.0"

import numpy as np


def integrate(f, x_min, x_max, num_points=10000):
    """
    Calculates an approximation to the definite integral of f(x) between x_min and x_max

    Args:
        f (function): Mathematical function of one variable
        x_min (float): The starting x-value for the integration
        x_max (float): The ending x-value for the integration
        y_min (float): The starting y-value for the integration
        y_max (float): The ending y-value for the integration
        num_steps (int): The number of points to generate between x_min and x_max. 
            Defaults to 10 000. Bigger is better, but also slower

    Returns:
        float: The numerical approximation of the definite integral
    """
    if x_max <= x_min:
        raise ValueError("x_max should be greater than x_min")

    x = np.random.uniform(x_min, x_max, size=num_points)
    y_hat = f(x)
    y_min, y_max = y_hat.min(), y_hat.max()
    y = np.random.uniform(y_min, y_max, size=num_points)

    # The integral represents "oriented area": positive if the function
    #  is positive and negative otherwise
    pos_area = (np.abs(y) <= np.abs(y_hat)) & (
        y_hat > 0) & (y > 0) & (y <= y_hat)
    neg_area = (np.abs(y) <= np.abs(y_hat)) & (
        y_hat < 0) & (y < 0) & (y >= y_hat)
    rect_area = (x_max - x_min) * (y_max - y_min)
    return rect_area * (len(y[pos_area]) - len(y[neg_area])) / num_points


if __name__ == "__main__":
    # Some tests
    assert(np.isclose(integrate(
        np.sin,
        0, 2 * np.pi, 500000), 0, rtol=0, atol=0.1))
    assert(np.isclose(integrate(
        lambda x: np.sin(x ** 2),
        0, 1, 500000), 0.31, rtol=0, atol=0.1))
