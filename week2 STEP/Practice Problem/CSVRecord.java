import java.util.Scanner;

public class CSVRecord {
    static void parseStudentRecord(String csvLine) {
        String[] field = csvLine.split(",");
        if (field.length != 3) {
            System.out.println("Invalid Record");
            return;
        }
        
        String name = field[0].trim();
        String rollNumber = field[1].trim();
        String department = field[2].trim();
        
        System.out.println("Name: " + name + " Roll No: " + rollNumber + " Dept: " + department);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student record: ");
        String csvLine = sc.nextLine();
        
        parseStudentRecord(csvLine);
        sc.close();
    }
}