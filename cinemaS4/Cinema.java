package cinemaS4;

import javax.swing.text.html.StyleSheet;
import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row: ");
        int seats = scanner.nextInt();
        char[][] cinema = new char[rows][seats];


        //Meniu
        printTheMenu();
        int menu;
        do{
            menu = scanner.nextInt();
            switch (menu){
                case 1:
                    showTheSeats(rows, seats, cinema);
                    printTheMenu();
                    break;
                case 2:
                    buyATicket(rows, seats, cinema);
                    printTheMenu();
                    break;
                case 3:
                    break;
            }
        }while(menu!=0);

//        showTheSeats(rows, seats, cinema);
//        buyATicket(rows, seats, cinema);
//        showTheSeats(rows, seats, cinema);



    }
        public static void showTheSeats(int rows, int seats, char[][] cinema) {
            System.out.println("Cinema: ");
            System.out.print("  ");
            for (int j = 1; j <= seats; j++) {
                System.out.print(j + " ");
            }
            System.out.println();

            for (int i = 1; i <= rows; i++) {
                System.out.print(i + " ");
                for (int j = 1; j <= seats; j++) {
                    if (cinema[i - 1][j - 1] == '\u0000') {
                        cinema[i - 1][j - 1] = 'S';
                    }
                    System.out.print(cinema[i - 1][j - 1] + " ");
                }
                System.out.println();
            }
        }

        public static  void buyATicket(int rows, int seats, char[][] cinema){
            Scanner scanner = new Scanner(System.in);
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
            modifyTheSeat(selectedRow, selectedSeat, cinema);
        }

        public static void modifyTheSeat(int selectedRow, int selectedSeat, char[][] cinema){
            if(selectedRow>=1 && selectedRow<= cinema.length
                    && selectedSeat>=1 && selectedSeat<=cinema[0].length){
                cinema[selectedRow - 1][selectedSeat - 1] = 'B';
            }
        }

        public static void printTheMenu(){
            System.out.println("1. Show the seats");
            System.out.println("2. Buy a ticket");
            System.out.println("0. Exit");
        }
}