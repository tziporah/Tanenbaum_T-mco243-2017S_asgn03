package asgn03;

public class Thread1 implements Runnable{
	
	
	public void run() {
		ThreadManager threadManager = new ThreadManager();
		
		//for(int i = 0; i < 5; i++){
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			threadManager.sett1(true);
			while(threadManager.getFavoredThread() == 2){
				while(threadManager.gett2());
				threadManager.setFavoredThread(1);
			}
			System.out.println("Thread 1 in critical section");
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			threadManager.sett1(false);
			System.out.println("Thread 1 out of critical section");
		//}
	}
	
	

}
