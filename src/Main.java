import java.io.*;
import java.text.DecimalFormat;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        Drecord newRecord;
        String newKey;
        JLnkLst myList = new JLnkLst();
        boolean Done = false;

        while (!Done)
        {
            System.out.println("Enter a key value ");
            newKey = (new BufferedReader(new InputStreamReader(System.in))).readLine();
            newRecord = new Drecord(newKey);
            // System.out.println(newRecord.getKey());
            if (newRecord.getKey().equals("000"))
                Done = true;
            else
                myList.InsertIntoList(newRecord);
        }
        myList.printList();
    } // main
} // Main
