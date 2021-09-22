import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class DefenciveBatsmanTest {
    @Test
    void shouldReturnTrueIfDefenciveBatsmanHitsOnlyBetweenZeroToThree() {
        Batsman normalBatsman= mock(NormalBatsman.class);
        List<Integer> requiredRun =asList(0,1,2,3);

        when(normalBatsman.bat()).thenReturn(3);

        assertTrue(requiredRun.contains(normalBatsman.bat()));

    }
    @Test
    void shouldReturnTrueIfDefenciveBatsmanHitsMoreThanThree() {
        Batsman normalBatsman= mock(NormalBatsman.class);
        List<Integer> requiredRun =asList(0,1,2,3);

        when(normalBatsman.bat()).thenReturn(5);

        assertFalse(requiredRun.contains(normalBatsman.bat()));

    }
}
