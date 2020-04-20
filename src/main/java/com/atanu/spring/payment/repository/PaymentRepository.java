/**
 * 
 */
package com.atanu.spring.payment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.atanu.spring.payment.entity.PaymentEntity;

/**
 * @author Atanu Bhowmick
 *
 */
public interface PaymentRepository extends JpaRepository<PaymentEntity, Long>, JpaSpecificationExecutor<PaymentEntity>{

}
