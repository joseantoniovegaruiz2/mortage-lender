public class Loan {

    int loanId;
    double amount;
    String loanStatus;
    CustomerProfile customerProfile;
    private String loanOffer;

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
        return loanStatus;
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

    public void setLoanStatus(String sent) {
        this.loanStatus=sent;
    }


    public String getLoanStatus() {
        return this.loanStatus;

    }
    public void setLoanOffer(String sent) {
        this.loanOffer="sent";
    }
    public String getLoanOffer() {
        return this.loanOffer;
    }


}
