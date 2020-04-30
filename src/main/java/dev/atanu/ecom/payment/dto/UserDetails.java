/**
 * 
 */
package dev.atanu.ecom.payment.dto;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Atanu Bhowmick
 *
 */
@Getter
@Setter
public class UserDetails extends AbstractBaseDTO {

	private static final long serialVersionUID = 9097201385543316258L;

	private Long userId;
	private String username;
	private String firstName;
	private String lastName;
	private Date dateOfBirth;

}
