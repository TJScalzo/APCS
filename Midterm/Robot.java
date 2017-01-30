public class Robot
{
    private int[] hall;
    private int pos;             // current position (tile number) of Robot
    private boolean facingRight; // true means this Robot is facing right
    private int numMoves;
    
    public Robot()
    {
        hall = new int[] {1, 2, 0, 1};
        pos = 2;
        facingRight = true;
        numMoves = 0;
    }
    
    public Robot(int[] hall, int pos, boolean facingRight)
    {
        this.hall = hall;
        this.pos = pos;
        this.facingRight = facingRight;
        numMoves = 0;
    }
    
    private boolean forwardMoveBlocked()
    {
        int last = hall.length - 1;
        if(facingRight && pos == last)
            return true;
        else if(!facingRight && pos == 0)
            return true;
        else
            return false;
    }

    private void move()
    {
        int numItems = hall[pos]; // number of items on current tile
        if(numItems > 0)
            hall[pos] = numItems - 1;
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
        while(!hallIsClear()) {
            if(numMoves == 0)
                printHall();
            move();
            numMoves++;
            printHall();
        }
        return numMoves;
    }
    
    private boolean hallIsClear()
    {
        int numItems = 0;
        for(int i = 0; i < hall.length; i++)
            numItems += hall[i];
        return numItems == 0;
    }
    
    private void printHall()
    {
        System.out.println("MOVE " + numMoves);
        String tiles = "Tiles  ";
        String divider = "       ";
        String items = "Items  ";
        String robot = "robot  ";
        for(int i = 0; i < hall.length; i++) {
            tiles += i + "    ";
            String itemSpacing = "     ";
            int itemLength = String.valueOf(hall[i]).length();
            itemSpacing = itemSpacing.substring(itemLength);
            items += hall[i] + itemSpacing;
            divider += "----";
            if(i == pos) {
                if(facingRight)
                    robot += ">";
                else
                    robot += "<";
            } else {
                robot += "     ";
            }
        }
        System.out.println(tiles);
        System.out.println(divider);
        System.out.println(items);
        System.out.println(robot);
        System.out.println();
        System.out.println();
    }
}