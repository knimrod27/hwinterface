package Students;

public class MainStudent {
    public static void main(String[] args) {
        Student student1 = new Student("Jancsi", 10);
        Student student2 = new Student("Guta", 4);
        Student student3 = new Student("Alpar", 6);


        System.out.println("Average grade is: " + Student.getAverage());


    }
}

