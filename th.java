
class MyThread extends Thread {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("B: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.err.println("Thread was interrupted");
            }
        }
    }
}

public class ThreadExtensionExample {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        
        myThread.start();
        
        for (int i = 1; i <= 5; i++) {
            System.out.println("A: " + i);
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                System.err.println("Main thread was interrupted");
            }
        }
    }
}