function calculateMean(population) {
    let sum = 0;

    for(let data of population){
        sum += data;
    }
 
    return sum / population.length;
}

function calculateSD(population) {
    let mean = calculateMean(population);

    let sumSquaredError = 0;
    for(let data of population){
        sumSquaredError += (data - mean) ** 2
    }

    return Math.sqrt(sumSquaredError / population.length);
}
