import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MortgageLenderTest {
//    When I check my available funds
//    Then I should see how much funds I currently have

    @Test
    public void checkAvailableFundsTest(){
        MortgageLender mortgageLender=new MortgageLender();

        assertEquals(0.0,mortgageLender.checkAvailableFunds());
    }
//
//    When I add <deposit_amount>
//    Then my available funds should be <total>
//
//    Examples:
//            | current_amount | deposit_amount |   total  |
//            |     100,000    |      50,000    | 150,000  |
//            |     200,000    |      30,000    | 230,000  |
    @Test
    public void AddDepositAmount_And_checkAvailableFunds(){
        MortgageLender mortgageLender=new MortgageLender();

        mortgageLender.addDeposit(100000);
        assertEquals(100000,mortgageLender.checkAvailableFunds());

        mortgageLender.addDeposit(30000);
        assertEquals(130000, mortgageLender.checkAvailableFunds());
    }

    /**
     * As a lender, I want to approve or deny loans base on
     * available funds, so that I don't go bankrupt.
     */
    @Test
    public void applyLoanTest() {
        MortgageLender mortgageLender=new MortgageLender();
        mortgageLender.addDeposit(5000);
        assertEquals("approved", mortgageLender.applyLoan(new Loan(1,5000)));
        mortgageLender.addDeposit(5000);
        assertEquals("denied", mortgageLender.applyLoan(new Loan(2,6000)));
        assertEquals("approved", mortgageLender.applyLoan(new Loan(3,4000)));
    }

    /**
     * Given a loan applicant with <dti> DTI, <credit score> credit score, and <savings> savings
     * When they apply for a loan
     * Then their qualification is <qualification>
     */
    @Test
    public void getApplicantQualificationStatus() {
        MortgageLender mortgageLender = new MortgageLender();

        assertTrue(mortgageLender.getApplicantQualificationStatus(
                new CustomerProfile(21, 700, 100000),250000
        ));

        // failing dti
        assertFalse(mortgageLender.getApplicantQualificationStatus(
                new CustomerProfile(37, 700, 100000),250000));

        // failing credit score
                assertFalse(mortgageLender.getApplicantQualificationStatus(
                        new CustomerProfile(30, 600, 100000),250000));

        // failing savings
        assertFalse(mortgageLender.getApplicantQualificationStatus(
                new CustomerProfile(20, 700, 10000),250000));

    }

//
//    Given I have approved a loan
//    When a loan offer is sent
//    Then the requested loan amount is moved from available funds to pending funds
//    And the loan status is marked as pending
    @Test
    public void When_Approved_loanStatusIsMarkedPending(){
        MortgageLender mortgageLender = new MortgageLender();
        mortgageLender.addDeposit(5000);
        Loan loan =new Loan(1,5000);
        if (mortgageLender.applyLoan(loan).equals("approved")){
            assertEquals(0,mortgageLender.checkAvailableFunds());
            assertEquals("pending",loan.status()) ;
        }
    }

//
//    As a lender, I want to receive response for loan offers, so that I can update the status of
//    pending loans.
//
//    Given I have sent a loan offer to a qualified applicant
//    When the applicant accepts my loan offer
//    Then the loan amount is removed from the pending funds
//    And the loan status is marked as accepted
//
//    Given I have sent a loan offer to a qualified applicant
//    When the applicant rejects my loan offer
//    Then the loan amount is moved from the pending funds back to available funds
//    And the loan status is marked as rejected
        @Test
        public void When_OfferReceived_UpdateLoanStatus() {
            MortgageLender mortgageLender = new MortgageLender();
            Loan loan =new Loan( 1, 5000);
            Loan  loan2=new Loan( 1, 10000);
            Loan  loan3=new Loan( 1, 30000);
            assertEquals("sent",mortgageLender.sendLoanOffer(loan));
            assertEquals("accepted",mortgageLender.acceptLoan(loan2));
            assertEquals("rejected",mortgageLender.rejectLoanStatus(loan3));
        }




}
