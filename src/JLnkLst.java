import java.text.DecimalFormat;

public class JLnkLst
{
    private LISTENTRY head;
    private LISTENTRY tail;

    public void InsertIntoList(String newRecord)
    {
        LISTENTRY nextEntry = new LISTENTRY(newRecord);

        if (head == null)
        {
            head = nextEntry;
            tail = head;
            System.out.println("List Empty");
        }
        else
        if (nextEntry.data.compareTo(head.data)<0)
        {
            nextEntry.next = head;
            head = nextEntry;
            System.out.println("Inserted Before");
        }
        else
        if (nextEntry.data.compareTo(tail.data)>0)
        {
            tail.next = nextEntry;
            tail = nextEntry;
            System.out.println("Inserted After");
        }
        else
        {
            LISTENTRY tmpPtr = head;
            while (tmpPtr.next.data.compareTo(nextEntry.data) < 0)
                tmpPtr = tmpPtr.next;
            nextEntry.next = tmpPtr.next;
            tmpPtr.next = nextEntry;
            System.out.println("Inserted into Middle");
        }
    } // InsertToList

    public void printList()
    {
        LISTENTRY tmpPtr = head;
        short count = 1;

        System.out.println("Enter print .... ");
        while(tmpPtr != null)
        {
            System.out.println("Record " + new DecimalFormat("99").format(count++)+tmpPtr.data + " ");
            tmpPtr = tmpPtr.next;
        }
        System.out.println("Exit print ...");
    }
} // JLnkLst
