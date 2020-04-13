/**
 * 
 */
package com.atanu.spring.payment.service;

import org.slf4j.event.Level;
import org.springframework.stereotype.Service;

import com.atanu.spring.payment.annotation.LogMethodCall;
import com.atanu.spring.payment.dto.PaymentRequest;
import com.atanu.spring.payment.dto.PaymentResponse;

/**
 * @author Atanu Bhowmick
 *
 */
@Service
@LogMethodCall(logLevel = Level.INFO, showParams = true, showResult = true)
public class PaymentServiceImpl implements BaseService<PaymentRequest, PaymentResponse> {

	@Override
	public PaymentResponse getByRequestId(Long requestId) {
		return null;
	}

	@Override
	public PaymentResponse create(PaymentRequest r) {
		return null;
	}

}
