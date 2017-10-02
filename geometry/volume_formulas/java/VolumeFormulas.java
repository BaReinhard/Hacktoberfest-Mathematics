public class VolumeFormulas {

    public double getConeVolume(float radius, double height) {
        return (Math.PI*height*(radius*2))/3;
    }

    public double getCubeVolume(double edgeLenght) {
        return edgeLenght*3;
    }

    public double getCuboidVolume(double width, double lenght, double height) {
        return width*lenght*height;
    }

    public double getCylinderVolume(float radius, double height) {
        return Math.PI*height*(radius*2);
    }

    public double getPyramidVolume(double width, double lenght, double height) {
        return (width*lenght*height)/3;
    }

    public double getSphereVolume(float radius) {
        return ( 4.0 / 3.0 ) * Math.PI * Math.pow( sphereRadius, 3 );
    }


}
