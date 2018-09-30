import com.edionay.auctionay.model.Auction;
import com.edionay.auctionay.model.Bid;
import com.edionay.auctionay.model.User;
import com.edionay.auctionay.service.Auctioneer;
import org.junit.Assert;
import org.junit.Test;

public class AuctioneerTest {

    @Test
    public void main() {

        // Part 1: Scenario
        User edionay = new User("Edionay");
        User pablo = new User("Pablo");
        User angel = new User("Angel");

        Auction auction = new Auction("Nintendo Switch on the box");

        // Part 2: Action
        auction.bid(new Bid(edionay, 250.00));
        auction.bid(new Bid(pablo, 300.00));
        auction.bid(new Bid(angel, 400.00));

        Auctioneer auctioneer = new Auctioneer();
        auctioneer.evaluate(auction);

        // Part 3: Validation

        double highestExpected = 400;
        double lowestExpected = 250;
        Assert.assertEquals(highestExpected, auctioneer.getHighestBid(), 0);


    }
}
