package ca.sar.coding.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import ca.sar.coding.model.Order;


@Repository
public interface OrderRepository extends CrudRepository<Order, Long >{

	@Query("SELECT a.transactionId,a.gcid,a.descr FROM Order a WHERE a.status= :status ")
	List<String> findByStatus(@Param("status") String status);

	
	
}
