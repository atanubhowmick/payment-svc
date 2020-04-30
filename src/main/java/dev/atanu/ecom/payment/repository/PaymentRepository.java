/**
 * 
 */
package dev.atanu.ecom.payment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import dev.atanu.ecom.payment.entity.PaymentEntity;

/**
 * @author Atanu Bhowmick
 *
 */
public interface PaymentRepository extends JpaRepository<PaymentEntity, Long>, JpaSpecificationExecutor<PaymentEntity>{

}
