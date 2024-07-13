package piratical_Assigment2;

public class Student {
    private String name;
    private int grade;

  
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

   
    public void setGrade(int grade) {
        this.grade = grade;
    }

   
    public int getGrade() {
        return grade;
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Bob");
        student.setGrade(90);

        System.out.println("Name: " + student.getName());
        System.out.println("Grade: " + student.getGrade());
    }
}

