import java.util.Scanner;
public class Evenorodd {
    public static void main(String[] args) {
        Scanner cha=new Scanner(System.in);
        System.out.println("Enter the value:");
        int a=cha.nextInt();
        if(a%2==0){
            System.out.print("It is Even");
        }
        else{
            System.out.print("It is Odd");
        }
    }
}