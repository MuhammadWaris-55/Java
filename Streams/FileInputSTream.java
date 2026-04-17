//This code is reading a text file character by character using FileInputStream.
//this code only reads data from an already existing file.
import java.io.FileInputStream;
public class Main {
    public static void main(String[] args) {
        FileInputStream is=null;
        try{
            is= new FileInputStream("my data.txt");
            int next;
            // Read file byte by byte and print as char until end of file (-1)
            while((next=is.read())!=-1){
                System.out.println("next = "+ (char)next);
            }
            is.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}