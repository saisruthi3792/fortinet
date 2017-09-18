package com.singleton.implementation;

public class PersonThread {

	
	  public static void main(String[] args) {
	 
		
		for(int i=1;i<=30;i++) {
				new Thread(""+i) {
				public void run() {
					String objInfo = "Object is " + Singleton.getInstance();
					String msg = "Log error from Thread "+getName()+"\n"+ "Exception occured!!";
					Singleton.getInstance().logError(objInfo+msg);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
				}
			}.start();
		}
	}
	

}
