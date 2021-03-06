import java.util.ArrayList;
import java.util.List;

public class MortgageLender {
    private double funds;
    private List<Loan> pendingLoan=new ArrayList<>();

    public void addDeposit(double amountDeposit) {
        funds+=amountDeposit;
    }

    public  double checkAvailableFunds() {
        return funds - this.getPendingFunds();
    }

    public double getPendingFunds() {
        double totalAmount = 0;
        for (Loan loan: this.pendingLoan) {
            totalAmount+= loan.getAmount();
        }
        return totalAmount;
    }

    public String applyLoan(Loan loan) {
        if (loan.getAmount() <= this.checkAvailableFunds() && loan.isQualificationStatus()) {
            loan.setLoanStatus("pending");
            pendingLoan.add(loan);
            return "approved";
        }
        return "denied";
    }

    public boolean getApplicantQualificationStatus(CustomerProfile customerProfile, double loanAmt) {
        return customerProfile.getDti() < 36 && customerProfile.getCredit_score() > 620 && customerProfile.getSavings() >= (loanAmt * .25);
    }


    public String acceptLoanOffer(Loan loan2) {
        if (this.pendingLoan.contains(loan2)) {
            loan2.setLoanStatus( "accepted");
            return loan2.getLoanStatus();
        }
        return "not found";
    }

    public String rejectLoanOffer(Loan loan3) {
        if (this.pendingLoan.contains(loan3)) {
            loan3.setLoanStatus("rejected");
            returnFunds(loan3);
            return loan3.getLoanStatus();
        }
        return "not found";
    }

    public void returnFunds (Loan loan){
        this.pendingLoan.remove(loan);
    }
}
