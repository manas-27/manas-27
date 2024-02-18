public class multithreading {
    public static void main(String[] args) {
        System.out.println("Main in Java programming");

        Thread th = Thread.currentThread();
        System.out.println(th); 
        // String tname = th.getName();
        // int pri = th.getPriority();

        System.out.println(Thread.currentThread().getName()+" Thread under the thread group of "+Thread.currentThread().getThreadGroup().getName());
        
    }
}
