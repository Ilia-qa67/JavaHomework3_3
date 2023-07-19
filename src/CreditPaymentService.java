public class CreditPaymentService {
    public double calculate(double credit, double percent, double months) {

        double monthlyPercent = percent / (100 * 12);
        double result = credit * (monthlyPercent / (1 - Math.pow(1 + monthlyPercent, -(months))));

        return result;
    }

}

