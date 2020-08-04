package com.example.ois.orderitemservice.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.ois.orderitemservice.common.OrderServiceUtil;
import com.example.ois.orderitemservice.domain.ServiceResponse;
import com.example.ois.orderitemservice.dto.ProductItemDTO;
import com.example.ois.orderitemservice.service.IOrderItemService;

import io.swagger.annotations.ApiOperation;

@Controller
@RequestMapping("/orderitemservice")
public class OrderItemServiceController {
	
	private static final Logger LOGGER = Logger.getLogger(OrderItemServiceController.class);
	
	@Autowired
	IOrderItemService iOrderItemService;
	
	
	@ApiOperation(value = "Create New Order Item", notes = "Create New Order Item.")
	@RequestMapping(value = "/createOrderItem/{orderId}", method = RequestMethod.POST, produces = "application/json")
	public @ResponseBody ServiceResponse createOrderItem(@RequestBody List<ProductItemDTO> productItemDTO,
			@PathVariable Integer orderId) {
		LOGGER.debug("...in .createOrderItem controller start.");
		boolean f = iOrderItemService.createOrderItem(productItemDTO,orderId);
		return OrderServiceUtil.getServiceResponse(f);
	}
	
	@ApiOperation(value = "get Order Item by Order Id", notes = "get Order Item by Order Id.")
	@RequestMapping(value = "/getOrderItemByOrderId/{orderId}", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody List<ProductItemDTO> getOrderItemByOrderId(@PathVariable Integer orderId) {
		LOGGER.debug("...in .getAllOrder controller start.");
		  return iOrderItemService.getOrderItemByOrderId(orderId);
	}
	
}
