import javax.swing.JFrame;

public class Lab3Exercises {
	public static void main(String[] args) {
		JFrame myFrame = new JFrame("Hello, Josian Velez!");
		myFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		myFrame.setLocationRelativeTo(null);//sets it close to no component placing it centralized 
		myFrame.setSize(200, 200);
		myFrame.setVisible(true);
	}
}