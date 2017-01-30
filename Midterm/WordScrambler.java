public class WordScrambler
{
    private String[] scrambledWords;
    private String[] unscrambledWords = {"word", "grape", "apple", "orange"};
    
    public WordScrambler()
    {
        scrambledWords = mixedWords(unscrambledWords);
    }
    
    public WordScrambler(String[] wordArr)
    {
        unscrambledWords = wordArr;
        scrambledWords = mixedWords(unscrambledWords);
    }
    
    private String recombine(String word1, String word2)
    {
        int half1 = word1.length()/2;
        int half2 = word2.length()/2;
        
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
    
    public void printWords()
    {
        System.out.print("Unscrambled:");
        for(int i = 0; i < unscrambledWords.length - 1; i++) {
            System.out.print(" " + unscrambledWords[i]);
        }
        System.out.println();
        System.out.print("Scrambled:");
        for(int i = 0; i < scrambledWords.length - 1; i++) {
            System.out.print(" " + scrambledWords[i]);
        }
    }
}