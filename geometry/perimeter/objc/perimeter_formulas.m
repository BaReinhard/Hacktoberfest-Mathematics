- (CGFloat)squarePerimeterWithSide:(CGFloat)side {
    return 4 * side;
}

- (CGFloat)rectangelPerimeterWithLength:(CGFloat)length width:(CGFloat)width {
    return 2 * (length + width);
}

- (CGFloat)trianglePerimeterWithSideA:(CGFloat)sideA sideB:(CGFloat)sideB sideC:(CGFloat)sideC {
    return sideA + sideB + sideC;
}

- (CGFloat)rightTrianglePerimeterWithLegA:(CGFloat)legA legB:(CGFloat)legB {
    return legA + legB + sqrt(pow(legA, 2.0) + pow(legB, 2.0));
}

- (CGFloat)circlePerimeterWithRadius:(CGFloat)radius {
    return 2 * M_PI * radius;
}
