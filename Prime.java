import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner cha=new Scanner(System.in);
        System.out.println("Enter the value:");
        int a=cha.nextInt();
        boolean isPrime=true;
        for(int i=2;i<=a/2;i++){
            if(a%i==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime){
            System.out.print(a+"is Prime Number");
        }
        else{
            System.out.print(a+"is Not Prime Number");
        }
    }
}