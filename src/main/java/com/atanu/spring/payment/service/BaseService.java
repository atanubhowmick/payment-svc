/**
 * 
 */
package com.atanu.spring.payment.service;

/**
 * Interface to provide search related operations
 * 
 * @author Atanu Bhowmick
 *
 */
public interface BaseService<R, T> {

	/**
	 * Find by User Id
	 * 
	 * @param userId
	 * @return T
	 */
	T getByRequestId(Long requestId);

	/**
	 * 
	 * @param r
	 * @return T
	 */
	T create(R r);
}
