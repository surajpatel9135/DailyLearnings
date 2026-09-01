import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    private int rollNo;
    private int age;
    private char division;
    private String collegeName;

    public Student(String name, int rollNo, int age, char division, String collegeName) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
        this.division = division;
        this.collegeName = collegeName;
    }

    public void display() {
        System.out.println("Roll: " + rollNo + " | Name: " + name + " | Div: " + division + " | College: " + collegeName);
    }
}

public class Main {
    public static void main(String[] args) {
        List<Student> universityPortal = new ArrayList<>();
        String collegeName = "Global University";
        
        // Path to your database text file
        String filePath = "students.csv"; 

        System.out.println("Reading student records automatically from file...");

        // Try-with-resources handles opening and closing the file safely
        try (BufferedReader reader = new BufferedReader(new FileReader("Student.txt"))) {
            String row;
            
            // This loop runs completely on its own until the last line of the file!
            while ((row = reader.readLine()) != null) {
                // Split the comma-separated row: ["Alice Smith", "101", "20", "A"]
                String[] columns = row.split(","); 
                
                // Parse strings into correct data types dynamically
                String name = columns[0].trim();
                int rollNo = Integer.parseInt(columns[1].trim());
                int age = Integer.parseInt(columns[2].trim());
                char division = columns[3].trim().charAt(0);

                // Instantly generate object and save to list
                universityPortal.add(new Student(name, rollNo, age, division, collegeName));
            }
            
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }

        // Final summary output
        System.out.println("==============================================");
        System.out.println("Processing finished! Total loaded records: " + universityPortal.size());
        System.out.println("==============================================");
        
        // Print out the first few records just to verify it worked
        System.out.println("First record loaded successfully:");
        if (!universityPortal.isEmpty()) {
            universityPortal.get(0).display();
        }
    }
}
