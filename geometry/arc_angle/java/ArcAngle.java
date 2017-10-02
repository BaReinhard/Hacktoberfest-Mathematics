public class ArcAngle {

    /**
     * Will return arc angle
     * @param arc lenght
     * @param radius of circle
     * @return angle
     */
    public float getArcAngle(float arcLenght, float radius) {
        return (360*arcLenght)/(Math.PI*2*radius);
    }

}
