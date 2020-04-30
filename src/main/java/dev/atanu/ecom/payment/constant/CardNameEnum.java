/**
 * 
 */
package dev.atanu.ecom.payment.constant;

/**
 * This enum contains all the Card Type
 * 
 * 
 * @author Atanu Bhowmick
 *
 */
public enum CardNameEnum {

	MASTER("Master"), 
	VISA("Visa"), 
	RUPAY("Rupay");

	private String cardName;

	private CardNameEnum(String cardName) {
		this.cardName = cardName;
	}

	public String getCardName() {
		return cardName;
	}

}
