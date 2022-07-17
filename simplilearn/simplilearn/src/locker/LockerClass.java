package locker;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;

public class LockerClass {
    public static void main(String[] args) throws IOException {
        File directoryPath = new File("C:\\Users\\LENOVO\\Downloads");
        FileFilter textFilefilter = new FileFilter(){
            public boolean accept(File file) {
                boolean isFile = file.isFile();
                if (isFile) {
                    return true;
                } else {
                    return false;
                }
            }
        };
        //List of all the text files
        String filesList[] = directoryPath.list();
        System.out.println("List of the text files in the specified directory:");
        for(String fileName : filesList) {
            System.out.println(fileName);
        }

    }
}
