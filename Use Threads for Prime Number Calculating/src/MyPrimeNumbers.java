import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class MyPrimeNumbers {
    ArrayList<Long> primeList;

    MyPrimeNumbers() {
        primeList = new ArrayList<Long>();
    }

    /**
     * adds a prime to the list
     *
     * method is synchornized, since accessing the ArrayList
     * is a critical operation. Otherwise, the list might become corrupted
     * @param prime
     */
    public synchronized void addPrime(long prime) {
        primeList.add(prime);
    }

    public void print() {
        Collections.sort(primeList);
        Iterator<Long> iterator = primeList.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
