import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

        mortgageLender.addDeposit(100);
        assertEquals(100,mortgageLender.checkAvailableFunds());
    }



}
