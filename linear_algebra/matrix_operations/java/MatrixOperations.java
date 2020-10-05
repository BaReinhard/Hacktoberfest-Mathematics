package utils;

/**
 * Created by OMKAR JADHAV on 9/3/2017.
 * Copy code, make changes and have fun.
 */

public class MatrixOperations {

    /**
     * Find determinant of a square matrix of size NxN.
     * This algorithm uses recursion. Recurrence relation: T(N) = N*T(N - 1) + N^3. And its damn expensive.
     * @param arr Matrix
     * @param n Dimensions of square matrix.
     * @return
     */
    public static int determinant(int[][] arr, int n) {
        //Base case
        if ( n == 1 ) {
            return arr[0][0];
        }
        if ( n == 2 ){
            return arr[0][0]*arr[1][1] - arr[0][1]*arr[1][0];
        }

        int deter = 0;
        for ( int i = 0 ; i < n ; i++ ) {
            int[][] tmpMatrix = new int[n - 1 ][n - 1];
            int x = 0, y  = 0;
            //Construct new matrix
            for ( int j = 1 ; j < n ; j++ ) {
                for ( int k = 0 ; k < n; k++ ) {
                    if ( k == i )
                        continue;
                    tmpMatrix[ x ][ y ] = arr[ j ][ k ];
                    y = (y + 1) % (n - 1);
                    if ( y == 0 )
                        x++;
                }
            }
            int sign = i % 2 == 1 ? -1 : 1;
            deter += sign * arr[0][i] * determinant( tmpMatrix, n - 1 );
        }
        return deter;
    }

    public static int[][] findCofactorMatrix(int[][] arr) {

        int N = arr.length;
        if ( N != arr[0].length ) {
            throw new RuntimeException( "Error: Matrix is not valid" );
        }

        int[][] cofactor = new int[ N ][ N ];

        for ( int i = 0 ; i < N; i++ ) {
            for ( int j = 0 ; j < N; j++ ) {
                int x = 0, y = 0;
                int[][] m_cofactor = new int[ N - 1] [ N - 1];
                for ( int m = 0 ; m < N; m++ ) {
                    for ( int n = 0 ; n <  N; n++ ) {
                        if ( m == i || n == j ){
                            continue;
                        }
                        m_cofactor[ x ][ y ] = arr[ m ][ n ];
                        y = (y + 1) % ( N - 1);
                        if ( y == 0 ) {
                            x += 1;
                        }
                    }
                }
                cofactor[i][j] = ((i + j) % 2 == 0 ? 1 : -1) * determinant( m_cofactor, N - 1 );
            }
        }
        return cofactor;
    }

    public static int[][] transpose(int[][] arr ) {
        int N = arr.length;
        int[][] t_matrix  = new int[N][N];
        for ( int i = 0 ; i < N; i++ ) {
            for ( int j = 0 ; j < N; j++ ) {
               t_matrix[i][j] = arr[j][i];
            }
        }
        return t_matrix;
    }

    public static double[][] findInverse(int[][] arr ) {
        if ( arr.length != arr[0].length) {
            throw new RuntimeException( "Invalid matrix" );
        }
        int N = arr.length;
        double[][] res = new double[ N ][ N ];
        int[][] tMatrix = transpose( findCofactorMatrix( arr ) ) ;

        double deter = determinant( arr, N );
        for ( int i = 0 ; i < N ; i++ ) {
            for ( int j = 0 ; j < N; j++ ) {
                res[ i ][ j ] = tMatrix[ i ][ j ] / deter;
            }
        }
        return res;
    }


    public static void main( String[] args ) {
        int arr[][] = { {4, 7}, {2, 6}};
        int[][] co = findCofactorMatrix( arr );
        for ( int i = 0 ; i < co.length ; i++ ) {
            for ( int j = 0 ; j < co.length ; j++ ) {
                System.out.print(co[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
