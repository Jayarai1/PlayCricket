import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class MatchTest {
    @Test
    void shouldReturnTrueIfTargetMet() {

        Batsman normalBatsman= mock(NormalBatsman.class);
        Baller baller= mock(Baller.class);

        Match playCricket=new Match(normalBatsman, baller,36,2);

        when(normalBatsman.bat()).thenReturn(5);
        when(baller.ball()).thenReturn(6);

        assertTrue(playCricket.isTargetMet());
    }

    @Test
    void shouldReturnFalseIfTargetDoesNotMet() {

        Batsman normalBatsman= mock(NormalBatsman.class);
        Baller baller= mock(Baller.class);

        Match playCricket=new Match(normalBatsman, baller,36,2);

        when(normalBatsman.bat()).thenReturn(2);
        when(baller.ball()).thenReturn(6);

        assertFalse(playCricket.isTargetMet());
    }

    @Test
    void shouldReturnFalseIfBatsmanAndBallerHaveSameNumber() {

        Batsman normalBatsman= mock(NormalBatsman.class);
        Baller baller= mock(Baller.class);

        Match playCricket=new Match(normalBatsman, baller,36,2);

        when(normalBatsman.bat()).thenReturn(6);
        when(baller.ball()).thenReturn(6);

        assertFalse(playCricket.isTargetMet());
    }

}
