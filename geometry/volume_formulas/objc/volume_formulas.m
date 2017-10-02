- (CGFloat)cubeVolumeWithSide:(CGFloat)side {
    return pow(side, 3.0);
}

- (CGFloat)rightRectangularPrismVolumeWithLength:(CGFloat)length width:(CGFloat)width height:(CGFloat)height {
    return length * width * height;
}

- (CGFloat)coneVolumeWithBaseRadius:(CGFloat)radius height:(CGFloat)height {
    CGFloat baseArea = M_PI * pow(radius, 2.0);
    return height * baseArea / 3.0;
}

- (CGFloat)cylinderVolumeWithBaseRadius:(CGFloat)radius height:(CGFloat)height {
    CGFloat baseArea = M_PI * pow(radius, 2.0);
    return height * baseArea;
}

- (CGFloat)sphereVolumeWithRadius:(CGFloat)radius {
    return (4.0 / 3.0) * M_PI * pow(radius, 3.0);
}
