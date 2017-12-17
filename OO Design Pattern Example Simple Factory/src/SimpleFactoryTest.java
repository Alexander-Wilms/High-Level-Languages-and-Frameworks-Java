import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

public class SimpleFactoryTest {
    public Thread myThread;

    public class myRunnable implements Runnable {
        @Override
        public void run() {
            while(true) {
                System.out.println(this.hashCode());
            }
        }
    }

    SimpleFactoryTest() {
        SimpleFactory myFactory = new SimpleFactory();

        myRunnable myRunnableInstance = new myRunnable();
        Thread thread1 = myFactory.newThread(myRunnableInstance);
        thread1.start();

        myRunnable myRunnableInstance2 = new myRunnable();
        Thread thread2 = myFactory.newThread(myRunnableInstance2);
        thread2.start();
    }

    public class SimpleFactory implements ThreadFactory {

        private AtomicLong Threadcounter = new AtomicLong();
        private final String THREAD_NAME = "MyThread-";

        public Thread newThread(Runnable myRunnable) {
            Thread newThread = new Thread(myRunnable);
            newThread.setName(THREAD_NAME + Threadcounter.incrementAndGet());
            return newThread;
        }

        @Override
        public Thread createThread() {
            Thread newThread = new Thread();
            newThread.setName(THREAD_NAME + Threadcounter.incrementAndGet());
            return newThread;
        }
    }

    interface ThreadFactory {
        public Thread createThread();
    }

    public static void main(String[] args) {
        new SimpleFactoryTest();
    }
}
