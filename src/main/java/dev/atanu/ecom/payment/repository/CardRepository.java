/**
 * 
 */
package dev.atanu.ecom.payment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import dev.atanu.ecom.payment.entity.CardEntity;

/**
 * @author Atanu Bhowmick
 *
 */
public interface CardRepository extends JpaRepository<CardEntity, Long>, JpaSpecificationExecutor<CardEntity> {

	/**
	 * Find Cart by Id
	 * 
	 * @param cartId
	 * @param activeStatus
	 * @return
	 */
	CardEntity findByCardIdAndActiveStatus(Long cardId, Character activeStatus);

}
