import java.util.ArrayList;
public class Recordmanagement{
    ArrayList<Record> records = new ArrayList<>(); 

    public void addrecord(Record r) throws Exception {
        if(r.year < 1996 || r.year > 2026){
            throw new Exception("Year must be between 1996 and 2026");
        }
        records.add(r);
    }

    public void printrecords(){
        for(Record r : records){
            System.out.println("Name: "  + r.name + ". year: " + r.year);
        }
    }


    public static void main(String[] args){

        Recordmanagement manager = new Recordmanagement();

        try{
            Record r1 = new Record("My song" , 1995);

            manager.addrecord(r1);
            manager.printrecords();
        }catch(Exception e){
            System.out.println("Exception caught " +  e.getMessage()); 
        }
    }
}