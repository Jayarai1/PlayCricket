import java.util.Random;

public class DefenciveBatsman implements Batsman{

    @Override
    public int bat()
    {
        Random rand = new Random();
        return rand.nextInt(4);
    }
}
