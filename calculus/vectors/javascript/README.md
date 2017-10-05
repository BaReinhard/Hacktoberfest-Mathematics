# Vector calculus in JavaScript

A collection of common vector operations written in JavaScript. All of these functions are curried (where applicable).

Tuple arrays (`[a,b]`) and triple arrays (`[a,b,c]`) are used to represent vectors when a vector is accepted as a parameter or returned as a result.


## Examples

### magnitude (magnitude.js)
```javascript
magnitude([1, 28, 76])
// 81
```

### dotProduct (dot-product.js)
```javascript
dotProduct([1, 3, -5])([4, -2, -1])
// 3
```

### crossProduct (cross-product.js)
```javascript
crossProduct([-3,4,1])([2,1,-1])
// [-5, -1, -11]
crossProduct([2,1,-1])([-3,4,1])
// [5, 1, 11]
```

### angleBetween (angle-between.js)
```javascript
angleBetween([1,0])([-1,0])
// 3.141592653589793
```

### areParallel (are-parallel.js)
```javascript
areParallel([1,1,1])([-1,-1,-1])
// true
areParallel([1,1,1])([-1,-1,-2])
// false
```



