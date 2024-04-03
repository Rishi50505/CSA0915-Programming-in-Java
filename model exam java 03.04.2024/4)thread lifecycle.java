class ThreadLifeCycle {

        public static void main(String[] args) {
          MyThread thread = new MyThread();
      
          System.out.println("Thread state: " + thread.getState()); 
          thread.start();
      
          System.out.println("Thread state: " + thread.getState()); 
      /
          try {
            thread.join();
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
      
          System.out.println("Thread state: " + thread.getState()); 
      }
      
      class MyThread extends Thread {
      
        @Override
        public void run() {
          System.out.println("Thread is running...");
      
          // Simulate some work
          try {
            Thread.sleep(1000);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
      
          System.out.println("Thread completed its work.");
        }
      }