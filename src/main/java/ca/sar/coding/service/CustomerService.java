package ca.sar.coding.service;

import java.util.List;


public interface CustomerService {

	List<String> findByCustomerId(Integer cid);

}
