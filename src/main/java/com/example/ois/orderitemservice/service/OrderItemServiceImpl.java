package com.example.ois.orderitemservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.ois.orderitemservice.dao.IOrderItemDao;
import com.example.ois.orderitemservice.dto.ProductItemDTO;

@Service
@Transactional
public class OrderItemServiceImpl implements IOrderItemService{

	@Autowired
	IOrderItemDao iOrderItemDao;

	/**
	 * {@inheritDoc}
	 */
	public boolean createOrderItem(List<ProductItemDTO> productItemDTO, Integer orderId) {
		return iOrderItemDao.createOrderItem(productItemDTO,orderId);
	}
	/**
	 * {@inheritDoc}
	 */
	  public  List<ProductItemDTO>  getOrderItemByOrderId(Integer OrderId){
			return iOrderItemDao.getOrderItemByOrderId(OrderId);

	 }

}
