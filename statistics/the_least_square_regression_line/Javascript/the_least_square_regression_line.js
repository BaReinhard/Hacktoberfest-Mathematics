function calculateSum(array){
    let sum = 0;

    for(let number of array) {
        sum += number;
    }

    return sum;
}

function calculateSumOfSquared(array) {
    let sum = 0;

    for(let number of array) {
        sum += number ** 2;
    }

    return sum;
}


function calcRegressionLine(independentX, dependentY) {
    let dataSize = independentX.length;
    let sumOfX = calculateSum(independentX);
    let sumOfY = calculateSum(dependentY);
    let sumOfX2 = calculateSumOfSquared(independentX);
    let sumoOfY2 = calculateSumOfSquared(dependentY);
    let sumOfXY = 0;

    for(let index in independentX){
        sumOfXY += independentX[index] * dependentY[index];
    }

    // Calculate Gradient of The Line
    let gradient = (dataSize * sumOfXY - sumOfX * sumOfY) / (dataSize * sumOfX2 - sumOfX ** 2);
    let yIntercept = (sumOfY / dataSize) - (gradient)*(sumOfX/dataSize);

    return (xValue) => {
        return yIntercept + gradient * xValue;
    }
}

let sampleX = [1, 1.2, 1.5, 2, 2.4, 2.6, 3.4, 4.2];
let sampleY = [3, 4, 3, 6, 5, 7, 8, 10];

let regressionLine = calcRegressionLine(sampleX, sampleY);
console.log(regressionLine(4))