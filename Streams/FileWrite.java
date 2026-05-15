import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;

public class FileWrite {
    public static void main(String[] args) {

        try(FileWriter write = new FileWriter("testing.txt")){
            write.write("I Like BMW");
            System.out.println("File Has been Written");
        }
        catch (FileNotFoundException e){
            System.out.println("File Ji Location Nathi Mile");
        }
        catch (IOException e){
            System.out.println("Kon Likhandam Cha Kande");
        }
    }
}
