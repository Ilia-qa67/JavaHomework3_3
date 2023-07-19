public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();

        System.out.println("Сумма кредита: 1.000.000 Процентная ставка: 9.99% Срок кредита: 12");
        System.out.println("Ежемесяцный платеж: " + (int)service.calculate(1_000_000, 9.99, 12));

        System.out.println();
        System.out.println("Сумма кредита: 1.000.000 Процентная ставка: 9.99% Срок кредита: 24");
        System.out.println("Ежемесяцный платеж: " + (int)service.calculate(1_000_000, 9.99, 24));

        System.out.println();
        System.out.println("Сумма кредита: 1.000.000 Процентная ставка: 9.99% Срок кредита: 36");
        System.out.println("Ежемесяцный платеж: " + (int)service.calculate(1_000_000, 9.99, 36));

    }
}