'''
Reference: https://en.wikipedia.org/wiki/Entropy_(information_theory)

"Information entropy is defined as the average amount of information produced by a probabilistic stochastic source of data."
'''

import numpy as np
from collections import Counter


def shannon_ent(prob_dist):
  
  #Normalize the given distribution to sum to 1
  if not sum(prob_dist)==1:
    prob_dist = prob_dist/float(sum(prob_dist))
    
  return -sum(prob_dist*np.log2(prob_dist))


#Define a set of illustrative examples
example_list = [[1],[5],[1,1,1,1],[0,1,0,1],[1,2,2,3,3,3],[1,2,3,4],[1,10,100,1000]]


for ex_input in example_list:
    
    probs = np.array(Counter(ex_input).values())/float(sum(Counter(ex_input).values()))
    
    print 'Input: ', ex_input
    print 'Output: ', (shannon_ent(probs))
    print