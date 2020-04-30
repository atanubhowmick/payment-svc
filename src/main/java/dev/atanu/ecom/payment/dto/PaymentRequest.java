/**
 * 
 */
package dev.atanu.ecom.payment.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Atanu Bhowmick
 *
 */
@Getter
@Setter
@NoArgsConstructor
public class PaymentRequest extends AbstractBaseDTO {

	private static final long serialVersionUID = 2070422380769978386L;

	private Long userId;
	private CardDetails cardDetails;
	private Double paymentAmount;
}
