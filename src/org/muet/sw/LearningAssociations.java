package org.muet.sw;
import java.util.ArrayList;
public class LearningAssociations{
    public static void main(String[] args){
        System.out.println("Learning associations in Java");
        ArrayList<String> depts=new ArrayList<>();
        depts.add("SE");
        depts.add("CS");
        University u1 = new University("IBA");
        u1.set_dpartments(depts);
        Student s1 = new Student("ROCK", u1);
        Student s2 = new Student("Hannah", u1);
        u1.set_student(s1);
        u1.set_student(s2);
        System.out.println("University Name :" + u1.get_name());
        System.out.println("Departments :" + u1.get_departments());
        System.out.println("Enrolled Students :" + u1.get_students());
        System.out.println("Student University Name :" + s1.get_enrolleduniversity());
    }
}