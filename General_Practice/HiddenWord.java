public class HiddenWord {
    private String puzzle;
    private int l;
    // Constructor
    public HiddenWord(String puzzle) {
        this.puzzle = puzzle;
        this.l = puzzle.length();
    }
    // Method
    public String getHint(String guess) {
        String hint = "";
        if(guess.equals(puzzle)) {
            hint = puzzle;
        } else {
            for(int i = 0; i < l; i++) {
                hint += "*";
            } // Made default/blank hint
            for(int i = 0; i < l; i++) {
                String digit = guess.substring(i, i+1);
                int index = puzzle.indexOf(digit);
                if(index == i) {
                    hint = hint.substring(0, i) + digit + hint.substring(i+1);
                }
                if(index > -1) {
                    for(int x = 0; x < l; x++) {
                        if(x == i) x = i+1;
                        if(digit.equals(puzzle.substring(x, x+1))) {
                            hint = hint.substring(0, x) + "+" + hint.substring(x+1);
                        }
                    }
                }
            }
        }
        return hint;
    }
}