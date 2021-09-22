import java.util.Random;

public class Baller {

    public int ball()
    {
        Random rand=new Random();
        return rand.nextInt(7);
    }
}
