import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.Test;

class WatermelonTest {
    int w = 8;

    @Test
    public void isEven(){
        Watermelon kilos = new Watermelon();
        assertTrue(kilos.isEven(w)==true);
    }

}