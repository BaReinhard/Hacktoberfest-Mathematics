f = [1]

for i in range(1, 100): f.append(i * f[i-1])

# factorials[x] returns x!

def pathways(w, h):
    """
    Returns the number of possible ways to navigate from the bottom-left corner 
    to the top-right corner of a grid constructed w x h squares. w + h < 100
    """
    return f[w+h]/(f[w]*f[h])

assert pathways(3, 2) == 10
assert pathways(2, 3) == 10
assert pathways(6, 9) == 5005
assert pathways(5, 7) == 792
