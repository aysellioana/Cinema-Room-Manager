package cinemaS3;

import javax.swing.text.html.StyleSheet;
import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row: ");
        int seats = scanner.nextInt();

        if(rows <=9 && seats<=9){
            char[][] cinema = new char[rows][seats];
            System.out.println("Cinema: ");
            System.out.print("  ");
            for(int j=1;j<=seats;j++){
                System.out.print(j + " ");
            }
            System.out.println();

            for(int i=1;i<=rows;i++){
                System.out.print(i + " ");
                for(int j=1;j<=seats;j++){
                    cinema[i-1][j-1] = 'S';
                    System.out.print(cinema[i-1][j-1] + " ");
                }
                System.out.println();
            }

            System.out.println("Enter a row number: ");
            int selectedRow = scanner.nextInt();
            System.out.println("Enter a seat number in that row:");
            int selectedSeat = scanner.nextInt();

            int totalSeats = rows*seats;
            int price = 0;
            if(totalSeats<60){
                price=10;
            }else{
                int back = rows/2 + (rows%2);

                if(selectedRow<back){
                    price = 10;
                }else{
                    price = 8;
                }
            }
            System.out.println("Ticket price: $" + price);

            System.out.println();
            System.out.println("Cinema: ");

            System.out.print("  ");
            for (int j = 1; j <= seats; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
            for (int i = 1; i <= rows; i++) {
                System.out.print(i + " ");
                for (int j = 1; j <= seats; j++) {
                    if (i == selectedRow && j == selectedSeat) {
                        System.out.print("B ");
                    } else {
                        System.out.print(cinema[i - 1][j - 1] + " ");
                    }
                }
                System.out.println();
            }
        }
    }
}