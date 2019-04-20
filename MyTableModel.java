import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class MyTableModel extends AbstractTableModel {
	ArrayList<Item> items;
	String names [] = {"id","name","price"};
	public MyTableModel() {
		this.items =ItemOperations.fillItems();
	}
	 public String getColumnName(int column) {
		 return names[column];
	 }
	 public int getRowCount() {
		 return items.size();
	 }
	 public int getColumnCount() {
		 return names.length;
	 }
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		Item item = this.items.get(rowIndex);
		if(columnIndex ==0) {
			return item.getId();
		}
		else
		if(columnIndex ==1) {	
			return item.getName();
		}
		else
		if(columnIndex==2) {	
			return item.getPrice();
		}
		return null;
	}
}
