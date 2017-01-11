public class Key
{
    private int shift;
    private String keyWord;
    public Key()
    {
        shift = 5;
        keyWord = "Cryptography";
    }
    public Key(int shift, String keyWord)
    {
        this.shift = shift;
        this.keyWord = keyWord;
    }
    public int returnShift()
    {
        return shift;
    }
    public String returnkeyWord()
    {
        return keyWord;
    }
}