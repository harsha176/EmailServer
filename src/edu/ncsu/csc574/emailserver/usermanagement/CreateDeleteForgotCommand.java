package edu.ncsu.csc574.emailserver.usermanagement;

import edu.ncsu.csc574.module.ICommandProcessor;
import edu.ncsu.csc574.module.IRequest;
import edu.ncsu.csc574.module.IResponse;
import edu.ncsu.csc574.module.IUserContext;



public class CreateDeleteForgotCommand implements ICommandProcessor{

	/**
	 * First check with domain server if the request is for default domain 
	 * If so, send these requests over network to default authentication server.
	 * else return invalid request
	 */
	@Override
	public IResponse process(IUserContext ctx, IRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

}
