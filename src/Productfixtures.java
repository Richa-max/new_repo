public class Productfixtures
{
    public static Product glass = new Product(100,200);
    public static Product window = new Product(200,300);
    public static Product doorpanel = new Product(300,400);

    public static Supplier bobes = new Supplier("This is INDI and Corp");
    public static Supplier kates = new Supplier("This is German");
    static
    {
        bobes.product.add(glass);
        bobes.product.add(window);
        kates.product.add(glass);
        kates.product.add(window);
    }



}
