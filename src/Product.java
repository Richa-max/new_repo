public class Product
{
    public int length, width;
    public Product(int length, int width)
    {
        this.length = length ;
        this.width = width;
    }

    public int getLength()
    {
        return length;
    }

    public int getWidth()
    {
        return width;
    }

    @Override
    public String toString() {
        return "Product{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}