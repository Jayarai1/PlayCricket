import java.util.Random;

public class HitterBatsman implements Batsman {

    @Override
    public int bat() {
        int[] hitManRun = {0, 4, 6};
        Random rand = new Random();
        int index = rand.nextInt(3);
        return hitManRun[index];
    }
}
