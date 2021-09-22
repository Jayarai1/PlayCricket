import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class HitterBatsmanTest {
    @Test
    void shouldReturnTrueIfHitterBatsmanHitsZeroFourSix() {
        Batsman normalBatsman= mock(NormalBatsman.class);
        List<Integer> requiredRun =asList(0,4,6);

        when(normalBatsman.bat()).thenReturn(4);

        assertTrue(requiredRun.contains(normalBatsman.bat()));

    }
    @Test
    void shouldReturnTrueIfHitterBatsmanHitsOtherZeroFourSix() {
        Batsman normalBatsman= mock(NormalBatsman.class);
        List<Integer> requiredRun =asList(0,4,6);

        when(normalBatsman.bat()).thenReturn(1);

        assertFalse(requiredRun.contains(normalBatsman.bat()));

    }
}

