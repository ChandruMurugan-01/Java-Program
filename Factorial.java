import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner cha=new Scanner(System.in);
        System.out.println("Enter the value:");
        int a=cha.nextInt();
        int fact=1;
        for(int i=1;i<=a;i++){
            fact *=i;
        }
        System.out.print(a+"Factorial is :"+fact);
    }
}