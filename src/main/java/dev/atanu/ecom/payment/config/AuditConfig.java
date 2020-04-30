/**
 * 
 */
package dev.atanu.ecom.payment.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * JPA Auditing enabled. Now exposing {@link PaymentAuditAware} as
 * {@link AuditorAware} bean
 * 
 * @author Atanu Bhowmick
 *
 */
@Configuration
@EnableJpaAuditing(auditorAwareRef = "auditorProvider")
public class AuditConfig {

	/**
	 * 
	 * @return {@link PaymentAuditAware}
	 */
	@Bean
	public AuditorAware<Long> auditorProvider() {
		return new PaymentAuditAware();
	}
}
