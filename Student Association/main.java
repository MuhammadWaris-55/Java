public class main{
    public static void main(String[] args){
        System.out.println("Educational Institute");
        university u1 = new university("FAST");
        department d1 = new department( "SE" , u1);
        department d2 = new department("CS" , u1);
        student s1 = new student( "Waris" , u1 , d1);
        student s2 = new student("Ali" , u1 , d2);
        u1.set_student(s1);
        u1.set_student(s2);
        u1.set_department(d1);
        u1.set_department(d2);

        university u2 = new university("IBA");
        department d3 = new department("BBA" , u2);
        u2.set_department(d3);
        System.out.println("University name = " + u1.get_name());
        System.out.println("Department = " + u2.get_department());
        System.out.println("Students = " + u1.get_students());
        System.out.println("Student University name = " + s1.get_enrolleduniversity());
        System.out.println("Departmen = " + u2.get_department());
        System.out.println("Student department name = " + s1.get_studiesin());



    }
}