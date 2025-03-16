import java.util.Scanner;
public class stars {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a value for N ");
        int N = scanner.nextInt();
      // i is the number of rows
      // j is the number of starts per row
        for (int i = 1; i<=N;i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        } scanner.close();
    }

}


// Output: 
// Please enter a value for N 
// 5
//*
//**
//***
//****
//*****
