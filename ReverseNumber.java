import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner cha=new Scanner(System.in);
        System.out.println("Enter the value:");
        int a=cha.nextInt();
        int rev=0;
        while(a !=0){
            int rem=a%10;
            rev=(rev*10)+rem;
            a=a/10;
            System.out.print("ReverseNumber:"+rev);
        }
        
    }
}