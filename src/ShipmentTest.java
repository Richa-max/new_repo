import org.junit.Assert;
import org.junit.Test;

public class ShipmentTest
{
    Shipment shipment = new Shipment();
    public void shouldAddItems()
    {
        shipment.add(Productfixtures.window);
        shipment.add(Productfixtures.doorpanel);
        @Test
        Assert.assertThat();
    }


}