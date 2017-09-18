package com.singleton.implementation;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Timestamp;

public class Singleton {
	private volatile static Singleton singletonObj = null;
	private static final String filePath = "C:\\Users\\admin\\Documents\\workspace-sts-3.9.0.RELEASE\\Fortinet\\src\\Logger";

	/*
	 * This is the private constructor which cannot
	 * be used for inantiating the object of the class.
	 */
	private Singleton() {

	}

	/*
	 * Returns and instance of the Singleton class.
	 * Function getInstance checks if the singletonobj is null.
	 * If it is null it instantiates it and returns it.
	 * synchronized block is added to avoid concurrent access from multiple threads.
	 */
	public static Singleton getInstance() {
		if (singletonObj == null) {

			synchronized (Singleton.class) {
				if (singletonObj == null) {
					singletonObj = new Singleton();
				}

			}
		}
		return singletonObj;

	}
	
	
    /*
     * Function logError takes message from all the threads and appends message to the current file.
     * @param message It contains logger message from the thread.
     */
	public void logError(String message) {
		FileWriter fw = null;

		try {
			fw = new FileWriter(filePath, true);
			fw.write("Logs from" + new Timestamp(System.currentTimeMillis()) + " " + message + "\n");
			fw.close();

		} catch (IOException ioe) {
			System.err.println("IOException: " + ioe.getMessage());
		}

	}

}