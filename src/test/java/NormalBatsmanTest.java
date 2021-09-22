import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class NormalBatsmanTest {
    @Test
    void shouldReturnTrueIfNormalBatsmanHitsBetweenZeroToSix() {
        Batsman normalBatsman= mock(NormalBatsman.class);
        List<Integer> requiredRun =asList(0,1,2,3,4,5,6);

        when(normalBatsman.bat()).thenReturn(5);

        assertTrue(requiredRun.contains(normalBatsman.bat()));

    }
    @Test
    void shouldReturnTrueIfNormalBatsmanHitsOtherThanZeroToSix() {
        Batsman normalBatsman= mock(NormalBatsman.class);
        List<Integer> requiredRun =asList(0,1,2,3,4,5,6);

        when(normalBatsman.bat()).thenReturn(7);

        assertFalse(requiredRun.contains(normalBatsman.bat()));

    }
}
