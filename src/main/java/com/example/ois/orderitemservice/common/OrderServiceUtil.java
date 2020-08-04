package com.example.ois.orderitemservice.common;

import com.example.ois.orderitemservice.domain.ServiceResponse;

public class OrderServiceUtil {

	public static ServiceResponse getServiceResponse(final Object res, final String errorMessage) {
		if (null != res) {
			return getSuccessServiceResponse(res);
		} else {
			return getFailureServiceResponse(errorMessage);
		}
	}

	public static ServiceResponse getServiceResponse(final Object res) {
		return getServiceResponse(res, AppConstant.STR_NO_RECORD_FOUND);
	}

	public static ServiceResponse getSuccessServiceResponse(final Object result) {
		ServiceResponse response = new ServiceResponse();
		response.setStatus(AppConstant.STR_SUCCESS);
		response.setResponseMessage(AppConstant.STR_SUCCESS);
		response.setResObject(result);
		return response;
	}

	/**
	 * get Failure Service Response with message
	 * 
	 * @param message
	 * @return ServiceResponse
	 */
	public static ServiceResponse getFailureServiceResponse(final String message) {
		ServiceResponse response = new ServiceResponse();
		response.setStatus(AppConstant.STR_FAILED);
		response.setResponseMessage(message);
		return response;
	}

	/**
	 * get Failure Service Response with message and object
	 * 
	 * @param message
	 * @param result
	 * @return ServiceResponse
	 */
	public static ServiceResponse getFailureServiceResponse(final String message, final Object result) {
		ServiceResponse response = new ServiceResponse();
		response.setStatus(AppConstant.STR_FAILED);
		response.setResponseMessage(message);
		response.setResObject(result);
		return response;
	}

	

	
}
