package autoclicker;

public class Timer implements Runnable{
	public void run() {
		try {Thread.sleep(6 * 60 * 60 * 1000);}
		catch (InterruptedException ie) {return;}
		
//		try {Thread.sleep(10000);}
//		catch (InterruptedException ie) {return;}
		
		if (AutoClicker.resetFlag) {AutoClicker.reset = true;}
	}
}
