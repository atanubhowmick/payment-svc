/**
 * 
 */
package com.atanu.spring.payment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atanu.spring.payment.annotation.LogMethodCall;
import com.atanu.spring.payment.dto.GenericResponse;
import com.atanu.spring.payment.dto.PaymentRequest;
import com.atanu.spring.payment.dto.PaymentResponse;
import com.atanu.spring.payment.service.BaseService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
 * @author Atanu Bhowmick
 *
 */
@RestController
@RequestMapping("/api/payment")
@LogMethodCall
public class PaymentController {
	
	@Autowired
	private BaseService<PaymentRequest, PaymentResponse> paymentService;
	
	@ApiOperation(value = "Make Payment", response = GenericResponse.class)
	@GetMapping(value = "/make-payment", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<GenericResponse<PaymentResponse>> getCartDetailsById(
			@ApiParam(value = "Make Payment to pruchase products", required = true) @RequestBody PaymentRequest request) {
		GenericResponse<PaymentResponse> response = new GenericResponse<>(paymentService.create(request));
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

}
