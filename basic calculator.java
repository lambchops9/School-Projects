import java.util.Scanner;
public class Main {

    int addSum;
    int subSum;
    int mulSum;
    int divSum;
    int x = 0; // Usages are determined based on user input
    int y = 0; // Usages are determined based on user input
    void get(int addSum, int subSum, int mulSum, int divSum) {
        this.addSum = addSum;
        this.subSum = subSum;
        this.mulSum = mulSum;
        this.divSum = divSum;
    }

    void Add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: " );
        int x = scanner.nextInt();
        System.out.println("Enter second number: " );
        int y = scanner.nextInt();
        int addSum = x + y;
        System.out.println("Total of your 2 numbers : " + addSum);
    }
    void Subtract() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: " );
        int x = scanner.nextInt();
        System.out.println("Enter second number: " );
        int y = scanner.nextInt();
        int subSum = y - x;
        System.out.println("Total of your 2 numbers after subtracted : " + subSum);
    }

    void Divide() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: " );
        int x = scanner.nextInt();
        System.out.println("Enter second number: " );
        int y = scanner.nextInt();
        int divSum = x / y;
        System.out.println("Remainder 2 numbers : " + divSum);
    }

    void Multiply() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: " );
        int x = scanner.nextInt();
        System.out.println("Enter second number: " );
        int y = scanner.nextInt();
        int mulSum = x * y;
        System.out.println("Product  of your 2 numbers : " + mulSum);
    }

    public static void main(String[]args) {
        Main obj = new Main();
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("Select an operation from the following menu:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt(); // This data member was declared in this method due to its specific needs.


            switch (choice) {
                case 1:
                    obj.Add();
                    break;
                case 2:
                    obj.Subtract();
                    break;
                case 3:
                    obj.Multiply();
                    break;
                case 4:
                    obj.Divide();
                    break;
                case 5:
                    System.out.println("Exiting the calculator. ");
                    scanner.close();
                    return; // Exits the program
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
