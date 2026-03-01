import java.util.ArrayList;
public class Park{
    String name;
    ArrayList<Rides> rides = new ArrayList<>();
    ArrayList<Visitors> visitors = new ArrayList<>();
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
    public void set_rides(ArrayList<String> ride){
        for(String r : ride){
            Rides rid = new Rides(r);
            // rid.rname = r;
            rides.add(rid);
        }
    }
}