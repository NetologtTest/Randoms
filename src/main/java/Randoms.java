import java.util.Iterator;
import java.util.Random;


public class Randoms implements Iterable<Integer> {
    protected Random random = new Random();
    int min;
    int max;

    public Randoms(int min, int max) {
        this.max = max;
        this.min = min;

    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {


            int randomNum;
            int result;

            @Override
            public boolean hasNext() {


                result = max - min + 1;
                if (result - 1 >= max - min) {
                    return true;
                } else return false;

            }

            @Override
            public Integer next() {


                randomNum = random.nextInt(result) + min;
                return randomNum;
            }

        };
    }
}
