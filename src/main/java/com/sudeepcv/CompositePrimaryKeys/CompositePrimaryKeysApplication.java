package com.sudeepcv.CompositePrimaryKeys;

import com.sudeepcv.CompositePrimaryKeys.entity.OrderDetails;
import com.sudeepcv.CompositePrimaryKeys.entity.OrderDetailsEmbedded;
import com.sudeepcv.CompositePrimaryKeys.entity.OrderDetailsId;
import com.sudeepcv.CompositePrimaryKeys.repository.OrderDetailsEmbeddedRepository;
import com.sudeepcv.CompositePrimaryKeys.repository.OrderDetailsRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CompositePrimaryKeysApplication {

	@Autowired
	private OrderDetailsRepository orderDetailsRepository;
	@Autowired
	private OrderDetailsEmbeddedRepository  orderDetailsEmbeddedRepository;

	public static void main(String[] args) {
		SpringApplication.run(CompositePrimaryKeysApplication.class, args);
	}
    @PostConstruct
	public void saveAndFindOderDetails(){

//		saveAndFindOderDetailsUsingIdClass
		OrderDetails orderDetails = new OrderDetails();
		orderDetails.setOrderId(1L);
		orderDetails.setProductId(2L);
		orderDetails.setQuantity(3);
		orderDetailsRepository.save(orderDetails);

		OrderDetailsId orderDetailsId = new OrderDetailsId();
		orderDetailsId.setOrderId(1L);
		orderDetailsId.setProductId(2L);
		OrderDetails resultIdClass = orderDetailsRepository.findById(orderDetailsId).orElse(null);

		System.out.println("result IdClass=>"+resultIdClass);


		OrderDetailsEmbedded orderDetailsEmbedded = new OrderDetailsEmbedded();
		OrderDetailsEmbedded.OrderDetailsId id = new OrderDetailsEmbedded.OrderDetailsId();
		id.setOrderId(5L);
		id.setProductId(6L);
		orderDetailsEmbedded.setId(id);
		orderDetailsEmbedded.setQuantity(10);
		orderDetailsEmbeddedRepository.save(orderDetailsEmbedded);


		OrderDetailsEmbedded.OrderDetailsId OrderDetailsEmbeddedId = new OrderDetailsEmbedded.OrderDetailsId();
		OrderDetailsEmbeddedId.setOrderId(5L);
		OrderDetailsEmbeddedId.setProductId(6L);
		OrderDetailsEmbedded resultEmbedded = orderDetailsEmbeddedRepository.findById(OrderDetailsEmbeddedId).orElse(null);


		System.out.println("result resultEmbedded=>"+resultEmbedded);



	}

}
