import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class ShowProducts extends JFrame {
public ShowProducts() {
	this.setSize(600,500);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Container cp = this.getContentPane();
	JScrollPane sp = new JScrollPane();
	cp.add(sp);
	JTable jtable = new JTable();
	sp.getViewport().add(jtable);
	jtable.setModel(new MyTableModel());
	
}
public static void main(String[] args) {
	ShowProducts showProducts = new ShowProducts();
	showProducts.setVisible(true);
}
}
