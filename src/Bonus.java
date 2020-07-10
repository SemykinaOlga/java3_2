public class Bonus {
    public static void main(String[] args) {
        int payment_kop=10000;
        int bonus=payment_kop/100/100;
        int balance = 200;
        int limit_kop = 100000;
        if (payment_kop<limit_kop) {
            bonus=0;
        }
        System.out.println(bonus);
    }
}
