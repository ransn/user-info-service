/**
 * 
 */
package com.snr.user.api;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.snr.user.bean.User;

/**
 * @author I326319
 *
 */
@RestController
@RequestMapping("/user")
public class UserInformationRestService {
	
	@RequestMapping("/userDetails/{userId}")
	public User getUserBasicInformation(@PathVariable("userId")String userId) {
		return new User("Alex", "#45, ABC street", "1234567891");
	}

}
