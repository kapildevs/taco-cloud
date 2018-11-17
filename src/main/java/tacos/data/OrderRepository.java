package tacos.data;

import org.springframework.data.repository.CrudRepository;

import tacos.Order;

public interface OrderRepository extends CrudRepository<Order, Long> {

//	Order save(Order order);
	
//	List<Order> findByDeliveryZip(String deliveryZip);
//	
//	List<Order> readOrderByDeliveryZipAndPlacedAtBetween(String deliveryZip, Date startDate, Date endDate);
}
