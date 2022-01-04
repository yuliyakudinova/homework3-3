public class CreditPaymentService {
    int credit;
    float loanRate;
    int creditTerm;

    public float calculate(int credit, float loanRate, int creditTerm) {
        float monthlyRate = loanRate / 12 / 100;
        float payment = (float) (credit * ((monthlyRate * Math.pow((1 + monthlyRate), creditTerm)) / (Math.pow((1 + monthlyRate), creditTerm) - 1)));
        return payment;
    }
}
