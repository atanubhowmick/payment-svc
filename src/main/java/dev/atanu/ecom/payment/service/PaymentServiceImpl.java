/**
 * 
 */
package dev.atanu.ecom.payment.service;

import org.slf4j.event.Level;
import org.springframework.stereotype.Service;

import dev.atanu.ecom.payment.annotation.LogMethodCall;
import dev.atanu.ecom.payment.dto.PaymentRequest;
import dev.atanu.ecom.payment.dto.PaymentResponse;

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
