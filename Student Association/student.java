public class student{
    public String sname;
    public university enrolledin; // University the student is enrolled in
    public department studiesin;  // Department the student belongs to

    public student(String sname , university u , department z){
        this.sname = sname;
        this.enrolledin = u;
        this.studiesin = z;
    }
    public String get_enrolleduniversity(){
        return enrolledin.get_name();
    }
    public String get_studiesin(){
        return studiesin.get_dname();
    }
    public String toString(){
        return sname;
    }
}