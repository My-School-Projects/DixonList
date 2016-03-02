public class LISTENTRY
{
    public LISTENTRY()
    {
        this(new Drecord());
    }
    public LISTENTRY(Drecord newData)
    {
        data = newData;
        next=null;
    }
    public LISTENTRY(LISTENTRY anotherEntry)
    {
        data = anotherEntry.getData();
        next = anotherEntry.getNext();
    }
    public Drecord getData()
    {
        return  data;
    }
    public LISTENTRY getNext()
    {
        return next;
    }
    public void setNext(LISTENTRY refNext)
    {
        next = refNext;
    }
    private Drecord data;
    private LISTENTRY  next;

} // LISTENTRY
