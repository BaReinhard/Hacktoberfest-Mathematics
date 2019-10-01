function calculateMean(population) {
    let sum = 0;
    for(let data of population) {
        sum += data;
    }

    return sum / population.length;
}