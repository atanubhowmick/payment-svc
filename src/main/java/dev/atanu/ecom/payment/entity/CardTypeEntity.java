/**
 * 
 */
package dev.atanu.ecom.payment.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "CARD_TYPE_DETAILS")
public class CardTypeEntity extends BaseEntity {

	private static final long serialVersionUID = -4178808882546694837L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CARD_TYPE_ID")
	private Long cardTypeId;

	@Column(name = "CARD_TYPE_NAME")
	private String cardTypeName;

}
