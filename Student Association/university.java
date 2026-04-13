import java.util.ArrayList;
public class university{
    public String name;
    ArrayList<department> deplist = new ArrayList<>();    // Departments in this university
    ArrayList<student> studentlist = new ArrayList<>();  // Students enrolled in this university

    public university(String name){
        this.name = name;
    }
    public String get_department(){
        return deplist.toString();
    }
    public String get_name(){
        return name;
    }
    public String get_students(){
        return studentlist.toString();
    }
    public void set_student(student s){
        studentlist.add(s);
    }
    public void set_department(department d){
        deplist.add(d);
    }
}