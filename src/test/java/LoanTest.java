import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class LoanTest {
    @Test
    public void checkLoanExpirationTest() {
        Loan loan = new Loan(1, 5000);
        loan.setOfferDate(LocalDate.now());
        assertFalse(loan.checkLoanExpiration(LocalDate.now()));

    }

}
