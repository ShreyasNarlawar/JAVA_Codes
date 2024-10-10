public class Student {
    private int sid; // Student ID
    private String sname; // Student name
    private float m1, m2, m3; // Marks

    // Default constructor
    public Student() {
        sid = 0;
        sname = null;
        m1 = 0.0f;
        m2 = 0.0f;
        m3 = 0.0f;
    }

    // Parameterized constructor
    public Student(int sid, String name, float m1, float m2, float m3) {
        this.sid = sid;
        this.sname = name;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    // Setter methods
    public void setSname(String nm) {
        sname = nm;
    }

    public void setM1(float m1) {
        this.m1 = m1;
    }

    public void setM2(float m2) {
        this.m2 = m2;
    }

    public void setM3(float m3) {
        this.m3 = m3;
    }

    // Getter methods
    public int getSid() {
        return this.sid;
    }

    public String getSname() {
        return this.sname;
    }

    public float getM1() {
        return this.m1;
    }

    public float getM2() {
        return this.m2;
    }

    public float getM3() {
        return this.m3;
    }

    // toString method
    public String toString() {
        return "Id : " + sid + "\nName: " + sname + "\nM1: " + m1 + "\nM2: " + m2 + "\nM3: " + m3;
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Create a Student object using the parameterized constructor
        Student student1 = new Student(1, "John Doe", 85.5f, 90.0f, 78.0f);
        
        // Display the student information
        System.out.println(student1.toString());
        
        // Create another Student object using the default constructor
        Student student2 = new Student();
        
        // Set properties for the second student
        student2.setSname("Jane Doe");
        student2.setM1(92.0f);
        student2.setM2(88.5f);
        student2.setM3(79.0f);
        
        // Display the second student information
        System.out.println(student2.toString());
    }
}
