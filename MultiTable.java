import java.util.Scanner;
public class MultiTable {
    public static void main(String[] args) {
        Scanner cha=new Scanner(System.in);
        System.out.println("Enter the value:");
        int a=cha.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(i+"*"+a+"="+(i*a));
        }
    }
}