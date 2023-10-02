import java.util.Scanner;

public class magic_squares{

    public static void main(String[] args){
        System.out.println("Enter an odd number 3-11");
        Scanner scan = new Scanner(System.in);
        try{
            int n = scan.nextInt();
            if(n<3 || n>11 || n%2 !=1){
                System.out.println("Invalid input");
            }else{
                magicsquare(n);
            }
        }catch(Exception exception){
            System.out.println("Input must be a number from 3-11");
            }
        scan.close();
    }


public static void magicsquare(int n) {

    System.out.println("\n");

    int[][] magicSquare = new int[n][n];

    int i = n / 2;
    int j = n - 1;

    int num = n * n;
    int count = 1;

    for (i = 0; i < n; i++) {
        for (j = 0; j < n; j++) {
            magicSquare[i][j] = 0;
        }
    }

    i = n / 2;
    j = n - 1;

    while (count <= num) {
        if (i == -1 && j == n) {
            j = n - 2;
            i = 0;
        } else {
            if (j == n) {
                j = 0;
            }
            if (i < 0) {
                i = n - 1;
            }
        }
        if (magicSquare[i][j] != 0) {
            j -= 2;
            i++;
            continue;
        } else {
            magicSquare[i][j] = count;
            count++;
        }

        i--;
        j++;
    }

    for (i = 0; i < n; i++) {
        for (j = 0; j < n; j++) {
            System.out.print(magicSquare[i][j] + " ");
        }
        System.out.println();
    }

    int sum = 0;
    for (int k = 1; k <= num; k++) {
        sum += k;
    }
    System.out.println("\nSum of all numbers: " + sum);
    }
}
