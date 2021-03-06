public class Loan {

    public Loan(int loanId, double amount) {
        this.loanId = loanId;
        this.amount=amount;

    }

    public int getLoanId() {
        return loanId;
    }

    public void setLoanId(int loanId) {
        this.loanId = loanId;
    }

    int loanId;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String isStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    double amount;
    String status;

    public String status() {
        return "pending";
    }
}
