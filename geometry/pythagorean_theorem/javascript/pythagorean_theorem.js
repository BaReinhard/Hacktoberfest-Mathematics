
/**
 * Validates pythagorean trigonometric identity
 * @param {number} a side a
 * @param {number} b side b
 * @param {number} c hypotenuse
 */
function pythagoreanValidator( a, b, c ) {
    return a * a + b * b  === c * c;
}

/**
 * Retrieves the hypotenuse, given two sides of the right triangle
 * @param {*} a side a
 * @param {*} b side b
 */
function retrieveHypotenuse( a, b ) {
    return Math.sqrt( a * a + b * b );
}
