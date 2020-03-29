import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Supplier implements Iterable
{
    public String sname;

    public Supplier(String sname) {
        this.sname = sname;
    }

    public String getSname()
    {
        return sname;
    }
    public List<Product> product = new ArrayList<>();
    public void add(Product prod1)
    {
        product.add(prod1);
    }
    @Override
    public Iterator iterator() {
        return product.iterator();
    }
}
