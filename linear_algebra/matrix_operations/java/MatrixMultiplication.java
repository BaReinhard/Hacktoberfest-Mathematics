import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MatrixMultiplication
{
    public static void main(String[] args)
    {
        Map<Integer, List<Integer>> matrix1 = new HashMap<>();
        Map<Integer, List<Integer>> matrix2 = new HashMap<>();
        readMatrices(matrix1,1);
        readMatrices(matrix2,2);
        System.out.println("Matrix 1");
        printMatrix(matrix1);
        System.out.println("Matrix 2");
        printMatrix(matrix2);

        System.out.println("Product Matrix");
        printMatrix(multipyMatrices(matrix1, matrix2));

    }

    public static Map<Integer, List<Integer>> multipyMatrices(Map<Integer, List<Integer>> matrix1, Map<Integer, List<Integer>> matrix2)
    {
        Map<Integer, List<Integer>> resultMatrix = new HashMap<>();

        if (!matrix1.isEmpty() && !matrix2.isEmpty()
            && matrix1.get(0).size() == matrix2.keySet().size())
        {
            for (int matrix1Index : matrix1.keySet())
            {
                List<Integer> matrixProdList = new ArrayList<>();
                for(int j=0;j< matrix2.get(0).size();j++)
                {
                    int matrixProdVal = 0;
                    for (int matrix2Index : matrix2.keySet())
                    {
                        int matrix1Val = matrix1.get(matrix1Index).get(matrix2Index);
                        int matrix2Val = matrix2.get(matrix2Index).get(j);
                        matrixProdVal += matrix1Val * matrix2Val;
                    }
                    matrixProdList.add(matrixProdVal);
                }

                resultMatrix.put(matrix1Index, matrixProdList);
            }
        }
        return resultMatrix;
    }

    private static void printMatrix(Map<Integer,List<Integer>> matrix)
    {
        matrix.entrySet().stream().forEach(entry ->
        {
            entry.getValue().stream().forEach(val -> System.out.print(val + " "));
            System.out.println(" ");
        });
    }

    private static void readMatrices(Map<Integer,List<Integer>> matrix,int matrixIndex)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the row count for matrix "+matrixIndex+": ");
        String rowCount = scanner.nextLine();
        System.out.println("Enter the matrix "+matrixIndex+" in space seperated format");
        for (int i = 0; i < Integer.parseInt(rowCount); i++)
        {
            String colValues = scanner.nextLine();
            String[] colArr = colValues.split(" ");
            List<Integer> matrixValList = new ArrayList<>();
            for (String val : colArr)
            {
                matrixValList.add(Integer.parseInt(val));
            }
            matrix.put(i, matrixValList);
        }

    }
}