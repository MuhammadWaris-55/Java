public class department{
    public String dname;
    public university belongsto;
    public department(String dname , university x){
        this.dname = dname;
        this.belongsto = x;
    }
    public String get_dname(){
        return dname;
    }
    public String toString(){
        return dname;
    }
}