public class LISTENTRY
{
    public LISTENTRY()
    {
        this(new String());
    }
    public LISTENTRY(String newData)
    {
        data = newData;
        next=null;
    }
    public LISTENTRY(LISTENTRY anotherEntry)
    {
        data = anotherEntry.getData();
        next = anotherEntry.getNext();
    }
    public String getData()
    {
        return data;
    }
    public LISTENTRY getNext()
    {
        return next;
    }
    public void setNext(LISTENTRY refNext)
    {
        next = refNext;
    }
    private String data;
    private LISTENTRY  next;

} // LISTENTRY
