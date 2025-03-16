import java.util.Scanner;
public class shapes {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {

            System.out.println("Please choose what woould you like to calculate:");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Exit");
            int choice = scanner.nextInt();

            if (choice == 4) {
                System.out.println("Leaving the program.");
                break;
            }
            switch (choice) {
                case 1:
                    System.out.println("Please enter the radius of the circle");
                    double radius = scanner.nextDouble();
                    double area = 3.14 * radius * radius;
                    System.out.println("The area of the circle is: " + area);
                    break;
                case 2:
                    System.out.println("Please enter the length and width of your rectangle");
                    double l = scanner.nextDouble();
                    double w = scanner.nextDouble();
                    double areaP = l * w;
                    double perimeter = 2 * l + 2*w;
                    System.out.println("The area of the rectangle is: " + areaP);
                    System.out.println("The perimeter of the rectangle is: " + perimeter);
                    break;
            }

        }
        scanner.close();
    }
}


// Output: 
//Please choose what woould you like to calculate:
//1. Circle
//2. Rectangle
//3. Exit
//2
//Please enter the length and width of your rectangle
//5
//99
//The area of the rectangle is: 495.0
//The perimeter of the rectangle is: 208.0
