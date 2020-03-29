import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Shipment implements Iterable
{
    public static final int LENGTH_ALLOWED = 200;
    List <Product> prodz = new ArrayList<>();
    public void add(Product product)
    {
        prodz.add(product);
    }

    @Override
    public Iterator iterator()
    {
        return prodz.iterator() ;
    }
}
