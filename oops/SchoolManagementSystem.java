// Abstract base class representing a general person in the school
abstract class Person {
    // Private fields for encapsulating data
    private String name;
    private int age;
    private String address;

    // Constructor to initialize the common attributes of a person
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Public getter and setter methods for encapsulation
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Abstract method to be implemented by subclasses
    // Demonstrates polymorphism as each subclass will define its own behavior
    public abstract void displayRole();
}

// Subclass representing a student, inheriting from Person
class Student extends Person {
    // Additional fields specific to students
    private String studentId;
    private String[] coursesEnrolled;

    // Constructor to initialize student-specific attributes along with person attributes
    public Student(String name, int age, String address, String studentId) {
        super(name, age, address);  // Calling the constructor of the superclass (Person)
        this.studentId = studentId;
    }

    // Getter and setter methods for student-specific fields (Encapsulation)
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String[] getCoursesEnrolled() {
        return coursesEnrolled;
    }

    public void setCoursesEnrolled(String[] coursesEnrolled) {
        this.coursesEnrolled = coursesEnrolled;
    }

    // Overriding the abstract method from Person class (Polymorphism)
    @Override
    public void displayRole() {
        System.out.println("I am a student.");
    }

    // Method specific to students
    public void attendClass() {
        System.out.println(getName() + " is attending class.");
    }
}

// Subclass representing a teacher, inheriting from Person
class Teacher extends Person {
    // Additional fields specific to teachers
    private String teacherId;
    private String[] subjectsTaught;

    // Constructor to initialize teacher-specific attributes along with person attributes
    public Teacher(String name, int age, String address, String teacherId) {
        super(name, age, address);  // Calling the constructor of the superclass (Person)
        this.teacherId = teacherId;
    }

    // Getter and setter methods for teacher-specific fields (Encapsulation)
    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String[] getSubjectsTaught() {
        return subjectsTaught;
    }

    public void setSubjectsTaught(String[] subjectsTaught) {
        this.subjectsTaught = subjectsTaught;
    }

    // Overriding the abstract method from Person class (Polymorphism)
    @Override
    public void displayRole() {
        System.out.println("I am a teacher.");
    }

    // Method specific to teachers
    public void teachClass() {
        System.out.println(getName() + " is teaching class.");
    }
}

// Class representing a course offered by the school
class Course {
    // Private fields for encapsulating course data
    private String courseName;
    private String courseCode;
    private Teacher courseInstructor;  // Association with the Teacher class

    // Constructor to initialize the course attributes
    public Course(String courseName, String courseCode, Teacher courseInstructor) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.courseInstructor = courseInstructor;
    }

    // Getter and setter methods for encapsulation
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public Teacher getCourseInstructor() {
        return courseInstructor;
    }

    public void setCourseInstructor(Teacher courseInstructor) {
        this.courseInstructor = courseInstructor;
    }

    // Method to display course details
    public void displayCourseDetails() {
        System.out.println("Course: " + courseName + " (" + courseCode + ")");
        System.out.println("Instructor: " + courseInstructor.getName());
    }
}

// Class representing a subject within a course
class Subject {
    // Private fields for encapsulating subject data
    private String subjectName;
    private String subjectCode;

    // Constructor to initialize the subject attributes
    public Subject(String subjectName, String subjectCode) {
        this.subjectName = subjectName;
        this.subjectCode = subjectCode;
    }

    // Getter and setter methods for encapsulation
    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    // Method to display subject details
    public void displaySubjectDetails() {
        System.out.println("Subject: " + subjectName + " (" + subjectCode + ")");
    }
}

// Class representing a department within the school
class Department {
    // Private fields for encapsulating department data
    private String departmentName;
    private Teacher[] teachers;  // Association with the Teacher class

    // Constructor to initialize the department attributes
    public Department(String departmentName, Teacher[] teachers) {
        this.departmentName = departmentName;
        this.teachers = teachers;
    }

    // Getter and setter methods for encapsulation
    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher[] teachers) {
        this.teachers = teachers;
    }

    // Method to display department details
    public void displayDepartmentDetails() {
        System.out.println("Department: " + departmentName);
        System.out.println("Teachers:");
        for (Teacher teacher : teachers) {
            System.out.println("- " + teacher.getName());
        }
    }
}

// Class representing a classroom in the school
class Classroom {
    // Private fields for encapsulating classroom data
    private String roomNumber;
    private int capacity;

    // Constructor to initialize the classroom attributes
    public Classroom(String roomNumber, int capacity) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
    }

    // Getter and setter methods for encapsulation
    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    // Method to display classroom details
    public void displayClassroomDetails() {
        System.out.println("Classroom: " + roomNumber);
        System.out.println("Capacity: " + capacity);
    }
}

// Main class to demonstrate the school management system
public class SchoolManagementSystem {
    public static void main(String[] args) {
        // Creating a Teacher object
        Teacher teacher1 = new Teacher("Alice Johnson", 35, "123 Maple St", "T001");
        teacher1.setSubjectsTaught(new String[]{"Mathematics", "Physics"});

        // Creating a Student object
        Student student1 = new Student("Bob Smith", 16, "456 Oak St", "S001");

        // Creating a Course object
        Course course1 = new Course("Introduction to Physics", "PHY101", teacher1);

        // Creating a Classroom object
        Classroom classroom1 = new Classroom("101A", 30);

        // Creating a Department object
        Department scienceDept = new Department("Science", new Teacher[]{teacher1});

        // Displaying the details of each entity in the school management system
        student1.displayRole();
        teacher1.displayRole();
        course1.displayCourseDetails();
        classroom1.displayClassroomDetails();
        scienceDept.displayDepartmentDetails();
    }
}
