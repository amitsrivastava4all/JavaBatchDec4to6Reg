package com.mongia.billing.views;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.mongia.billing.dao.UserDAO;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	private void checkLogin() {
		String userid = textField.getText();
		String password = passwordField.getText();
		UserDAO common = new UserDAO();
		try {
		boolean isUserexist = common.doLogin(userid, password);
		String message = isUserexist?"Welcome "+userid:" Invalid Userid or Password";
		JOptionPane.showMessageDialog(this, message);
		if(isUserexist) {
			DashBoard dashBoard = new DashBoard(userid);
			dashBoard.setExtendedState(JFrame.MAXIMIZED_BOTH);
			dashBoard.setVisible(true);
			this.setVisible(false);
			this.dispose();
		}
		}
		catch(SQLException e) {
			JOptionPane.showMessageDialog(this, "Some DataBase Issue Occur Contact to System Admin");
		}
		catch(ClassNotFoundException e) {
			JOptionPane.showMessageDialog(this, "DB Driver Missing, Contact to System Admin");
		}
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1256, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					passwordField.requestFocus(true);
				}
			}
		});
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField.setBounds(567, 76, 320, 71);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblUserid = new JLabel("Userid");
		lblUserid.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblUserid.setBounds(389, 91, 104, 56);
		contentPane.add(lblUserid);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblPassword.setBounds(389, 240, 104, 56);
		contentPane.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					checkLogin();
				}
			}
		});
		passwordField.setEchoChar('%');
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		passwordField.setBounds(567, 246, 320, 50);
		contentPane.add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			checkLogin();
			}
		});
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnLogin.setBounds(431, 411, 187, 63);
		contentPane.add(btnLogin);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnReset.setBounds(664, 411, 187, 63);
		contentPane.add(btnReset);
	}
}
