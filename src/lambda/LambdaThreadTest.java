package lambda;

public class LambdaThreadTest {

	public static void main(String[] args) {//() -> {}代码块替代了整个匿名类
		new Thread(() -> System.out.println("In Java8, Lambda expression rocks !!")).start();
	}
}
