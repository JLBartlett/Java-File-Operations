package app;

import java.awt.*;

import javax.swing.*;

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
		this.setLayout(new BorderLayout());
		
		JPanel pnlTop = new JPanel();
		BoxLayout boxLayout = new BoxLayout(pnlTop, BoxLayout.Y_AXIS);
		pnlTop.setLayout(boxLayout);
		
		JPanel pnlFirst = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JLabel lblSelFolder = new JLabel("Select Folder:");
		pnlFirst.add(lblSelFolder);
		JButton btnChooseFolder = new JButton("Choose Folder...");
		pnlFirst.add(btnChooseFolder);
		pnlTop.add(pnlFirst);
		
		JPanel pnlSecond = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JLabel lblEntTextRem = new JLabel("Enter Text to Remove:");
		pnlSecond.add(lblEntTextRem);
		JTextField txtRemText = new JTextField(10);
		pnlSecond.add(txtRemText);
		JButton btnRemText = new JButton("Remove");
		pnlSecond.add(btnRemText);
		pnlTop.add(pnlSecond);
		
		JPanel pnlThird = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JButton btnRemNums = new JButton("Remove Numbers");
		pnlThird.add(btnRemNums);
		JButton btnDelSel = new JButton("Delete Selected");
		pnlThird.add(btnDelSel);
		pnlTop.add(pnlThird);
		
		DefaultListModel<String> lstModel = new DefaultListModel<>();
		lstModel.addElement("Really long file name to test list");
		for (int i = 0; i < 100; i++) {
			lstModel.addElement("File " + i);
		}
		JList<String> lstFiles = new JList<>(lstModel);
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportView(lstFiles);
		
		
		JPanel pnlBottom = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		JButton btnClear = new JButton("Clear");
		pnlBottom.add(btnClear);
		JButton btnClose = new JButton("Close");
		pnlBottom.add(btnClose);
		
		this.add(pnlBottom, BorderLayout.PAGE_END);
		
		this.add(scrollPane, BorderLayout.CENTER);
		
		this.add(pnlTop, BorderLayout.PAGE_START);
		this.pack();
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
