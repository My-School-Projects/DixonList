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

    public void InsertIntoList(Drecord newRecord)
    {
        LISTENTRY nextEntry = new LISTENTRY(newRecord);

        if (head == null)
        { head = nextEntry;
            tail = head;
            System.out.println("Empty");
        }
        else
        if (nextEntry.getData().getKey().compareTo(head.getData().getKey())<0)
        {
            nextEntry.setNext(head);
            head = nextEntry;
            System.out.println("Before");
        }
        else
        if (nextEntry.getData().getKey().compareTo(tail.getData().getKey())>0)
        {
            tail.setNext(nextEntry);
            tail = nextEntry;
            System.out.println("After");
        }
        else
        {
            LISTENTRY tmpPtr = head;
            while (tmpPtr.getNext().getData().getKey().compareTo(nextEntry.getData().getKey()) < 0)
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
            System.out.println("Record " + new DecimalFormat("99").format(count++)+tmpPtr.getData().getKey() + " ");
            tmpPtr = tmpPtr.getNext();
        }
        System.out.println("Exit print ...");
    }
} // JLnkLst
