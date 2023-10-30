package java_thread_assignment;

//Thread for calculating the average of first 10 numbers
class AverageThread extends Thread {
	public void run() {
		int sum = 0;
		double avg = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
			avg = (double) sum / 10;
		}
		System.out.println("Average of the first 10 numbers are:" + avg);
	}
}

//Thread for printing squares of numbers
class SquareThread extends Thread {
	public void run() {
		int arr[] = { 1, 20, 50, 15, 30 };
		for (int num : arr)
			System.out.println("Square of " + num + " is :" + (num * num));
	}
}

public class AverageSquareThread {

	public static void main(String[] args) {
		// Create an instance of AverageThread
		AverageThread avgt = new AverageThread();
		avgt.start(); // starting the average thread
		try {
			avgt.join(); // It will wait for the average thread to finish
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Create an instance of SquareThread
		SquareThread st = new SquareThread();
		st.start(); // Starting the square thread
	}
}
