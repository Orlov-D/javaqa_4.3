public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int creditSum = 1_000_000;
        int years = 1;

        int monthlyPayment = service.calculate(creditSum, years);
        System.out.println("Ежемесячный платеж = " + monthlyPayment);

        monthlyPayment = service.calculate(creditSum, 2);
        System.out.println("Ежемесячный платеж = " + monthlyPayment);

        monthlyPayment = service.calculate(creditSum, 3);
        System.out.println("Ежемесячный платеж = " + monthlyPayment);
    }
}