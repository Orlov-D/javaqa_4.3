public class CreditPaymentService {
    public int calculate(int creditSum, int time) {
        double interestRate = 9.99;
        double interestRateInMonth = interestRate / 100 / 12;
        int monthlyPayment = (int) (creditSum * (interestRateInMonth * Math.pow((1 + interestRateInMonth), time * 12)) / (Math.pow((1 + interestRateInMonth), time * 12) - 1));
//        что-то форматирование кода не помогает
//        есть-ли способ сделать более читабельно?
//        есть вариант приравнять все к переменным в одну букву (Например, monthlyPayment=m)
        return monthlyPayment;
    }
}
