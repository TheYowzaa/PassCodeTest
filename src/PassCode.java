import java.util.Scanner;

public class PassCode {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a 5 digit number : ");
        String  passcode=sc.nextLine();

        if (passcode.equals("45167")) {
            System.out.println("Passcode correct");
        }
        else {
            System.out.println("Passcode incorrect");
        }
    }
}