import java.util.Scanner;
public class Swap {
    public static void main(String[] args) {
        Scanner cha=new Scanner(System.in);
        System.out.println("Enter the a value:");
        int a=cha.nextInt();
        System.out.println("Enter the b value:");
        int b=cha.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a = " + a + ", b = " + b);
    }
}