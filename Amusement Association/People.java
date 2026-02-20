public class People{
    public String pname;
    public Amusement goesto;
    public Rides enjoyes;
    public People(String pname , Amusement a , Rides r){
        this.pname = pname;
        this.goesto = a;
        this.enjoyes = r;
    }
    public String get_Amusementpark(){
        return goesto.get_name();
    }
    public String get_enjoyes(){
        return enjoyes.get_rname();
    }
    public String toString(){
        return pname;
    }
}