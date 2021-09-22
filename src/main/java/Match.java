public class Match {

    private final Batsman batsman;
    private final Baller baller;
    private final int over;
    private final int target;
    private int score;
    private boolean isWon;


    public Match(Batsman batsman, Baller baller, int target, int over) {
        this.batsman = batsman;
        this.baller = baller;
        this.target = target;
        this.score = 0;
        this.over=over;
    }

    private void playCricket()
    {
        int currentRun;
        int currentBall;
        for(int ballNumber=0;ballNumber<6*over;ballNumber++){
            currentBall=baller.ball();
            currentRun=batsman.bat();
            if(currentRun==currentBall)
            {
                isWon=false;
                break;
            }
            else {
                score += currentRun;
                if (score >= target) {
                    isWon = true;
                    break;
                }
            }

        }
    }


    public boolean isTargetMet()
    {
        playCricket();
        return isWon;

    }
}
