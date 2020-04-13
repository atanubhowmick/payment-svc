/**
 * 
 */
package com.atanu.spring.payment.service;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.atanu.spring.payment.entity.BaseEntity;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Atanu Bhowmick
 *
 */
@Getter
@Setter
@Entity
@Table(name = "CARD_NAME_DETAILS")
public class CardNameEntity extends BaseEntity {

	private static final long serialVersionUID = -4178808882546694837L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CARD_NAME_ID")
	private Long cardNameId;

	@Column(name = "CARD_NAME")
	private String cardName;

}
