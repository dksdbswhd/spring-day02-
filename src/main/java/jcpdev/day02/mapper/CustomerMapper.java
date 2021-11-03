package jcpdev.day02.mapper;

import java.util.List;
import java.util.Map;

import jcpdev.day02.dto.BoardDto;
import jcpdev.day02.dto.Customer;
import jcpdev.day02.dto.PageDto;


public interface CustomerMapper {
	List<Customer> selectAll();
	Customer selectOne(int idx);
	int insert(Customer customer);
	int update(Customer customer);
	int delete(int idx);
}
