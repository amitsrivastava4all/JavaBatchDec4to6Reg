package com.mongia.billing.views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mongia.billing.dao.ProductDAO;
import com.mongia.billing.dto.ProductDTO;
import com.mongia.billing.utils.BundleReader;
import com.mongia.billing.utils.CommonConstants;
import com.mongia.billing.utils.ExcelReader;

public class DashBoard extends JFrame implements CommonConstants {

	private JPanel contentPane;

	private void uploadXLS(){
		JFileChooser openDialog = new JFileChooser("/Users/amit/Desktop");
		openDialog.showOpenDialog(this);
		File currentFile = openDialog.getSelectedFile();
		System.out.println("File "+currentFile.getAbsolutePath());
		
			try {
				ArrayList<ProductDTO> products = ExcelReader.readExcel(currentFile);
				ProductDAO productDAO  = new ProductDAO();
				String message = productDAO.bulkAdd(products)?"Bulk Uploaded SuccessFully ":"Not Uploaded Some Error";
				JOptionPane.showMessageDialog(this, message);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			catch(Exception e){
				e.printStackTrace();
			}
			
	
	}
	private void downloadXLS(){
		File file = new File(BundleReader.getValue(XLS_FORMAT_KEY));
		if(file.exists()){
			try {
				FileInputStream fs = new FileInputStream(file);
				FileOutputStream fo = 
						new FileOutputStream(BundleReader.getValue(DOWNLOAD_KEY));
				int singleByte = fs.read();
				while(singleByte!=EOF){
					fo.write(singleByte);
					System.out.println((char)singleByte);
					singleByte = fs.read();
					
				}
				JOptionPane.showMessageDialog(this, 
						"Download Completed.. "+BundleReader.getValue(DOWNLOAD_KEY));
				fs.close();
				fo.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public DashBoard(String userid) {
		setTitle("Welcome "+userid);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1077, 736);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		this.setJMenuBar(menuBar);
		
		JMenu mnAdmin = new JMenu("Admin");
		menuBar.add(mnAdmin);
		
		JMenu mnProducts = new JMenu("Products");
		mnAdmin.add(mnProducts);
		
		JMenuItem mntmAddProduct = new JMenuItem("Download XLS");
		mntmAddProduct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			downloadXLS();
			}
		});

		mnProducts.add(mntmAddProduct);
		
		JMenuItem mntmUpdateProduct = new JMenuItem("Upload XLS");
		mntmUpdateProduct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			uploadXLS();
			}
		});
		mnProducts.add(mntmUpdateProduct);
		
		JMenuItem mntmDeleteProduct = new JMenuItem("List Product");
		mnProducts.add(mntmDeleteProduct);
		
		JMenuItem mntmCustomerReport = new JMenuItem("Customer Report");
		mnAdmin.add(mntmCustomerReport);
		
		JMenu mnOrder = new JMenu("Order");
		menuBar.add(mnOrder);
		
		JMenuItem mntmOrderPlace = new JMenuItem("Order Place");
		mnOrder.add(mntmOrderPlace);
		
		JMenuItem mntmTrack = new JMenuItem("Track");
		mnOrder.add(mntmTrack);
		//menuBar.setBounds(75, 10, 101, 22);
		//contentPane.add(menuBar);
	}
}
