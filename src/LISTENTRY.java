public class ListEntry
{
    public ListEntry()
    {
        this("");
    }
    public ListEntry(String newData)
    {
        data = newData;
    }
    public String data;
    public ListEntry next;
}
