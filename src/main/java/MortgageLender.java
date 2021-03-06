import java.util.ArrayList;
import java.util.List;

public class MortgageLender {
    private double funds;
    private double pendingFunds;
    private List<Loan> loanList=new ArrayList<>();

    public void addDeposit(double amountDeposit) {
        funds+=amountDeposit;
    }

    public  double checkAvailableFunds() {
        return funds;
    }

    public String applyLoan(Loan loan) {
        if (loan.getAmount() <= this.funds) {
            pendingFunds=+loan.getAmount();
            funds-=loan.getAmount();
            loan.setStatus("pending");
            return "approved";
        }
        return "denied";
    }

    public boolean getApplicantQualificationStatus(double loanAmt, int dti, int creditScore, double savings) {
        return dti < 36 && creditScore > 620 && savings >= (loanAmt * .25);
    }

}
