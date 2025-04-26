import java.util.Scanner;

public class test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int matrx[][]= new int[3][4];

        for(int i =0; i<3;i++){
            for(int j=0; j<4;j++){
                matrx[i][j] = sc.nextInt();
            }
        }
        for (int arr[]: matrx){
            for(int j: arr){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
