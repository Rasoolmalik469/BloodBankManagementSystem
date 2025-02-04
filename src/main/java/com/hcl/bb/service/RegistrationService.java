package com.hcl.bb.service;

import com.hcl.bb.appexception.ApplicationException;
import com.hcl.bb.model.User;
/**
 * @author Rasool Malik Vempalli
 */

public interface RegistrationService {

	public boolean validateUser(User user) throws ApplicationException;
	public boolean isPasswordNotStrong(String password) throws ApplicationException;
	public boolean doesUserExists(User user) throws ApplicationException;
	public boolean addUser(User user);
}
