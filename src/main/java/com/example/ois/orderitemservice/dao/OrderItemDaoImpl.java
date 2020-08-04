package com.example.ois.orderitemservice.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

import com.example.ois.orderitemservice.common.QueryConstant;
import com.example.ois.orderitemservice.dto.ProductItemDTO;


@Repository
public class OrderItemDaoImpl implements IOrderItemDao{
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public boolean createOrderItem(List<ProductItemDTO> productItemDTOList, Integer orderId) {
		if(!CollectionUtils.isEmpty(productItemDTOList)){
			for(ProductItemDTO p : productItemDTOList){
				jdbcTemplate.update(QueryConstant.INSERT_NEW_ORDER_ITEM , p.getProductCode(),
						p.getProductName(), p.getQuantity(), orderId);
			}
			return true;
		}
		return false;
	}

	
	  public  List<ProductItemDTO>  getOrderItemByOrderId(Integer orderId){
		 String sbSelectQuery = QueryConstant.GET_ORDER_ITEM_BY_ORDERID;
			return jdbcTemplate.query(sbSelectQuery.toString(),new Object[]{ orderId },
						new BeanPropertyRowMapper<ProductItemDTO>(ProductItemDTO.class));
			
	 }

}
