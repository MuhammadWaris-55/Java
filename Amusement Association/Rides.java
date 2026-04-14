public class Rides{
    public String rname;
    public Amusement belongsto; // Park this ride belongs to

    public Rides(String rname , Amusement x){
        this.rname = rname;
        this.belongsto = x;
    }
    public String get_rname(){
        return rname;
    }
    public String toString(){
        return rname;
    }
}