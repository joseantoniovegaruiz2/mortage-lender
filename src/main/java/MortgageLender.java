import java.util.ArrayList;
import java.util.List;

public class MortgageLender {
    private double funds;
    private double pendingFunds;
    private List<Loan> pendingLoan=new ArrayList<>();

    public void addDeposit(double amountDeposit) {
        funds+=amountDeposit;
    }

    public  double checkAvailableFunds() {
        return funds - pendingFunds;
    }

    public String applyLoan(Loan loan) {
        if (loan.getAmount() <= this.checkAvailableFunds()) {
            pendingFunds=+loan.getAmount();
            loan.setStatus("pending");
            pendingLoan.add(loan);
            return "approved";
        }
        return "denied";
    }

    public boolean getApplicantQualificationStatus(CustomerProfile customerProfile, double loanAmt) {
        return customerProfile.getDti() < 36 && customerProfile.getCredit_score() > 620 && customerProfile.getSavings() >= (loanAmt * .25);
    }

}
