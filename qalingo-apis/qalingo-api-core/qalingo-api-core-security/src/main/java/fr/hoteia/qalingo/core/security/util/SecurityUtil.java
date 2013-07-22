/**
 * Most of the code in the Qalingo project is copyrighted Hoteia and licensed
 * under the Apache License Version 2.0 (release version 0.7.0)
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *                   Copyright (c) Hoteia, 2012-2013
 * http://www.hoteia.com - http://twitter.com/hoteia - contact@hoteia.com
 *
 */
package fr.hoteia.qalingo.core.security.util;

import javax.servlet.http.HttpServletRequest;

import fr.hoteia.qalingo.core.domain.Customer;
import fr.hoteia.qalingo.core.domain.User;

public interface SecurityUtil {

	String generatePassword(String clearPassword);
	
	void authenticationCustomer(HttpServletRequest request, Customer customer);
	
	void authenticationUser(HttpServletRequest request, User user);
}