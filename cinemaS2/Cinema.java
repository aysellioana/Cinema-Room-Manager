package cinemaS2;

import javax.swing.text.html.StyleSheet;
import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int noRow = scanner.nextInt();
        System.out.println("Enter the number of seats in each row: ");
        int noSeats = scanner.nextInt();
        int total = 0;
        if ((noRow * noSeats) < 60) {
            total = (noRow * noSeats) * 10;
            System.out.println("Total income: $" + total);
        } else {
            if ((noRow * noSeats) % 2 == 0) {
                total = ((noRow * noSeats)/2 * 10 + (noRow * noSeats)/2 * 8);
                System.out.println("Total income: $" + total);
            } else {
                int front = noRow/2;
                int back = noRow - front;
                total =(front*noSeats*10) + (back*noSeats*8);
                System.out.println("Total income: $" + total);
            }
        }
    }
}