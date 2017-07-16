package asgn03;

public class Thread2 implements Runnable{
	
	public void run(){
		ThreadManager tm = new ThreadManager();

		//for(int ni = 0; ni < 5; ni++){
			tm.sett2(true);
			while(tm.getFavoredThread() == 1){
				while(tm.gett1());
				try {
					Thread.sleep(30);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				tm.setFavoredThread(2);
			}
			System.out.println("Thread 2 in critical section");
			tm.sett2(false);
			System.out.println("Thread 2 out of critical section");
		//}
	}

}
