public class MortgageLender {
    private double funds;

    public void addDeposit(double amountDeposit) {
        funds+=amountDeposit;
    }

    public  double checkAvailableFunds() {
        return funds;
    }

    public String applyLoan(double amount) {
        if (amount <= this.funds) {
            return "approved";
        }
        return "denied";
    }

    public boolean getApplicantQualificationStatus(double loanAmt, int dti, int creditScore, double savings) {
        return dti < 36 && creditScore > 620 && savings >= (loanAmt * .25);
    }
}
