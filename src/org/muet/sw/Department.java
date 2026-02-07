package org.muet.sw;
public class Department{
    public String dname;
    public University belongsto;
    public void set_belongsto(University u){
        this.belongsto = u;
    }
    public String toString(){
        return dname;
    }
}