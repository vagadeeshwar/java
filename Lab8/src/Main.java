public class Main {

	public static void main(String[] args) {// throws InterruptedException {
		// Q1

		Thread T1 = new EvenPrint();
		T1.start();

		Thread T2 = new OddPrint();
		T2.start();

		Thread T3 = new PrimePrint();
		T3.start();

		try {
			T1.join();
			T2.join();
		} catch (Exception e) {
			System.out.println("Interrupted");
		}
		System.out.println();

		// Q2

		Sender send = new Sender(); // Synchronization can be done only wrt to an object

		ThreadedPrint S1 = new ThreadedPrint(1, send);
		ThreadedPrint S2 = new ThreadedPrint(1, send);

		S1.start();
		S2.start();

		// wait for threads to end
		try {
			S1.join();
			S2.join();
		} catch (Exception e) {
			System.out.println("Interrupted");
		}
		System.out.println();

		S1 = new ThreadedPrint(2, send);
		S2 = new ThreadedPrint(2, send);

		S1.start();
		S2.start();

		try {
			S1.join();
			S2.join();
		} catch (Exception e) {
			System.out.println("Interrupted");
		}

		System.out.println();

		Sender send2 = new Sender(); // Static synchronization is class level lock/sync unlike the abv 2...so 2
										// different objects S1 and S3 also execute the function synchronously

		S1 = new ThreadedPrint(3, send);
		S2 = new ThreadedPrint(3, send);
		ThreadedPrint S3 = new ThreadedPrint(3, send2);

		S1.start();
		S2.start();
		S3.start();
	}

}
