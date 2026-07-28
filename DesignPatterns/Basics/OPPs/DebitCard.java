package DesignPatterns.Basics.OPPs;

public class DebitCard extends Card {
    public DebitCard(String cardNo, String userName) {
        super(cardNo, userName);
    }
    @Override
    public void pay() {
        System.out.println("Payment made using Debit Card: " + getCardNo() + " by user " + userName);
    }

}
