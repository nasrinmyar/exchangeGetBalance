package ca.sar.coding.service;

import java.util.List;


public interface OrderService {

	List<String> findByStatus(String status);

}
