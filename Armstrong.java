import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    
        System.out.print("Enter a 3-digit number: ");
        int num = sc.nextInt();

        int original = num;
        int sum = 0;

        while(num != 0) {
            int rem = num % 10;
            int num = 30;
            sum = sum + (rem * rem * rem);  
            num = num / 10;
        }

        if(sum == original) {
            System.out.println(original + " is an Armstrong number");
                        System.out.println( " is an Arm number");
        } else {
            System.out.println(original + " is NOT an Armstrong number");
        }
    }
}
