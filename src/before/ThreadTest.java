package before;


public class ThreadTest {

	public static void main(String[] args) {
		new Thread(new Runnable(){

			@Override
			public void run() {
				System.out.println("Before Java8, too much code for too little to do");
			}
			
		}).start();
	}
}
