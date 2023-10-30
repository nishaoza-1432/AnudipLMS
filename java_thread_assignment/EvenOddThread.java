package java_thread_assignment;

//Thread for printing odd numbers
class OddThread extends Thread {
	public void run() {
		System.out.println("Odd numbers from 1 to 100 :");
		for (int i = 1; i <= 100; i++)
			if (i % 2 != 0)
				System.out.println(i);
	}
}

//Thread for printing even numbers
class EvenThread extends Thread {
	public void run() {
		System.out.println("Even numbers from 1 to 100 :");
		for (int i = 1; i <= 100; i++)
			if (i % 2 == 0)
				System.out.println(i);
	}
}

public class EvenOddThread {

	public static void main(String[] args) {
		// Create an instance of OddThread
		OddThread oddt = new OddThread();
		oddt.start(); // starting the odd thread
		try {
			oddt.join(); // Waiting for the odd thread to finish
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Create an instance of EvenThread
		EvenThread event = new EvenThread();
		event.start(); // starting the even thread
	}
}
