package com.mphasis;

public class Thread1 implements Runnable {

	public static int myCount = 0;

	public Thread1() {

	}

	public void run() {
		while (Thread1.myCount <= 10) {
			try {
				System.out.println("Expl Thread: " + (++Thread1.myCount));
				Thread.sleep(100);
			} catch (InterruptedException iex) {
				System.out.println("Exception in thread: " + iex.getMessage());
			}
		}
	}

	public static void main(String a[]) {
		System.out.println("Starting Main Thread...");
		Thread1 mrt = new Thread1();
		Thread t = new Thread(mrt);
		t.start();
		while (Thread1.myCount <= 10) {
			try {
				System.out.println("Main Thread: " + (++Thread1.myCount));
				Thread.sleep(100);
			} catch (InterruptedException iex) {
				System.out.println("Exception in main thread: " + iex.getMessage());
			}
		}
		System.out.println("End of Main Thread...");
	}
}
