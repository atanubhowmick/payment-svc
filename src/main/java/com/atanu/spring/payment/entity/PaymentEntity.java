/**
 * 
 */
package com.atanu.spring.payment.entity;

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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Atanu Bhowmick
 *
 */
@Getter
@Setter
@Entity
@Table(name = "PAYMENT_DETAILS")
public class PaymentEntity extends BaseEntity {

	private static final long serialVersionUID = -670691180296628813L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PAYMENT_ID")
	private Long paymentId;

	@Column(name = "USER_ID")
	private Long userId;
	
	@Column(name = "ORDER_ID")
	private Long orderId;

	@Column(name = "PAYMENT_REQUEST_ID")
	private Long paymentRequestId;

	@Column(name = "TRANSACTION_ID")
	private String transactionId;

	@Column(name = "PAYMENT_AMOUNT")
	private Double paymentAmount;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "PAYMENT_DATE")
	private Date paymentDate;

	@Column(name = "BANK_STATUS")
	private Double bankStatus;

	@Column(name = "PAYMENT_STATUS")
	private Double paymentStatus;

	@JoinColumn(name = "CARD_ID", nullable = false)
	@ManyToOne(cascade = CascadeType.ALL)
	private CardEntity cardEntity;
}
