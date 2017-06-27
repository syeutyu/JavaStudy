package Ramda;

class ThreadA extends Thread {
	public boolean stop = false;
	public boolean work = true;

	public void run() {
		while (!stop) {
			if (work) {
				System.out.println("start thread a");
			} else {
				Thread.yield();
			}
		}
		System.out.println("END Thread A");
	}
}

class ThreadB extends Thread {
	public boolean stop = false;
	public boolean work = true;

	public void run() {
		while (!stop) {
			if (work) {
				System.out.println(" start thread b");
			}else{
				Thread.yield();
			}
		}
		System.out.println("End Thread B");
	}
}

public class YieldExample {

	public static void main(String[] args) {
		ThreadA a = new ThreadA();
		ThreadB b = new ThreadB();
		a.start();
		b.start();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

		}
		a.work = false;
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

		}
		a.work = true;
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

		}
		a.stop = true;
		b.stop = true;
	}

}
