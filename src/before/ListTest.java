package before;

import java.util.Arrays;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");
		for(String s:list){
			System.out.println(s);
		}
	}
}
