public class Auctioneer {

    double biggestBid = Double.NEGATIVE_INFINITY;

    public void evaluate(Auction auction) {
        for(Bid bid : auction.getBids()) {
            if(bid.getValue() > biggestBid) {
                biggestBid = bid.getValue();
            }
        }
    }

    public double getBiggestBid() {
        return biggestBid;
    }
}
