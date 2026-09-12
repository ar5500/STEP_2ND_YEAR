import java.util.Scanner;
public class ATMPINLengthValidator{
    static void checkPinLength(String pin) {
        if(pin.length()!=4){
            System.out.println("Invalin pun- must be 4 digits only");
        }
        else{
         System.out.println("Pin length ok");
        }
    }
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);

        String pin= sc.nextLine();
        checkPinLength(pin)
    }
}