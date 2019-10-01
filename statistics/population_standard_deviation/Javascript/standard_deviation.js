function calculateMean(population) {
    let sum = 0;

    for(let data of population) {
        sum += data;
    }

    return sum / population.length;
}

function calculateSD(population){
    let mean = calculateMean(population);
    let sumSquareError = 0;

    for(let data of population){
        sumSquareError += (data - mean) ** 2;
    }

    return Math.sqrt(sumSquareError/ population.length);
}

let population = [-9, -7, -4, -1, 0, 2, 7, 9, 12]

console.log(calculateSD(population));