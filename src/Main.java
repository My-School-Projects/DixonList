import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        String newKey;
        JLnkLst myList = new JLnkLst();
        boolean done = false;

        while (!done)
        {
            System.out.println("Enter a key value or 000 to exit");
            newKey = (new BufferedReader(new InputStreamReader(System.in))).readLine();
            if (newKey.equals("000"))
                done = true;
            else
                myList.insert(newKey);
        }
        myList.print();
    } // main
} // Main
