# LANGUAGE: R
# ENV: R Studio
# AUTHOR: Aniket
# GITHUB: https://github.com/AniketRoy
# Plot sigmoid function in R


# Sigmoid Function
sigmoid = function(x) {
   1 / (1 + exp(-x))
}

# Input Data Set
# Here data is from -5 to 5 with interval of 0.01
x <- seq(-5, 5, 0.01)


# Ploting sigmoid of input data
plot(x, sigmoid(x), col='blue')