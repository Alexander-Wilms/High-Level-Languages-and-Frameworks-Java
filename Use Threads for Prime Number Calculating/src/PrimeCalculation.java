import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Range: 0..10000
 * 1 Thread: ca. 520 ms
 * 2 Threads: ca. 440 ms
 * 3 Threads: ca. 330 ms
 * 4 Threads: ca. 300 ms
 */

public class PrimeCalculation {
    static MyPrimeNumbers primeNumberStorage;
    static int NUMBER_OF_THREADS = 4;
    static ArrayList<primeThread> threadStorage;
    long t1;

    public static void main(String[] args) {
        try {
            new PrimeCalculation(0, 10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    PrimeCalculation(int low, int high) throws InterruptedException {
        primeNumberStorage = new MyPrimeNumbers();
        threadStorage = new ArrayList<primeThread>();
        int threadLow, threadHigh;

        t1 = System.nanoTime();

        for(int i = 0; i < NUMBER_OF_THREADS; i++) {
            if((int) i * (high-low) / NUMBER_OF_THREADS + low + 1 > 2) {
                threadLow = (int) i * (high-low) / NUMBER_OF_THREADS + low + 1;
            } else {
                threadLow = 2;
            }

            threadHigh = (int) (i + 1) * high / NUMBER_OF_THREADS;

            System.out.println("low " + threadLow + ", high " + threadHigh);
            threadStorage.add(new primeThread(threadLow, threadHigh));
            threadStorage.get(i).start();
        }

        // wait until all threads have finished
        for(int i = 0; i < NUMBER_OF_THREADS; i++) {
            try {
                threadStorage.get(i).join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        long t2 = System.nanoTime();

        primeNumberStorage.print();

        System.out.println("Calculation took " + (t2-t1)/1000000 +  "ms");
    }

    public class primeThread extends Thread {
        long low, high;

        primeThread(int low, int high) {
            this.low = low;
            this.high = high;
        }

        @Override
        public void run() {
            for(long i = low; i <= high; i++) {
                if(prime(i)) {
                    // don't use synchronized(this) here, just declare addPrime to be synchronized
                    primeNumberStorage.addPrime(i);
                }
            }
        }
    }

    public static boolean prime(long number) {
        return checkPrime(number, number);
    }

    public static boolean checkPrime(long number, long div) {
        if(div == number) {
            return checkPrime(number, div-1);
        } else if(div == 1) {
            return true;
        } else {
            if(number % div == 0) {
                return false;
            } else {
                return checkPrime(number, div-1);
            }
        }
    }
}
