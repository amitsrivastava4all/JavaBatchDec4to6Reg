package com.mongia.billing.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mongia.billing.dto.ProductDTO;

public class ProductDAO {
	public boolean bulkAdd(ArrayList<ProductDTO> products) throws ClassNotFoundException, SQLException{
		Connection con = null;
		boolean isSuccess = false;
		PreparedStatement pstmt = null;
		con = CommonDAO.getConnection();
		con.setAutoCommit(false);
		
		pstmt = con.prepareStatement("insert into product(id ,name, price, quantity) values(?,?,?,?)");
		try{
		for(ProductDTO product : products){
			pstmt.setInt(1, product.getId());
			pstmt.setString(2, product.getName());
			pstmt.setInt(3, product.getPrice());
			pstmt.setInt(4, product.getQuantity());
			pstmt.addBatch();
		}
		pstmt.executeBatch();
		con.commit();
		isSuccess = true;
		}
		catch(SQLException e){
			con.rollback();
			isSuccess = false;
		}
		return isSuccess;
	}
	public boolean isAdded (ProductDTO productDTO) throws ClassNotFoundException, SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		con = CommonDAO.getConnection();
		pstmt = con.prepareStatement("insert into product(id,name,price) values(?,?,?)");
		pstmt.setInt(1, productDTO.getId());
		pstmt.setString(2, productDTO.getName());
		pstmt.setInt(3, productDTO.getPrice());
		int recordCount = pstmt.executeUpdate();
		pstmt.close();
		con.close();
		return recordCount>0;
		
	}
	public boolean delete (int id) throws ClassNotFoundException, SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		con = CommonDAO.getConnection();
		pstmt = con.prepareStatement("delete from product where id=?");
		pstmt.setInt(1, id);
		
		int recordCount = pstmt.executeUpdate();
		pstmt.close();
		con.close();
		return recordCount>0;
		
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ProductDTO p = new ProductDTO();
		p.setId(2);
		p.setName("lg");
		p.setPrice(90000);
		ProductDAO pr = new ProductDAO();
		String msg = pr.isAdded(p)?"record added":"Not added";
		System.out.println(msg);
		msg = pr.delete(1)?"record deleted":"Not deleted";
		System.out.println(msg);
	}

}
