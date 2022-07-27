import java.util.Random;

public class Question implements SharedConstants {
    Random rand = new Random();

    int ask() {
        int prob = (int) (100 * rand.nextDouble());
        if (prob < 30) return NO;//30%
        else if (prob < 60) return YES;//30%
        else if (prob < 70) return MAYBE;//10%
        else if (prob < 80) return LATER;//10%
        else if (prob < 90) return SOON;//10%
        else return NEVER;//10%

    }
}
