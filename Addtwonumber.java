import java.util.Scanner;
public class Addtwonumber {
    public static void main(String[] args) {
        Scanner cha=new Scanner(System.in);
        System.out.println("Enter the a value:");
        int a=cha.nextInt();
        System.out.println("Enter the b value:");
        int b=cha.nextInt();
        int c=a+b;
        System.out.println("a and b sum is:"+c);
    }
}