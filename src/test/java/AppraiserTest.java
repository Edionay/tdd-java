import com.edionay.auctionay.model.Auction;
import com.edionay.auctionay.model.Bid;
import com.edionay.auctionay.model.User;
import com.edionay.auctionay.service.Appraiser;
import org.junit.Assert;
import org.junit.Test;

public class AppraiserTest {

    @Test
    public void shouldUnderstandBidsInAscendingOrder() {

        // Part 1: Scenario
        User edionay = new User("Edionay");
        User pablo = new User("Pablo");
        User angel = new User("Angel");

        Auction auction = new Auction("Nintendo Switch on the box");

        // Part 2: Action
        auction.bid(new Bid(edionay, 250.00));
        auction.bid(new Bid(pablo, 300.00));
        auction.bid(new Bid(angel, 400.00));

        Appraiser appraiser = new Appraiser();
        appraiser.evaluate(auction);

        // Part 3: Validation
        double highestExpected = 400;
        double lowestExpected = 250;
        Assert.assertEquals(highestExpected, appraiser.getHighestBid(), 0.00001);
        Assert.assertEquals(lowestExpected, appraiser.getLowestBid(), 0.00001);


    }
}
