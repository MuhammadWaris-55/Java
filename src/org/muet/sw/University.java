package org.muet.sw;
import java.util.ArrayList;
public class University{
    public String name;
    ArrayList<Department>deplist=new
    ArrayList<>();
    ArrayList<Student>studentlist=new
    ArrayList<>();
    public University(String name){
        this.name = name;
    }
    public String get_departments(){
        return deplist.toString();
    }
    public String get_name(){
        return name;
    }
    public String get_students(){
        return studentlist.toString();
    }
    public void set_student(Student s){
        studentlist.add(s);
    }
    public void set_dpartments(ArrayList<String>dlist){
        for(String d:dlist){
            Department dept = new Department();
            dept.dname=d;
            dept.set_belongsto(this);
            this.deplist.add(dept);
        }
    }
}

