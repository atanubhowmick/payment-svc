/**
 * 
 */
package dev.atanu.ecom.payment.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import dev.atanu.ecom.payment.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Atanu Bhowmick
 *
 */
@Getter
@Setter
@Entity
@Table(name = "CARD_DETAILS")
public class CardEntity extends BaseEntity {

	private static final long serialVersionUID = 4117171638156462133L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CARD_ID")
	private Long cardId;

	@Column(name = "PAYEE_NAME")
	private String payeeName;

	@Column(name = "CARD_NUMBER")
	private Long cardNumber;

	@Column(name = "VALIDITY_DATE")
	private Date validityDate;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "CARD_TYPE_ID")
	private CardTypeEntity cardType;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "CARD_NAME_ID")
	private CardNameEntity cardName;

}
