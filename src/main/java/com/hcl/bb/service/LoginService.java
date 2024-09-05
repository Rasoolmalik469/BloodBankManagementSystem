package com.hcl.bb.service;

import com.hcl.bb.appexception.ApplicationException;
import com.hcl.bb.model.User;
/**
 * @author Rasool Malik Vempalli
 */
public interface LoginService {

	public boolean validateUserLogin(User user) throws ApplicationException;
	public User validateUser(User user) throws ApplicationException;
}
