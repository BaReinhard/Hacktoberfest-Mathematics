__author__ = 'Yash Mittra'


def mean(numbers):
    return float(sum(numbers)) / max(len(numbers), 1)

print(mean([78, 80]))
