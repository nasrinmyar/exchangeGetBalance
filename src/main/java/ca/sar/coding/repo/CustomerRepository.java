package ca.sar.coding.repo;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import ca.sar.coding.model.Customer;


@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long >{

	@Query("SELECT a.cid,a.name,a.lastname,a.phone_no,a.address,a.status FROM customerinfo a WHERE a.cid= :cid ")
	List<String> findByCustomerId(@Param("cid") Integer cid);

	
	
}
