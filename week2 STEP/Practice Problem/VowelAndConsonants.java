import java.util.Scanner;

public class VowelAndConsonants {
    
    static void countVowelsAndConsonants(String text) {
        int vowel = 0;
        int consonant = 0;
        
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            ch = Character.toLowerCase(ch);
            
           
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowel++;
            } 
          
            else if (ch >= 'a' && ch <= 'z') {
                consonant++;
            }
        }
        
        System.out.println("Vowel: " + vowel + " Consonant: " + consonant);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter book title: ");
        String text = sc.nextLine();
        
       
        countVowelsAndConsonants(text);
        
        sc.close();
    }
}