package com.example.ois.orderitemservice.service;

import java.util.List;

import com.example.ois.orderitemservice.dto.ProductItemDTO;

public interface IOrderItemService {
	
 /**
  * create Order
  * 
  * @param OrderDTO
  * @return boolean
  */
	public boolean createOrderItem(List<ProductItemDTO> productItemDTO, Integer orderId);
 /**
  * get all order list
  * @return
  */
 public  List<ProductItemDTO>  getOrderItemByOrderId(Integer OrderId);


}
