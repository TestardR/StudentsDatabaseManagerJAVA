package com.romaintestard.lab2;

public class StudentDatabase {

    public static void main(String[] args){
        // Create a Student
        Student stu1 = new Student("Jamelia", "121212121");
        stu1.enroll("Math151");
        stu1.enroll("Eco101");
        stu1.enroll("His211");

/*        stu1.showCourses();
        stu1.checkBalance();*/
        stu1.payTuition(600);
/*        stu1.checkBalance();*/
        System.out.println(stu1.toString());



        Student stu2 = new Student("Romero", "23232323");
        Student stu3 = new Student("Antonella", "454545454");
    }
}

class Student {
    // Properties
    private static int iD=0;
    private String userId;
    private String name;
    private String SSN;
    private String email;
    private String phone;
    private String city;
    private String state;
    private String courses = "";
    private static final int costOfCourse = 800;
    private int balance = 0;

    public Student(String name, String SSN) {
        iD++;
        this.name = name;
        this.SSN = SSN;
        setEmail();
        setUserId();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCourses() {
        return courses;
    }

    public void setCourses(String courses) {
        this.courses = courses;
    }

    private void setEmail() {
        email = name.toLowerCase() + "." + iD + "@university.com";
/*        System.out.println("Your email: " + email);*/
    }

    public String getEmail() {
        return email;
    }

    private void setUserId(){
        int max = 9000;
        int min = 1000;
        int randNum = (int) (Math.random() *(max -min));
        randNum = randNum + min;
        userId = iD + "" + randNum + SSN.substring(5);
/*        System.out.println("Your User ID: " + userId);*/
    }

    public void enroll(String course) {
        this.courses = courses + "\n" + course;
        balance = balance + costOfCourse;
    }

    public void payTuition(int amount) {
        System.out.println("Payment: $" + amount);
        balance = balance - amount;

    }

    public void checkBalance() {
        System.out.println("Balance: $" + balance);
    }

    public void showCourses() {
        System.out.println(courses);
    }

    public String toString() {
        return "[NAME: " + name + "]\n[COURSES: " + courses + "]\nBALANCE: " + balance + " ]";
    }
}


