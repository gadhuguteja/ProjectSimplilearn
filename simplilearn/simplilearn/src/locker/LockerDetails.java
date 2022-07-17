package locker;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LockerDetails {
    static String Projectpath="C:\\Users\\LENOVO\\Documents\\Custom Office Templates";
    public static void main(String[] args) throws IOException
    {
        Scanner Obj=new Scanner(System.in);
        int ch;
        do
        {
            displayMenu();
            System.out.println("Enter your choice");
            ch=Integer.parseInt(Obj.nextLine());
            switch(ch)
            {
                case 1:getallFiles();
                    break;
                case 2:createFile();
                    break;
                case 3:deleteFiles();
                    break;
                case 4:searchFiles();
                    break;
                case 5:System.exit(0);
                    break;
                default:System.out.println("invalid option");
                    break;
            }
            Obj.next();
        }
        while(ch>0);


    }
    public static void displayMenu()
    {

        System.out.println("********************************************************");
        System.out.println("\t\tWELCOME TO COMPANY LOCKERS --Locked Me.Com\t\t");
        System.out.println("\t\t Developer Name:Surya Teja\t\t");
        System.out.println("********************************************************");
        System.out.println("\t\t1.Displaying all the files");
        System.out.println("\t\t2.Adding files to the existing directory");
        System.out.println("\t\t3.Deleting the file");
        System.out.println("\t\t4.Searching the file");
        System.out.println("\t\t5.Exit");
        System.out.println("********************************************************");
    }

    public static void getallFiles()

    {
        File[] listoffiles=new File(Projectpath).listFiles();
        if(listoffiles.length==0)
            System.out.println("No files exist in the directory");
        else
        {
            for(var l:listoffiles)
            {
                System.out.println(l.getName());
            }
        }



    }
    public static void createFile() throws IOException
    {
        try
        {
            Scanner obj=new Scanner(System.in);
            String fileName;
            int linesCount;

            System.out.println("Enter the filename");
            fileName=obj.nextLine();
            System.out.println("Enter how many line you want to add in the file");
            linesCount=Integer.parseInt(obj.nextLine());
            FileWriter fw=new FileWriter(Projectpath+"\\"+fileName);

            for(int i=1;i<=linesCount;i++)
            {
                System.out.println("Enter the content");
                fw.write(obj.nextLine()+"\n");
            }
            System.out.println("File is created successfully");
            fw.close();
        }
        catch(Exception ex)
        {
            System.out.println("some error occured");
        }

    }
    public static void deleteFiles()
    {
        Scanner obj=new Scanner(System.in);
        try
        {
            String fileName;
            System.out.println("Enter the filename to be deleted");
            fileName=obj.nextLine();

            File fileName1=new File(Projectpath+"\\"+fileName);
            if(fileName1.exists())
            {
                fileName1.delete();
                System.out.println("File deleted successfully");
            }
            else
            {
                System.out.println("file do not exists");
            }}
        catch(Exception ex)
        {

            System.out.println("Exception error");
        }
    }
    public static void searchFiles()
    {
        //search Files

        Scanner obj=new Scanner(System.in);
        try
        {
            String fileName;
            System.out.println("Enter the filename to be searched");
            fileName=obj.nextLine();

            File fileName1=new File(Projectpath);
            if(fileName1.exists())
            {
                System.out.println("File searched successfully");
            }
            else
            {
                System.out.println("file do not exists");
            }}
        catch(Exception ex)
        {

            System.out.println("Exception error");
        }
    }
}

