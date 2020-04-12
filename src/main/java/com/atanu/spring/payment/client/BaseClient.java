/**
 * 
 */
package com.atanu.spring.payment.client;

import java.util.Objects;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.atanu.spring.payment.constant.ErrorCode;
import com.atanu.spring.payment.dto.ErrorResponse;
import com.atanu.spring.payment.dto.GenericResponse;
import com.atanu.spring.payment.exception.CartException;

/**
 * @author Atanu Bhowmick
 *
 */
public interface BaseClient {

	/**
	 * Default method to validate response
	 * 
	 * @param <T>
	 * @param response
	 * @return T
	 */
	public default <T> T validateResponse(ResponseEntity<GenericResponse<T>> response) {
		if (!HttpStatus.OK.equals(response.getStatusCode()) || !response.getBody().isSuccess()) {
			ErrorResponse error = response.getBody().getError();
			if (Objects.nonNull(error)) {
				throw new CartException(error.getErrorCode(), error.getErrorMessage());
			} else {
				throw new CartException(ErrorCode.CART_E500.name(), ErrorCode.CART_E500.getErrorMsg());
			}
		}
		return response.getBody().getPayload();
	}
}
