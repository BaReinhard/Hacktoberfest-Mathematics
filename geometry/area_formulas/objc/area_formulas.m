- (CGFloat)rectangleAreaWithBase:(CGFloat)base height:(CGFloat)height {
    return base * height;
}

- (CGFloat)squareAreaWithSide:(CGFloat)side {
    return pow(side, 2.0);
}

- (CGFloat)triangleAreaWithBase:(CGFloat)base height:(CGFloat)height {
    return (base * height) / 2.0;
}

- (CGFloat)triangleAreaWithSideA:(CGFloat)sideA sideB:(CGFloat)sideB sideC:(CGFloat)sideC {
    CGFloat s = (sideA + sideB + sideC) / 2.0;
    return sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
}

- (CGFloat)trapezoidAreaWithBaseOne:(CGFloat)baseOne baseTwo:(CGFloat)baseTwo height:(CGFloat)height {
    return ((baseOne + baseTwo) / 2.0) * height;
}

- (CGFloat)ellipseAreaWithAxisA:(CGFloat)axisA axisB:(CGFloat)axisB {
    return M_PI * axisA * axisB;
}

- (CGFloat)circleAreaWithRadius:(CGFloat)radius {
    return M_PI * pow(radius, 2.0);
}
