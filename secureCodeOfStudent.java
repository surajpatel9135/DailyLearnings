class Student {
    private String name;
    private int age;
    private int rollNo;
    
    Student(String name, int age, int rollNo) {
        if(age <= 0 || age >= 150) {
            throw new IllegalArgumentException("Thed age must be greater than zero and less than 150");
        }
        if(rollNo <= 0) {
            throw new IllegalArgumentException("Roll number must be a valid number");
        }
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getAge() {
        return this.age;
    }
    
    public int getRollNo() {
        return this.rollNo;
    }
}

public class secureCodeOfStudent {
    public static void main(String[] args) {
        Student s1 = new Student("Shubham Kumar", 24, 21);
        System.out.println("Name: "+ s1.getName() +", Age: "+s1.getAge()+", Roll Number: "+s1.getRollNo());
    }
}