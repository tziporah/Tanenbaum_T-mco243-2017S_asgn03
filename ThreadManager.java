package asgn03;

public class ThreadManager {
	
	public static Thread t1 = new Thread(new Thread1());
	public static Thread t2 = new Thread(new Thread2());
	private int favoredThread = 1;
	private boolean t1WantsToEnter = false;
	private boolean t2WantsToEnter = false;
	
	public int getFavoredThread(){
		return favoredThread;
	}
	public boolean gett1(){
		return t1WantsToEnter;
	}
	public boolean gett2(){
		return t2WantsToEnter;
	}
	public void setFavoredThread(int val){
		favoredThread = val;
	}
	public void sett1(boolean val){
		t1WantsToEnter = val;
	}
	public void sett2(boolean val){
		t2WantsToEnter = val;
	}
	
	
	public static void main(String[] args){
		
		startThreads();
	}
	
	public static void startThreads(){
		t1.start();
		t2.start();
	}

}
