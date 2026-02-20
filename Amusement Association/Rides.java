public class Rides{
    public String rname;
    public Amusement belongsto;
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