
  package ca.sar.coding.service;
  
  import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ca.sar.coding.repo.CustomerRepository;
  
  
  @Service public class CustomerServiceImpl implements CustomerService {
  
  @Autowired private CustomerRepository customerrepo;



@Override
public List<String> findByCustomerId(Integer cid) {
	// TODO Auto-generated method stub
	return customerrepo.findByCustomerId(cid);
}
  
  
  
  }
 