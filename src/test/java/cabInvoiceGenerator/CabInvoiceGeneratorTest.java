package cabInvoiceGenerator;


import org.junit.Assert;
import org.junit.Test;

public class CabInvoiceGeneratorTest {
    @Test
    public void givenDistanceAndTime_ShouldReturnFare() {
        CabInvoiceGenerator invoiceGenerator = new CabInvoiceGenerator();
        double distance=10.0;
        int time=5;
        double fare=invoiceGenerator.calculateFare(distance,time);
        Assert.assertEquals(105,fare,0.0);
    }

    @Test
    public void givenLessDistanceAndTime_ShouldReturnMinimumFare() {
        CabInvoiceGenerator invoiceGenerator = new CabInvoiceGenerator();
        double distance=0.1;
        int time=1;
        double fare=invoiceGenerator.calculateFare(distance,time);
        Assert.assertEquals(5,fare,0.0);
    }
    @Test
    public void givenMultipleRides_ShouldReturnTotalFare() {
        CabInvoiceGenerator invoiceGenerator = new CabInvoiceGenerator();
        Ride[] rides = {
                new Ride(10.0,5),
                new Ride(0.1,1)
        };
        double totalFare=invoiceGenerator.calculateFare(rides);
        Assert.assertEquals(110,totalFare,0.0);
    }
}