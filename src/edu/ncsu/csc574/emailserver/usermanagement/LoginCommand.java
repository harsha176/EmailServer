package edu.ncsu.csc574.emailserver.usermanagement;

import edu.ncsu.csc574.module.ICommandProcessor;
import edu.ncsu.csc574.module.IRequest;
import edu.ncsu.csc574.module.IResponse;
import edu.ncsu.csc574.module.IUserContext;

public class LoginCommand extends UserManager implements ICommandProcessor{

	/**
	 * Invokes AuthModule.process() which takes care of local/external user authentication
	 * Authenticate user(default/external)
	 */
	@Override
	public IResponse process(IUserContext utx, IRequest request) {
		return null;
	}

}


