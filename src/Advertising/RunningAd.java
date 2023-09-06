package Advertising;

public class RunningAd {
    public static void main(String[] args) {
        Facebook facebook = new Facebook();
        facebook.companyAd();
        Email email = new Email();
        email.companyAd();
        Print print = new Print();
        print.companyAd();


    }
}