import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

public class EquilibriumTest {

    @Test
    public void addCoordinates(){
        Equilibrium F = new Equilibrium();
        int sum = F.addCoordinates(-4,4);
        assertEquals(0,sum);
        assertTrue(F.addCoordinates(5,3)==8);
        assertTrue(F.addCoordinates(-7,-2)==-9);
    }
}

