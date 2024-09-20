package com.evergent.corejava.collections2.task3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PGDao {
	public int createPG(PG obj)
	{
		  Connection con = null;
		  PreparedStatement pstmt = null;
		  try
		  	{
			  con=PGDb.getConnection(); 
			  
			  String ins_str ="insert into pg_tab values(?,?,?,?,?,?)";
			  pstmt = con.prepareStatement(ins_str);
			  pstmt.setInt(1,obj.getSerialnum());
			  pstmt.setString(2,obj.getName());
			  pstmt.setString(3, obj.getAdress());
			  pstmt.setInt(4,obj.getRoomnum());
			  pstmt.setInt(5, obj.getSharing());
			  pstmt.setInt(6, obj.getPhonenum());
			  int updateCount = pstmt.executeUpdate();
			  con.close();
			  return updateCount;
		  	}
		  catch(Exception ex)
		  {
			  System.out.println(ex.toString());
			  return 0;
		  }  
	}
	public void showPG(int pId)
	{
		Connection con=null;
		PreparedStatement pstmt=null;
		try {
			
			con=PGDb.getConnection();
			String ins_str="select * from pg_tab where sr=?";
			pstmt=con.prepareStatement(ins_str);
			pstmt.setInt(1, pId);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next())
				{
					System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getInt(5)+" "+rs.getInt(6));
				}
			con.close();
			
			}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
		
	}
	public void showAllPG() {
		Connection con=null;
		PreparedStatement pstmt=null;
		try {
			
			con=PGDb.getConnection();
			String ins_str="select balance from pg_tab";
			pstmt=con.prepareStatement(ins_str);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next())
				{
					System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+""+rs.getInt(4)+" "+rs.getInt(5)+" "+rs.getInt(6));
				}
			con.close();
			
			}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}
	public int updatePG(int id,String name) 
	{
		Connection con=null;
		PreparedStatement pst=null;
		try 
		{
			con=PGDb.getConnection();
			String upd_str="UPDATE pg_tab SET name = ? WHERE sr = ?";
			pst=con.prepareStatement(upd_str);
			pst.setString(1, name);
			pst.setInt(2, id);
			int m=pst.executeUpdate();
			return m;
		}
		catch(Exception e) 
		{
			System.out.println(e.toString());
			return 0;
		}
	}
	public int deletePGM(int id) 
	{
		Connection c=null;
		PreparedStatement ps=null;
		try 
		{
			c=PGDb.getConnection();
			String de_str="DELETE FROM pg_tab WHERE sr = ?";
			ps=c.prepareStatement(de_str);
			ps.setInt(1, id);
			int m1=ps.executeUpdate();
			return m1;
		}
		catch(Exception e) 
		{
			System.out.println(e);
			return 0;
		}
	}
	

}
