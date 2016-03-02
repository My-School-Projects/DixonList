public class Drecord
{
    public Drecord()
    {
        this(new String());
    }
    public Drecord(String keyValue)
    {
        key=keyValue;
        rank = 0;
        balance = 0;
    }
    public Drecord get()
    {
        return new Drecord();
    }
    public String getKey()
    {
        return key;
    }
    public short getRank()
    {
        return rank;
    }
    public float getBalance()
    {
        return balance;
    }
    private String key;
    private short rank;
    private float balance;
}
