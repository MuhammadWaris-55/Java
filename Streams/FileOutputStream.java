//This code is used to create a file and write characters into it using FileOutputStream.
//BufferedOutputStream stores data temporarily and writes it more efficiently to the file when closed.

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStream {
    public static void main(String[] args) {
        FileOutputStream os=null;
        try{
            os=new FileOutputStream("my Data.txt");
            BufferedOutputStream bs=new BufferedOutputStream(os);
            // Write ASCII characters 65-74 (A-J) to file
            for (int i = 65; i < 75; i++) {
                os.write(i);
            }
        } catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}
