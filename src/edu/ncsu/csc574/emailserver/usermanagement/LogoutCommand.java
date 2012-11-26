package edu.ncsu.csc574.emailserver.usermanagement;

import edu.ncsu.csc574.emailserver.commlayer.IUserContext;
import edu.ncsu.csc574.emailserver.workflowmanager.ICommandProcessor;
import edu.ncsu.csc574.emailserver.workflowmanager.IRequest;
import edu.ncsu.csc574.emailserver.workflowmanager.IResponse;

public class LogoutCommand implements ICommandProcessor{

	/**
	 * Dummy at this point of time. CleintHandler closes connection on return from this 
	 * function.
	 */
	@Override
	public IResponse process(IUserContext ctx, IRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

}
