package org.muet.sw;
public class Student{
    public String sname;
    public University enrolledin;
    public Student(String sname, University u){
        this.sname = sname;
        this.enrolledin = u;
    }
    public String get_enrolleduniversity(){
        return enrolledin.get_name();
    }
    public String toString(){
        return sname;
    }
}
