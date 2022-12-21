package ca.sar.coding.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ca.sar.coding.repo.OrderRepository;


@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepository orderrepo;
	
	@Override
	public List<String> findByStatus(String status) {
		// TODO Auto-generated method stub
		return orderrepo.findByStatus(status);
	}

}
