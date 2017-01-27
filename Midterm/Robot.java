public class Robot
{
    private int[] hall;
    private int pos;             // current position (tile number) of Robot
    private boolean facingRight; // true means this Robot is facing right
    
    public Robot()
    {
        hall = new int[] {1, 2, 0, 1};
        pos = 2;
        facingRight = true;
    }
    
    private boolean forwardMoveBlocked()
    {
        int last = hall.length - 1;
        if(facingRight) {
            if(pos == last)
                return true;
            else
                return false;
        } else {
            if(pos == 0)
                return true;
            else
                return false;
        }
    }

    private void move()
    {
        int numItems = hall[pos]; // number of items on current tile
        if(numItems > 0)
            numItems--;
        if(numItems == 0) {
            if(forwardMoveBlocked()) {
                facingRight = !facingRight;
            } else {
                if(facingRight)
                    pos++;
                else
                    pos--;
            }
        }
    }
    
    public int clearHall()
    {
        int numMoves = 0;
        while(!hallIsClear()) {
            move();
            numMoves++;
        }
        return numMoves;
    }
    
    private boolean hallIsClear()
    {
        int numItems = 0;
        for(int i = 0; i < hall.length - 1; i++) {
            numItems += hall[i];
        }
        return numItems == 0;
    }
}