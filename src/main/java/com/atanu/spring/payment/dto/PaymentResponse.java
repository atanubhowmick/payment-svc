/**
 * 
 */
package com.atanu.spring.payment.dto;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Atanu Bhowmick
 *
 */
@Getter
@Setter
public class PaymentResponse extends AbstractBaseDTO {

	private static final long serialVersionUID = -7144589633832132762L;

	private Long requestId;
	private String transactionId;
	private Double paymentAmount;
	private Date paymentDate;
	private String bankStatus;
	private String paymentStatus;
}
