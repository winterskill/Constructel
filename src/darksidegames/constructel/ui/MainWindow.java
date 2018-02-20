package darksidegames.constructel.ui;

import javax.swing.JFrame;

import darksidegames.constructel.Settings;

/**
 * La classe de la fenêtre principale de l'application.
 * @author Winterskill
 */
public final class MainWindow extends JFrame {
	public MainWindow() {
		this.setTitle(Settings.title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setSize(Settings.defaultWidth, Settings.defaultHeight);
		this.setResizable(true);
		
		this.setVisible(true);
	}
}
