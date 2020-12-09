
package readcsv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadCSV 
{

    public static void main(String[] args) 
    {
		    // προσοχή στη γραμμή που ακολουθεί πρέπει να βάλετε (στη μεταβλητή csvFile) το 
		    // ακριβές ΔΙΚΟ ΣΑΣ path για το csv αρχείο που θέλετε να ανοίξετε και να διαβάσετε
        
        String csvFile = "C:\\csvfile2.csv";
        String line="";
        String csvSplitBy = ",";
        
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile)))
        {
            while ((line = br.readLine()) != null)
            {
                String[] allStrings = line.split(csvSplitBy);
                System.out.println(allStrings[1]);
            }
            br.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        
    }
    
}
