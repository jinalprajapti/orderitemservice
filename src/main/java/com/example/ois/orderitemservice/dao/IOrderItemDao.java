package com.example.ois.orderitemservice.dao;

import java.util.List;

import com.example.ois.orderitemservice.dto.ProductItemDTO;

public interface IOrderItemDao {

	 /**
	  * create Order
	  * 
	  * @param OrderDTO
	  * @return boolean
	  */
	 public boolean createOrderItem(List<ProductItemDTO> productItemDTO, Integer orderId);
	 /**
	  * get all order
	  * @return
	  */
	  public  List<ProductItemDTO>  getOrderItemByOrderId(Integer OrderId);

	 
}
