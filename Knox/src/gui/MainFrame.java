package gui;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;

public class MainFrame extends JFrame {
	public MainFrame() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		JLabel lblYouHaveHit = new JLabel("You have hit Ft. Knox");
		GridBagConstraints gbc_lblYouHaveHit = new GridBagConstraints();
		gbc_lblYouHaveHit.gridx = 0;
		gbc_lblYouHaveHit.gridy = 0;
		getContentPane().add(lblYouHaveHit, gbc_lblYouHaveHit);
		
		setSize(650, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);
	}

}
