import java.util.Arrays;


/**
 * Example implementation of some vector operations. These operations should be implemented in a class
 * representing a vector (not to be confused with java.util.Vector which is a synchorinized ArrayList).
 */
public class VectorOperations
{

  /**
   * Just to see something.
   *
   * @param args ignored
   */
  public static void main(String[] args)
  {
    System.out.println("Eucledian norm of (1,2,3): " + vectorLength(1, 2, 3));
  }

  /**
   * Returns the Euclidian norm of given vector.
   *
   * @param vector
   * @return 'length' of the vector.
   */
  public static double vectorLength(double... vector)
  {
    return Math.sqrt(Arrays.stream(vector).map(v -> v * v).sum());
  }

  /**
   * @param number
   * @param vector
   * @return scalar product of vector and number
   */
  public static double[] scalarProduct(double number, double... vector)
  {
    double[] result = Arrays.copyOf(vector, vector.length);
    for ( int i = 0 ; i < result.length ; i++ )
    {
      result[i] *= number;
    }
    return result;
  }

  /**
   * Returns the sum of two vectors.
   * 
   * @param vector1
   * @param vector2
   * @return direct sum
   */
  public static double[] vectorSum(double[] vector1, double[] vector2)
  {
    if (vector1.length != vector2.length)
    {
      throw new IllegalArgumentException("Dimensions of vectors do not match!");
    }

    double[] sumVector = new double[vector1.length];
    for ( int i = 0 ; i < vector1.length ; i++ )
    {
      sumVector[i] = vector1[i] + vector2[i];
    }
    return sumVector;
  }

  /**
   * Returns the difference of two vectors.
   *
   * @param a
   * @param b
   * @return difference vector
   */
  public static double[] minus(double[] a, double[] b)
  {
    return vectorSum(a, scalarProduct(-1, b));
  }

  /**
   * @param vector1
   * @param vector2
   * @return inner product of given vectors
   */
  public static double dotProduct(double[] vector1, double[] vector2)
  {
    if (vector1.length != vector2.length)
    {
      throw new IllegalArgumentException("Dimensions of vectors do not match!");
    }

    double product = 0.0;
    for ( int i = 0 ; i < vector1.length ; i++ )
    {
      product += vector1[i] * vector2[i];
    }
    return product;
  }

  /**
   * Return the cross product which is defined only for 3-dimensional vectors.
   *
   * @param a
   * @param b
   * @return vector orthogonal to given ones of length (read a math book yourself)
   */
  public static double[] crossProduct(double[] a, double[] b)
  {
    if (a.length != 3 || b.length != 3)
    {
      throw new IllegalArgumentException("Dimensions of vector(s) not supported!");
    }
    return new double[]{a[2] * b[3] - a[3] * b[2], a[3] * b[1] - a[1] * b[3], a[1] * b[2] - a[2] * b[1]};
  }

}
