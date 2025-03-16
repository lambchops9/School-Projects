public class stars {
    public static void main(String[]args) {
        int N= 5;
        for (int i = 1; i<=N;i++) {
            for (int j = N; j>=i ;j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// output
// *****
//****
//***
//**
//*
