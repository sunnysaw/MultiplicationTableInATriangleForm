/*
Question : Write a program to print multiplication table in a triangle form.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,j,k,start,ending,sum;
        System.out.println("Enter the starting digit for table :");
        start = sc.nextInt();
        System.out.println("Enter the ending digit for table :");
        ending = sc.nextInt();
        System.out.println("Printing the result :");
        for (i = start; i <= ending; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        for (j = start; j <= ending; j++){
            for (k = 1; k <= j; k++){
                sum = j*k;
                System.out.print(sum+ " ");
            }
            System.out.println();
        }
    }
}
/*
Answer:
n = 10
 1  2  3  4  5  6  7  8  9 10
 1
 2  4
 3  6  9
 4  8 12 16
 5 10 15 20 25
 6 12 18 24 30 36
 7 14 21 28 35 42 49
 8 16 24 32 40 48 56 64
 9 18 27 36 45 54 63 72 81
10 20 30 40 50 60 70 80 90 100
 */