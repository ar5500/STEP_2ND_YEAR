import java.util.Scanner;

class MaskedPhone {
    static String maskPhoneNumber(String phone) {
       
        if (phone.length() != 10) {
            return "Invalid Phone Number";
        }
        
        String last4 = phone.substring(6);
        
        StringBuilder s = new StringBuilder("xx-xxxx");
       
        s.append("-");
        s.append(last4);
        
        return s.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 10-digit phone number: ");
        String phone = sc.nextLine();
        
        System.out.println(maskPhoneNumber(phone));
        sc.close();
    }
}