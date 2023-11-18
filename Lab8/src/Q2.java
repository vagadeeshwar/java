// A Java program to demonstrate working of
// synchronized.

// A Class used to send a message
class Sender {
	public void logSeriesBlock() {
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0)
				System.out.print(" - ");
			else
				System.out.print(" + ");

			System.out.print("x^" + i + "/" + i);
		}
		System.out.println();
	}

	public synchronized void logSeriesMethod() {
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0)
				System.out.print(" - ");
			else
				System.out.print(" + ");

			System.out.print("x^" + i + "/" + i);
		}
		System.out.println();
	}

	public static synchronized void logSeriesStatic() {
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0)
				System.out.print(" - ");
			else
				System.out.print(" + ");

			System.out.print("x^" + i + "/" + i);
		}
		System.out.println();
	}
}

// Class for send a message using Threads
class ThreadedPrint extends Thread {
	int opt;
	Sender sender;

	// Receives a message object and a string
	// message to be sent
	ThreadedPrint(int opt, Sender obj) {
		this.opt = opt;
		sender = obj;
	}

	public void run() {
		// Only one thread can send a message
		// at a time.
		switch (opt) {
		case 1:
			sender.logSeriesMethod();
			break;
		case 2:
			synchronized (sender) {
				sender.logSeriesBlock();
			}
			break;
		default:
			sender.logSeriesStatic();
		}
	}
}
