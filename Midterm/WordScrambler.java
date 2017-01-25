public class WordScrambler
{
    private String[] scrambledWords;
    private String[] defaultWords = {"word", "grape", "apple", "orange"};
    
    public WordScrambler()
    {
        scrambledWords = mixedWords(defaultWords);
    }
    
    public WordScrambler(String[] wordArr)
    {
        scrambledWords = mixedWords(wordArr);
    }
    
    private String recombine(String word1, String word2)
    {
        int half1 = (int) word1.length()/2;
        int half2 = (int) word2.length()/2;
        
        String part1 = word1.substring(0, half1);
        String part2 = word2.substring(half2);
        
        return part1 + part2;
    }
    
    private String[] mixedWords(String[] words)
    {
        String[] newWords = new String[words.length];
        for(int i = 0; i < words.length; i += 2){
            String word1 = recombine(words[i], words[i+1]);
            String word2 = recombine(words[i+1], words[i]);
            newWords[i] = word1;
            newWords[i+1] = word2;
        }
        return newWords;
    }
}



