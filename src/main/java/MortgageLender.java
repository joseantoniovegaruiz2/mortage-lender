public class MortgageLender {
    private double funds;

    public void addDeposit(double amountDeposit) {
        funds+=amountDeposit;
    }

    public  double checkAvailableFunds() {
        return funds;
    }

    public String applyLoan() {
        return "approved";
    }
}
