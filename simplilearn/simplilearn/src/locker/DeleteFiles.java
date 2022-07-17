package locker;

import java.io.File;
import java.io.IOException;

public class DeleteFiles {
    public static void main(String[] args) {
        try
        {
            File f= new File("C:\\Users\\LENOVO\\Documents\\sample1");           //file to be delete
            if(f.delete())                      //returns Boolean value
            {
                System.out.println(f.getName() + " deleted");   //getting and printing the file name
            }
            else
            {
                System.out.println("failed");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
