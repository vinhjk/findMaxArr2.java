import java.util.Scanner;

public class findMaxArr2 {
    public static void main(String[] args) {
        int row, column;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of row : ");
        row = scanner.nextInt();
        System.out.print("Enter number of column :");
        column = scanner.nextInt();

        int [][] array= new int[row][column];
        System.out.print("Enter value's array :");
        for (int i = 0; i < row; i ++){
            for (int j = 0; j < column; j ++){
                System.out.print("array[" + i + "][" + j + "] = ");
                array[i][j] = scanner.nextInt();
            }
        }
        int max = array[0][0];

        for (int i = 0; i < row; i ++){
            for (int j = 0; j < column; j ++){
                if (array[i][j] > max){
                    max = array[i][j];
                }
            }
        }
        System.out.println("Max  = " + max);
    }
}
