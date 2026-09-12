import java.util.Scanner;

public class FileExtensionValidator {
    static String validateFileExtension(String filename) {
        int dot = filename.lastIndexOf('.');
        String ext = filename.substring(dot + 1).toLowerCase();
        
        if (ext.equals("pdf") || ext.equals("docx") || ext.equals("zip")) {
            return "Accepted";
        } else {
            return "Rejected - Invalid file type";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String filename = sc.next();
        
        System.out.println(validateFileExtension(filename));
    }
}