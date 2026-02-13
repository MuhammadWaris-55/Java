public class Student{
    private String name;
    private int id;
    private String course;

    //Constructor for values
    public Student(String name, int id, String course){
        this.name = name;
        this.id = id;
        this.course = course;
    }

    public void enroll(){
        System.out.println(name + "has enrolled in"+ course);
    }
    public void attentClass(){
        System.out.println(name + "is attending class");
    }
    public void submitAssignment(){
        System.out.println(name + "has subitted the assignmnt");
    }
    public void get_data(){
        System.out.println( "Name:" + name);
        System.out.println("Id:" + id);
    }

    public static void main(String[] args){
        Student arr[] = new Student[2];
        arr[0] = new Student("Messi", 10 , "SWE");
        arr[1] = new Student("Waris", 141 , "SWE");

        for(int i = 0; i<arr.length;i++){
            arr[i].get_data();
            System.out.println("-------------------");
        }
    }

}