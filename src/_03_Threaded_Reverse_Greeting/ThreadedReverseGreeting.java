package _03_Threaded_Reverse_Greeting;

public class ThreadedReverseGreeting {
  //Write a program that creates a thread (Thread 1) that creates another thread (Thread 2); 
  //Thread 2 creates Thread 3; and so on, up to Thread 50. 
  //Each thread should print "Hello from Thread <num>!", 
  //but you should structure your program such that the threads print their greetings in reverse order.

	/* HINT: You will most likely need to do this with recursion */
	public static void main(String[] args) {
		printReverse(50);
	}

	 static void printReverse(int num) {
		// TODO Auto-generated method stub
		 Thread t1 = new Thread (()-> {	
				if(num > 0) {
					printReverse(num-1);
				}
				System.out.println("Hello from Thread " + num);
			});
		 t1.start();
	}
}
