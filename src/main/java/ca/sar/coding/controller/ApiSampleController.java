package ca.sar.coding.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ca.sar.coding.model.StatusModel;
import ca.sar.coding.service.CustomerService;
import ca.sar.coding.service.OrderService;


@Controller
@RequestMapping("/api")
public class ApiSampleController {
 
    //public static final Logger logger = LoggerFactory.getLogger(RestApiController.class);
    
	@Autowired
	private OrderService orderService;
	
	@Autowired
	private CustomerService customerService;
	
    @RequestMapping(value = "/order/{status}", method = RequestMethod.GET) 
    public @ResponseBody List<String> getOders(@PathVariable String status) {
     	  return orderService.findByStatus(status);
 	}
	
    @RequestMapping(value = "/status", method = RequestMethod.GET) 
    public @ResponseBody StatusModel getStatus() {
    	try {
     		   return new StatusModel(1L, "It's up and running");
 		  } catch (Exception e) {
 		   	   return new StatusModel(0L, e.toString());
 		  }
    }
    
	
	  @RequestMapping(value = "/customer/{cid}", method = RequestMethod.GET)
	  public @ResponseBody List<String> getCustomerInfo(@PathVariable Integer cid)
	  { return customerService.findByCustomerId(cid); }
	 
   
}