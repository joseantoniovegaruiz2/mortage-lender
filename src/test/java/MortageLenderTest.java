import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MortageLenderTest {
//    When I check my available funds
//    Then I should see how much funds I currently have

    @Test
    public void checkAvailableFundsTest(){
        MortageLender mortageLender=new MortageLender();

        assertEquals(0.0,mortageLender.checkAvailableFunds());
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
        MortageLender mortageLender=new MortageLender();

        mortageLender.addDeposit(100);
        assertEquals(100,mortageLender.checkAvailableFunds());



    }



}
