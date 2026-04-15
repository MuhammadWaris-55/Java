import java.util.ArrayList;
public class Main{
    public static void main(String[] args){

        // Setup rides and parks
        ArrayList<String> Rides = new ArrayList<>();
        Rides.add("ride-1");
        Rides.add("ride-2");
        Park p1 = new Park("Adventure Land");
        Park p2 = new Park("My Park");
        p1.set_rides(Rides);

        // Setup visitors and assign to parks
        Visitors v1 = new Visitors("Waris");
        Visitors v2 = new Visitors("Ali");
        p1.set_visitors(v1);
        p2.set_visitors(v2);

        System.out.println(p1.get_name());
        System.out.println(p1.get_rides());
    }
}