class thread extends Thread{
    public void run(){
        try {
            System.out.println("Thread " + Thread.currentThread().getId()+ " is running");
        }
        catch (Exception e) {
            System.out.println("Exception");
        }
        System.out.println("Thread " + Thread.currentThread().getId()+ " Ended");
    }
}

public class exp9 {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i < n; i++) {
            thread object = new thread();
            object.start();
        }
    }
}

//This program demonstrates thread using the `Thread` class in Java. The `thread` class extends `Thread` and overrides the `run()` method to print the current thread's ID. In the `main` method, 10 threads are created and started using a loop. Each thread runs independently, showcasing parallel execution. The output order may vary due to concurrent execution.