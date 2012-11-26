package edu.ncsu.csc574.emailserver.usermanagement;

import edu.ncsu.csc574.emailserver.commlayer.IUserContext;
import edu.ncsu.csc574.emailserver.workflowmanager.ICommandProcessor;
import edu.ncsu.csc574.emailserver.workflowmanager.IRequest;
import edu.ncsu.csc574.emailserver.workflowmanager.IResponse;

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


