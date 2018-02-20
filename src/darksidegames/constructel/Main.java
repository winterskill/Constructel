package darksidegames.constructel;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

import darksidegames.constructel.ui.MainWindow;

/**
 * La classe principale de l'application.
 * @author Winterskill
 */
public class Main {
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			System.out.println("ERROR! COULD NOT LOAD SYSTEM LOOK AND FEEL!");
			JOptionPane.showMessageDialog(null, "COULD NOT LOAD SYSTEM LOOK AND FEEL!", "ERROR", JOptionPane.ERROR_MESSAGE);
		}
		
		MainWindow mainWindow = new MainWindow();
	}
}
