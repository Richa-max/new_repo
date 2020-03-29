import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Productimpl {
    public static void main(String[] args) {
        Product prod1 = new Product(250, 150);
        Product prod2 = new Product(100, 250);
        Product prod3 = new Product(300, 350);
        List<Product> prodz = new ArrayList<>();
        prodz.add(prod1);
        prodz.add(prod2);
        prodz.add(prod3);
        System.out.println(prodz);
        System.out.println(prodz.size());
        Iterator<Product> it1 = prodz.iterator();
        while (it1.hasNext()) {
            Product prode = it1.next();
            if (prode.getLength() < 300 )
            {
               it1.remove();
            }
        }
        System.out.println(prodz);
        System.out.println(prodz.size());
    }
}


