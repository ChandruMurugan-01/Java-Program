import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner cha=new Scanner(System.in);
        System.out.println("Enter the a value:");
        int m=cha.nextInt();
        System.out.println("Enter the b value:");
        int n=cha.nextInt();
        int a=0;
        int b=1;
         System.out.print(a+" "+ b);
        for(int i=m;i<=n;i++){
               int c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
        
    }
}