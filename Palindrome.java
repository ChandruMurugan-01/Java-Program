import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner cha=new Scanner(System.in);
        System.out.println("Enter the Name:");
        String a=cha.nextLine();
        String rev ="";
        for(int i=a.length()-1;i>=0;i--){
            rev +=a.charAt(i);
        }
        if(a.equals(rev)) {
             System.out.print(a+" it is Palindrome");
        }
        else{
            System.out.print(a+" it is not Palindrome");
        }

}


}