public class Main{
    public static void main(String[] args){
        System.out.println("Amusement Park");
        Amusement a1 = new Amusement("Adventure Land");
        Rides r1 = new Rides("Aladdin", a1);
        Rides r2 = new Rides("Frisbee", a1);
        People p1 = new People("Waris" , a1 , r1);
        People p2 = new People("Taha" , a1 , r2);
        a1.set_people(p1);
        a1.set_people(p2);
        a1.set_rides(r1);
        a1.set_rides(r2);
        System.out.println("Amusement Park = " + a1.get_name());
        System.out.println("Rides = " + a1.get_rides());
        System.out.println("People = " + a1.get_people());
        // System.out.println()


    }
}