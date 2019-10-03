function calcStraightLine (startCoordinates, endCoordinates) {
    let coordinatesArray = new Array();
    // Translate coordinates
    let x1 = startCoordinates.left;
    let y1 = startCoordinates.top;
    let x2 = endCoordinates.left;
    let y2 = endCoordinates.top;
    // Define differences and error check
    let dx = Math.abs(x2 - x1);
    let dy = Math.abs(y2 - y1);
    let sx = (x1 < x2) ? 1 : -1;
    let sy = (y1 < y2) ? 1 : -1;
    let err = dx - dy;
    // Set first coordinates
    coordinatesArray.push(new Coordinates(y1, x1));
    // Main loop
    while (!((x1 == x2) && (y1 == y2))) {
        let e2 = err << 1;
        if (e2 > -dy) {
            err -= dy;
            x1 += sx;
        }
        if (e2 < dx) {
            err += dx;
            y1 += sy;
        }
        // Set coordinates
        coordinatesArray.push(new Coordinates(y1, x1));
    }
    // Return the result
    return coordinatesArray;
}