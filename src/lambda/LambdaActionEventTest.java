package lambda;

import javax.swing.JButton;

public class LambdaActionEventTest {

	public static void main(String[] args) {
		JButton show =  new JButton("Show");
		
		show.addActionListener((e) -> {
			System.out.println("Light, Camera, Action !! Lambda expressions Rocks");
		});
	}
}
