package myclientstest;

import java.util.Scanner; 
import java.io.File;  // Import the File class
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;  // Import the IOException class to handle errorsimport java.io.File; 
import java.io.FileNotFoundException; 
import java.util.Properties;


public class MyClientsTest 
{
    public static void main(String[] args) 
    { 
        int c;
        
        do
        {
            c = menu();
            
            if(c == 1)
                newClient();
            if(c == 2)
                listClients();
            if(c == 3)
                deleteClient(); 
        }
        while(c != 4);
    }
    
    public static int menu()
    {
        System.out.println("MENU MyClients v.1");
        System.out.println("-------------------------");
        System.out.println("1. Εισαγωγή Πελάτη");
        System.out.println("2. Λίστα Πελατών");
        System.out.println("3. Διαγραφή Πελάτη");
        System.out.println("4. Έξοδος");
        System.out.println();
        System.out.print("Επιλογή: ");
        
        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();
        
        return choice;
    }
    
    public static void newClient()
    {
        System.out.println("\nΕΙΣΑΓΩΓΗ ΝΕΟΥ ΠΕΛΑΤΗ");
        System.out.println("--------------------");
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Όνομα : ");
        
        String first_name = in.nextLine();
        
        System.out.print("Επώνυμο : ");

        String last_name = in.nextLine();

        System.out.print("E-mail : ");

        String email = in.nextLine();
        
        
        try 
        {
          FileWriter myWriter = new FileWriter("myclients.csv", true);

          myWriter.write(first_name + ',' + last_name + ',' + email + "\n");
          myWriter.close();

          System.out.println("\n\nSuccessfully wrote to the file.\n\n");
        } 
        catch (IOException e) 
        {
          System.out.println("\n\nERROR: An error occurred.\n\n");
          e.printStackTrace();
        }
    }

    public static void listClients()
    {
        System.out.println("\n\nLists Clients");
        System.out.println("------------- \n");
        
        try 
        {
            File myObj = new File("myclients.csv");
            Scanner myReader = new Scanner(myObj);
      
            while (myReader.hasNextLine()) 
            {
                String data = myReader.nextLine();
                System.out.println(data);
            }
      
            myReader.close();
        } 
        catch (FileNotFoundException e) 
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        
        System.out.println("\n");
    }
    
    public static void deleteClient()
    {
        System.out.println("\nΔΙΑΓΡΑΦΗ ΠΕΛΑΤΗ");
        System.out.println("--------------------");
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Επώνυμο: ");
        
        String last_name = in.nextLine();
        
        try
        {
            File inputFile = new File("myclients.csv");
            File tempFile  = new File("myclients.temp");

            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

            String currentLine;

            while((currentLine = reader.readLine()) != null) 
            {
                if(currentLine.contains(last_name) && !last_name.isEmpty()) continue;
                
                writer.write(currentLine + System.getProperty("line.separator"));
            }
        
            writer.close(); 
            reader.close(); 
        
            boolean successful = tempFile.renameTo(inputFile);
            
            if(successful)
            {
                System.out.println("Deleted successfully");
            }
            else
            {
                
            }
        }
        catch(IOException e)
        {
            System.out.println("An error occurred.");
        }
     
        System.out.println("\n");
    }
}
