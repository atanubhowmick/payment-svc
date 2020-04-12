/**
 * 
 */
package com.atanu.spring.payment.constant;

/**
 * @author Atanu Bhowmick
 *
 */
public enum StatusEnum {

	ACTIVE('Y'), 
	INACTIVE('N');

	private Character value;

	private StatusEnum(Character value) {
		this.value = value;
	}

	public Character getValue() {
		return value;
	}
}
