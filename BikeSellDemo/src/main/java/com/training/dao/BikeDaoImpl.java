package com.training.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.training.beans.Bike;

@Repository
public class BikeDaoImpl implements BikeDao {
	@Autowired
	JdbcTemplate jdbcTemplate;
	@Override
	public int registerBike(Bike b) {
		String sql="insert into Bike values(?,?,?,?,?,?)";
		return jdbcTemplate.update(sql,new Object[] {b.getOname(),b.getBname(),b.getPrice(),b.getDisc(),b.getColor(),b.getType()});
		

	}
	@Override
	public List<Bike> getBike() {
		String sql="select * from Bike";
		List<Bike> blist=jdbcTemplate.query(sql, new RowMapper<Bike>() {

			@Override
			public Bike mapRow(ResultSet rs, int rowNum) throws SQLException {
				Bike b=new Bike();
				b.setOname(rs.getString(1));
				b.setBname(rs.getString(2));
				b.setPrice(rs.getInt(3));
				b.setDisc(rs.getString(4));
				b.setColor(rs.getString(5));
				b.setType(rs.getString(6));
				
				return b;
			}
			
		});
		return blist;
	}

}
