package PatikaOdevlerVePratikler;

import java.util.Scanner;

public class ProgramToCalculateCombination {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n, r;
        int factorialN = 1, factorialR = 1, factorialX = 1;

        System.out.print("Please enter a number 'N': ");
        n = input.nextInt();

        System.out.print("Please enter a number R: ");
        r = input.nextInt();

        int x = (n - r);

        if (n <= r){
            System.out.println("Program ended because n is less than or equal to r.");
            System.exit(0);
        }

        for (int i = 1; i <= n; i++){
            factorialN *= i;
        }

        for (int i = 1; i <= r; i++){
            factorialR *= i;
        }


        for (int i = 1; i <= x; i++){
            factorialX *= i;
        }

        int comb;
        comb = factorialN / (factorialR * (factorialX));

        System.out.println("C(N,R) = " + comb);

    }
}
//C(n,r) = n! / (r! * (n-r)!)