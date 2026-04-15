import java.util.ArrayList;
public class Park{
    String name;
    ArrayList<Rides> rides = new ArrayList<>();       // Rides available in this park
    ArrayList<Visitors> visitors = new ArrayList<>(); // Visitors in this park

    public Park(String name){
        this.name = name;
    }
    public String get_rides(){
        return rides.toString();
    }
    public String get_visitors(){
        return visitors.toString();
    }
    public String get_name(){
        return name;
    }
    public void set_visitors(Visitors v){
        visitors.add(v);
    }
    // Convert list of ride names to Rides objects and add to rides list
    public void set_rides(ArrayList<String> ride){
        for(String r : ride){
            Rides rid = new Rides(r);
            // rid.rname = r;
            rides.add(rid);
        }
    }
}