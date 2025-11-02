package DesignPatterns.Basics.OPPs;

abstract public class Card implements PaymentMethod{
    private String cardNo;
    protected String userName;

    public Card(String cardNo, String userName) {
        this.cardNo = cardNo;
        this.userName = userName;
    }

    public String getCardNo(){
        return cardNo;
    }
}


// default access modifier - which is also called as package-private, cause the class is accessible only within its own package.
// public - accessible from any other class
// private - accessible only within the class
// protected - accessible within the package and also outside the package through inheritance only