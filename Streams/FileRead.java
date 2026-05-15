import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
    public static void main(String[] args) {
        String filepath = "testing.txt";



        try(BufferedReader reader = new BufferedReader(new FileReader(filepath))){
            System.out.println("Ha Ada Iha File Payi aa");
        }
        catch(FileNotFoundException e){
            System.out.println("Arey File Kon thi Mile");
        }
        catch(IOException e){
            System.out.println("Something Went Wrong");
        }
    }
}
