package com.mongia.billing.views;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JWindow;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

import org.apache.log4j.Logger;

public class IntroScreen extends JWindow {
	static Logger logger = Logger.getLogger(IntroScreen.class);

	private JPanel contentPane;
	Timer timer;
	int counter = 1;
	private void animation() {
		logger.debug("Animation Start With Counter Value "+counter);
		timer = new Timer(50,(e)->{
			progressBar.setValue(counter);
			counter++;
			if(counter>=100) {
				this.setVisible(false);
				this.dispose();
				timer.stop();
				Login login = new Login();
				login.setVisible(true);
			}
		});
		timer.start();
		logger.debug("Animation Code Ends with Counter value "+counter);
	}
	public static void main(String[] args) {
					logger.debug("Inside Main");	
					IntroScreen frame = new IntroScreen();
					
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
					frame.animation();
					logger.debug("Main Ends");
	}

	/**
	 * Create the frame.
	 */
	JProgressBar progressBar = new JProgressBar();
	public IntroScreen() {
		
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 682, 511);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel imagelbl = new JLabel("");
		imagelbl.setIcon(new ImageIcon(IntroScreen.class.getResource("/com/mongia/billing/views/intro.jpeg")));
		imagelbl.setBounds(167, 96, 319, 266);
		contentPane.add(imagelbl);
		
		
		progressBar.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		progressBar.setStringPainted(true);
		progressBar.setBounds(6, 354, 778, 45);
		contentPane.add(progressBar);
	}
}
