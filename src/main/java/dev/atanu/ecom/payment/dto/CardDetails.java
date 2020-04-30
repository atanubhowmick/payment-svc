/**
 * 
 */
package dev.atanu.ecom.payment.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

import dev.atanu.ecom.payment.constant.CardNameEnum;
import dev.atanu.ecom.payment.constant.CardTypeEnum;
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
public class CardDetails extends AbstractBaseDTO {

	private static final long serialVersionUID = 5013832371370368907L;

	private Long cardId;
	private String payeeName;
	private Long cardNumber;
	private CardTypeEnum cardType;
	private CardNameEnum cardName;
	@JsonFormat(shape = Shape.STRING, pattern = "dd/MM/yyyy", timezone = "IST")
	private Date validityDate;
	private Integer cvvNumber;
}
