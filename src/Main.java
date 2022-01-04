public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int credit = 1_000_000;
        float loanRate = (float) 9.99;
        int creditTerm;
        int monthPayment1 = (int) service.calculate(credit, loanRate, 12);
        int monthPayment2 = (int) service.calculate(credit, loanRate, 24);
        int monthPayment3 = (int) service.calculate(credit, loanRate, 36);

        System.out.println("Вариант 1: " + monthPayment1);
        System.out.println("Вариант 2: " + monthPayment2);
        System.out.println("Вариант 3: " + monthPayment3);
    }
}
