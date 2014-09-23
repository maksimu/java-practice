package threads;

/**
 * Created by maksimustinov on 9/21/14.
 */
public class SimpleThreads {


    public static void startThreads(int N) throws InterruptedException {

        for(int i = 0; i < N; i++) {
            Thread t = new Thread(new RunnableThread("HIii -> " + i));
            t.start();
        }


        for(int j = 0; j < N; j++){
            Thread thread = new ThreadedThread("Threaded Thread Name: " + j);
            thread.start();
        }


//        Thread thread = new ThreadedThread("Threaded Thread Name: " + j);


    }

    static class RunnableThread implements Runnable{
        String threadName;
        public RunnableThread(String name){
            this.threadName = name;
        }
        @Override
        public void run() {

            try {
                System.out.println("---> [" + threadName +"] - " + Thread.currentThread().getName());
                Thread.sleep(3000l);
                System.out.println("---> [" + threadName +"] - " + Thread.currentThread().getName());

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    static class ThreadedThread extends Thread{
        String threadName;
        public ThreadedThread(String name){
            this.threadName = name;
        }
        @Override
        public void run() {

            try {
                System.out.println("---> [" + threadName +"] - " + Thread.currentThread().getName());
                Thread.sleep(3000l);
                System.out.println("---> [" + threadName +"] - " + Thread.currentThread().getName());

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("---> Going into a dead state");
        }
    }

}
