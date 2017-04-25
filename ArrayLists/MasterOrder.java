import java.util.ArrayList;
import java.util.List;
public class MasterOrder
{
    /** The list of all cookie orders */
    private List<CookieOrder> orders;

    /** Constructs a new MasterOrder object. */
    public MasterOrder()
    {
        orders = new ArrayList<CookieOrder>();
    }

    /** Adds theOrder to the master order.
     *  @param theOrder the cookie order to add to the master order
     */
    public void addOrder(CookieOrder theOrder)
    {
        orders.add(theOrder);
    }

    /** @return the sum of the number of boxes of all of the cookie orders */
    public int getTotalBoxes()
    {
        int total = 0;
        for (CookieOrder c : orders) {
            total += c.getNumBoxes();
        }
        return total;
    }

    /** Removes all cookie orders from the master order that have the same variety of
     *  cookie as cookieVar and returns the total number of boxes that were removed.
     *  @param cookieVar the variety of cookies to remove from the master order
     *  @return the total number of boxes of cookieVar in the cookie orders removed
     */
    public int removeVariety(String cookieVar)
    {
        int removed = 0;
        for (int i = orders.size()-1; i >= 0; i--) {
            if (orders.get(i).getVariety() == cookieVar) {
                removed += orders.remove(i).getNumBoxes();
            }
        }
        return removed;
    }
}