public class Bonus {
    public static void main(String[] args) {
        int paymentKop=10000;
        int bonus=paymentKop/100/100;
        int balance=200;
        int limitKop=100000;
        if (paymentKop<limitKop) {
            bonus=0;
        }
        System.out.println(bonus);
    }
}
