package lambda;

import java.util.Arrays;
import java.util.List;

public class LambdaListTest {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");
//		list.forEach((s) -> {
//			System.out.println(s);
//		});
		
		//// 使用Java 8的方法引用更方便，方法引用由::双冒号操作符标示，
		// 看起来像C++的作用域解析运算符
		list.forEach(System.out::println);
	}
}
