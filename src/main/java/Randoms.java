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

            int result;
            @Override
            public boolean hasNext() {
                while (true) {
                    result = random.nextInt(max+1);
                    if (result >= min) {
                        return true;
                    }
                }
            }
            @Override
            public Integer next() {

                return result;
            }

        };
    }
}