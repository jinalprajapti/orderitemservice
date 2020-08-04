package com.example.ois.orderitemservice.common;

public interface QueryConstant {
	String GET_ORDER_ITEM_BY_ORDERID = " SELECT product_code as productCode, product_name as productName,quantity as quantity FROM order_item  where order_id = ? ";

	String INSERT_NEW_ORDER_ITEM  = "INSERT INTO order_item( "
			+ "  PRODUCT_CODE, PRODUCT_NAME, QUANTITY,ORDER_ID) "
			+ " VALUES( ?,?,?,?)";
}
