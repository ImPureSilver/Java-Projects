import java.util.Random;

public class NumberGuesser {
    private Random secretNumber = new Random();




    public NumberGuesser(){

    }

    private int makeRandomNumber() {
        int randNum = this.secretNumber.nextInt(50);
        return randNum;
    }
}
