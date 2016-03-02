import java.text.DecimalFormat;

public class JLnkLst
{
    private LISTENTRY head;
    private LISTENTRY tail;

    public JLnkLst()
    {
        head = null;
        tail = null;
    }

    public void InsertIntoList(String newRecord)
    {
        LISTENTRY nextEntry = new LISTENTRY(newRecord);

        if (head == null)
        { head = nextEntry;
            tail = head;
            System.out.println("Empty");
        }
        else
        if (nextEntry.getData().compareTo(head.getData())<0)
        {
            nextEntry.setNext(head);
            head = nextEntry;
            System.out.println("Before");
        }
        else
        if (nextEntry.getData().compareTo(tail.getData())>0)
        {
            tail.setNext(nextEntry);
            tail = nextEntry;
            System.out.println("After");
        }
        else
        {
            LISTENTRY tmpPtr = head;
            while (tmpPtr.getNext().getData().compareTo(nextEntry.getData()) < 0)
                tmpPtr = tmpPtr.getNext();
            nextEntry.setNext(tmpPtr.getNext());
            tmpPtr.setNext(nextEntry);
            System.out.println("Middle");
        }
    } // InsertToList

    public void printList()
    {
        LISTENTRY tmpPtr = head;
        short count = 1;

        System.out.println("Enter print .... ");
        while(tmpPtr != null)
        {
            System.out.println("Record " + new DecimalFormat("99").format(count++)+tmpPtr.getData() + " ");
            tmpPtr = tmpPtr.getNext();
        }
        System.out.println("Exit print ...");
    }
} // JLnkLst
