class MyThread extends Thread {

    public void run() {
        for (int i = 1; i <= 5; i++){
            System.out.println("Child: " + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MyTask implements Runnable {

    public void run() {
        System.out.println("Task running");
    }
}

public class ThreadExample {
    public static void main(String[] args) {

        MyTask task = new MyTask();

        Thread t = new Thread(task);
        t.start();

        for (int i = 1; i <= 5; i++) {
                System.out.println("Main: " + i);
        }
    }
}