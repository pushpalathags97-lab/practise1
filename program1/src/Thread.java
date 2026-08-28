 class MyThread extends Thread {
     public void run(){
         System.out.println("This is the thread");
     }
     public void start(){
         System.out.println("This is the start thread");
     }
 }
     public class Thread {
        public static void main(String[] args){
            MyThread mythread = new MyThread();
            mythread.start();
            System.out.println("This is the main thread");

        }

     }


