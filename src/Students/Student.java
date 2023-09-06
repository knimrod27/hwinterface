package Students;

public class Student {
    private String name;
    private double grade;
    private static double gradeSum = 0.0;
    private static int numberOfStudents = 0;

    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
        gradeSum = gradeSum+ grade;
        numberOfStudents++;
    }

    public double getGrade() {
        return grade;
    }

    public String getName() {
        return name;
    }
    public static double getAverage() {
        return gradeSum/numberOfStudents;
    }
}


