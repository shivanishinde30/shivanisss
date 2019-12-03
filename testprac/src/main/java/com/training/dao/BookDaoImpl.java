package com.training.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.training.beans.Book;

@Repository
public class BookDaoImpl implements BookDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<Book> getBooks() {
		String sql="select * from Books";
		List<Book>blist = jdbcTemplate.query(sql,new RowMapper<Book>() {

			public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
				Book b=new Book();
				b.setBid(rs.getInt(1));
				b.setBname(rs.getString(2));
				b.setPrice(rs.getInt(3));
				b.setQty(rs.getInt(4));
			
				return b;
			}
			
		});

		return blist;
	}

	@Override
	public int addBook(Book b) {
		String sql="insert into Books values(?,?,?,?)";
		return jdbcTemplate.update(sql,new Object[]{b.getBid(),b.getBname(),b.getPrice(),b.getQty()});
		
	}

	@Override
	public Book getById(int bid) {

		String sql="select * from Books where id=?";
		return(Book) jdbcTemplate.queryForObject(sql,new Object[] {bid},new RowMapper<Book>() {

			public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
				Book b=new Book();
				b.setBid(rs.getInt(1));
				b.setBname(rs.getString(2));
				b.setPrice(rs.getInt(3));
				b.setQty(rs.getInt(4));
			
				return b;
			
			}	
		});

	
	}

	@Override
	public int updateBook(Book b) {
		String sql="update Books set name=?,price=?,quantity=? where id=?";
		return jdbcTemplate.update(sql,new Object[]{b.getBname(),b.getPrice(),b.getQty(),b.getBid()});
	}

	@Override
	public int deleteBook(int bid) {
		
	String sql="delete from Books where id=?";
	return jdbcTemplate.update(sql,new Object[]{bid});
	
	}

}
