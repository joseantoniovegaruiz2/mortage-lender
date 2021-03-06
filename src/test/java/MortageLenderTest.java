import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MortageLenderTest {

    @Test
    public void checkAvailableFundsTest(){
        assertEquals(BigDecimal.ZERO,MortageLender.checkAvailableFunds());
    }

}
