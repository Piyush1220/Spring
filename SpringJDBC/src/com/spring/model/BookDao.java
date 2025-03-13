package com.spring.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class BookDao {

	private JdbcTemplate jt;
	
	

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}
	
	public int saveBook(Book b)
	{
		String q="insert into book values(?,?,?,?)";
		
		return
				jt.update(q, b.getBid(),b.getBname(),b.getAuthor(),b.getPrice());
		
	}
	
	public int updateBook(Book b)
	{
		String q="update book set bname=?,author=?,price=? where bid=?";
		
		return jt.update(q, b.getBname(),b.getAuthor(),b.getPrice(),b.getBid());
		
	}
	
	public int deleteBook(int id)
	{
		String q="delete from book where bid=?";
		return jt.update(q,id);
	}
	
	public void showBooks()
	{
		List<Book> blist=new ArrayList<Book>();
		String q="select * from book";
		
		jt.query(q, new RowMapper() {

			@Override
			public Object mapRow(ResultSet rs, int rowno) throws SQLException {
				Book bobj= new Book(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getDouble(4));
				blist.add(bobj);
				
				return null;
			}
		});
		System.out.println("All Book are=\n"+blist );
	}
}
