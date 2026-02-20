import java.util.ArrayList;
public class Amusement{
    public String name;
    ArrayList<Rides> rideslist = new ArrayList<>();
    ArrayList<People> peoplelist = new ArrayList<>();
    public Amusement(String name){
        this.name = name;
    }
    public String get_rides(){
        return rideslist.toString();
    }
    public String get_people(){
        return peoplelist.toString();
    }
    public String get_name(){
        return name;
    }
    public void set_rides(Rides r){
        rideslist.add(r);
    }
    public void set_people(People p){
        peoplelist.add(p);
    }
}