import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        Scanner cha=new Scanner(System.in);
        System.out.println("Enter the Name:");
        String a=cha.nextLine();
        String rev =" ";
        for(int i=a.length()-1;i>=0;i--){
            rev +=a.charAt(i);
        }
        System.out.print("Reverse String:"+rev);
    }
}