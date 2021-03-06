public class Loan {

    int loanId;
    double amount;
    String status;
    CustomerProfile customerProfile;

    public Loan(int loanId, double amount, CustomerProfile customerProfile) {
        this.loanId = loanId;
        this.amount=amount;
        this.customerProfile = customerProfile;

    }
    public Loan(int loanId, double amount) {
        this.loanId = loanId;
        this.amount=amount;
        this.customerProfile = null;

    }



    public int getLoanId() {
        return loanId;
    }

    public void setLoanId(int loanId) {
        this.loanId = loanId;
    }

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

    public CustomerProfile getCustomerProfile() {
        return customerProfile;
    }

    public void setCustomerProfile(CustomerProfile customerProfile) {
        this.customerProfile = customerProfile;
    }



    public String status() {
        return "pending";
    }
}
