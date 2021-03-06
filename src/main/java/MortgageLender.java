import java.util.ArrayList;
import java.util.List;

public class MortgageLender {
    private double funds;
    private double pendingFunds;
    private List<Loan> pendingLoan=new ArrayList<>();
    private String loanOffer;

    public void addDeposit(double amountDeposit) {
        funds+=amountDeposit;
    }

    public  double checkAvailableFunds() {
        return funds - pendingFunds;
    }

    public String applyLoan(Loan loan) {
        if (loan.getAmount() <= this.checkAvailableFunds()) {
            pendingFunds=+loan.getAmount();
            loan.setLoanStatus("pending");
            pendingLoan.add(loan);
            return "approved";
        }
        return "denied";
    }

    public boolean getApplicantQualificationStatus(CustomerProfile customerProfile, double loanAmt) {
        return customerProfile.getDti() < 36 && customerProfile.getCredit_score() > 620 && customerProfile.getSavings() >= (loanAmt * .25);
    }

    public String sendLoanOffer(Loan loan) {
        loan.setLoanOffer("sent");
        return loan.getLoanOffer();
    }

    public String acceptLoan(Loan loan2) {
        loan2.setLoanStatus( "accepted");
        return loan2.getLoanStatus();
    }

    public String rejectLoanOffer(Loan loan3) {

        loan3.setLoanStatus("rejected");
        loan3.setLoanOffer("rejected");
        return loan3.getLoanStatus();
    }


    public String rejectLoanStatus(Loan loan3) {
           loan3.setLoanStatus("rejected");
            returnFunds(loan3);
           return loan3.getLoanStatus();

    }
    public void returnFunds (Loan loan){
        pendingFunds-=loan.amount;
        funds=+loan.amount;
    }
}
