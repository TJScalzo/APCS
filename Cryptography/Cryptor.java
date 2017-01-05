public class Cryptor
{
    static String plainAlphabet = "abcdefghigklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private String cipherAlphabet;

    public Cryptor()
    {
        Key key = new Key();
        cipherAlphabet = makeCipher(key);
    }
    public Cryptor(Key key)
    {
        cipherAlphabet = makeCipher(key);
    }

    private String makeCipher(Key key)
    {
        String keyWord = key.returnkeyWord().replaceAll("(.)(?=.*\\1)", ""); // This is regex and it removes duplicates
        String temp = plainAlphabet;
        for(int i = 0; i < keyWord.length(); i++) // Remove letters in key from alphabet
        {
            String digit = keyWord.substring(i, i+1);
            int index = temp.indexOf(digit);
            temp = temp.substring(0, index) + temp.substring(index+1);
        }
        temp = keyWord + temp; // Add keyword to front of alphabet
        int shift = key.returnShift();
        temp = temp.substring(shift) + temp.substring(0, shift+1);
        return temp;
    }
    
    public Message cipher(Message message)
    {
        // Create labeled variables for alphabets
        String toAlphabet;
        String fromAlphabet;
        if(message.returnIsCiphered())
        {
            toAlphabet = plainAlphabet;
            fromAlphabet = cipherAlphabet;
        } else {
            toAlphabet = cipherAlphabet;
            fromAlphabet = plainAlphabet;
        }
        String statement = message.returnStatement();
        for(int i = 0; i < statement.length(); i++)
        {
            String digit = statement.substring(i, i+1);
            int index = fromAlphabet.indexOf(digit);
            if(index != -1)
            {
                statement = statement.substring(0, i) + toAlphabet.substring(index, index+1) + statement.substring(i+1);
            }
        }
        Message newMessage = new Message(statement, !message.returnIsCiphered());
        return newMessage;
    }
}
