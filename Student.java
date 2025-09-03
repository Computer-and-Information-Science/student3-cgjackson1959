public class Student {
    // put data members here
    private String name;
    private int id;
    private double gpa;

    // Constructor
    public Student(String studentName, int studentId, double studentGPA) {
        this.name = studentName;
        this.id = studentId;
        this.gpa = studentGPA;
        System.out.println(this.name + "Sutdent Created");
    }

        // put getters here
        public String getStudentName() {
            return this.name;
        }

        public int getStudentId() {
            return this.id;
        }

        public double getStudentGPA() {
            return this.gpa;
        }

        // put setters here
        public void setGPA(double newGPA) {
            this.gpa = newGPA;
        }
        //other member functions (methods here)
        //call the displayStudent method here
        public void displayStudent() {
            System.out.println("The Student " + this.name + " has an id of: " + this.id + " and GPA of: " + this.gpa + ".");
        }
        
    public static void main (String[] args) {
        // Create new student here
        Student student1 = new Student("Lisa Waddell", 54321, 2.5);

        //call the displayStudent method here
        student1.setGPA(3.0);
        student1.displayStudent();
        System.out.println(student1.getStudentName());
        System.out.println(student1.getStudentId());
        System.out.println(student1.getStudentGPA());
    }
}
