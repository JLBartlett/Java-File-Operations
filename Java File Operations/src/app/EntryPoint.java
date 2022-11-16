package app;

import java.awt.Dimension;
import java.awt.DisplayMode;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;

import javax.swing.JFrame;

/***
 * User Interface class
 * @author John
 *
 */
class UI extends JFrame{
	
	/***
	 * Setup UI Frame
	 */
	public UI() {
		this.setTitle("Java File Operations");
		layoutComponents();
		centreWindow();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	/***
	 * Layout all the components on the UI Frame
	 */
	private void layoutComponents() {
		this.setSize(500, 400);
	}
	
	/***
	 * Centre the UI Frame on the default display
	 */
	private void centreWindow() {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension windowSize = this.getSize();
		int x = (screenSize.width - windowSize.width) / 2;
		int y = (screenSize.height - windowSize.height) / 2;
		this.setLocation(x, y );
		System.out.println(screenSize);
		System.out.println(windowSize);
	}
}

/***
 * Entry Point to Application class
 * @author John
 *
 */
public class EntryPoint {
	public static void main(String[] args) {
		new UI();
	}
}
