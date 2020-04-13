/**
 * 
 */
package com.atanu.spring.payment.constant;

/**
 * This enum contains all the Card Type
 * 
 * 
 * @author Atanu Bhowmick
 *
 */
public enum CardTypeEnum {

	DEBIT_CARD("Debit"), 
	CREDIT_CARD("Credit"),
	GIFT_CARD("Gift Card");

	private String type;

	private CardTypeEnum(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

}
