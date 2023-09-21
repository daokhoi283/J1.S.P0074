import java.util.Scanner;

public class Matrix{
    public static Scanner sc = new Scanner(System.in);
    public static int inputIntMsg(String msg){ 
        while (true) {
            try {
                System.out.print(msg);
                int input = Integer.parseInt(sc.nextLine());
                return input;
            } catch (NumberFormatException e){
                System.out.println("Values of matrix must be the number");
            } 
        } 
    }
    public int inputIntChoice(int min, int max){ 
        while (true) {
            try { 
                int input = inputIntMsg("Your choice: ");
                if(input < min || input > max){
                    System.out.println("Please enter again choice from " + min + " to " + max);
                    continue;
                }
                return input;
            } catch (NumberFormatException e){
                System.out.println("Values of matrix must be the number");
            } 
        } 
    }
    public static int[][] inputMatrix(int n){ 
        int row = inputIntMsg("Enter Row Matrix " + n + ": " );
        int col = inputIntMsg("Enter Row Matrix " + n + ": " ); 
        int[][] a = new int[row][col];
        for(int i =0; i < row; i++){
            for(int j =0; j < col; j++){ 
                a[i][j] = inputIntMsg("Enter Matrix"+ n + "[" + (i+1) + "][" + (j+1) + "]:");
            }
        }
        return a;
    }
    public void disPlayMatrix(int[][] a){
        int row = a.length;
        int col = a[0].length;
        for(int i =0; i < row; i++){
            for(int j =0; j < col; j++){
                System.out.print("[" + a[i][j] + "]");
            }
            System.out.println();
        } 
    }
    public void addMatrix(){
        System.out.println("----- Addition -----");
        int[][] a1 =  inputMatrix(1);
        int[][]a2 = inputMatrix(2);
        System.out.println("------ Result ------");
        disPlayMatrix(a1);
        System.out.println("+");
        disPlayMatrix(a2);
        System.out.println("=");
        int row = a1.length; // so hang
        int col = a2[0].length; // so cot
        for(int i =0 ; i < row; i++){
            for(int j =0 ; j < col; j++){
                System.out.print("[" + (a1[i][j] + a2[i][j]) + "]");
            }
            System.out.println();
        }
    } 
    public void SubMatrix(){
        System.out.println("----- Subtraction -----");
        int[][] a1 =  inputMatrix(1);
        int[][]a2 = inputMatrix(2);
        System.out.println("------ Result ------");
        disPlayMatrix(a1);
        System.out.println("-");
        disPlayMatrix(a2);
        System.out.println("=");
        int row = a1.length;
        int col = a1.length;
        for(int i =0 ; i < row; i++){
            for(int j =0 ; j < col; j++){
                System.out.print("[" + ( a1[i][j] - a2[i][j]) + "]");
            }
            System.out.println();
        }
    } 
    public void MultiMatrix(){
        System.out.println("----- Multiplication -----");
        int[][] a1 =  inputMatrix(1);
        int[][]a2 = inputMatrix(2);
        System.out.println("------ Result ------");
        disPlayMatrix(a1);
        System.out.println("*");
        disPlayMatrix(a2);
        System.out.println("=");
        int row1 = a1.length;
        int col1 = a1[0].length; 
        int col2 = a2[0].length;
        int[][] result = new int[row1][col2]; 
        for(int i =0 ; i < row1; i++){
            for(int j =0 ; j < col2; j++){
                for (int k = 0; k < col1; k++){
                    result[i][j] += a1[i][k] * a2[k][j];
                }
            } 
        }
        disPlayMatrix(result);
    } 
}