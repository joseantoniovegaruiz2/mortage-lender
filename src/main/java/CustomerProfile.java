public class CustomerProfile {
    int dti;
    int credit_score;
    double savings;

    public CustomerProfile(int dti, int credit_score, double savings) {
        this.dti = dti;
        this.credit_score = credit_score;
        this.savings = savings;
    }

    public int getDti() {
        return dti;
    }

    public void setDti(int dti) {
        this.dti = dti;
    }

    public int getCredit_score() {
        return credit_score;
    }

    public void setCredit_score(int credit_score) {
        this.credit_score = credit_score;
    }

    public double getSavings() {
        return savings;
    }

    public void setSavings(double savings) {
        this.savings = savings;
    }
}
