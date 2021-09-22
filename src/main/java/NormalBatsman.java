import java.util.Random;

public class NormalBatsman implements Batsman {

    @Override
    public int bat()
    {
        Random rand = new Random();
        return rand.nextInt(7);
    }
}
