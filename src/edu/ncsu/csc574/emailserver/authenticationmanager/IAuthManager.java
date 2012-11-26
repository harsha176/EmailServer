package edu.ncsu.csc574.emailserver.authenticationmanager;

import edu.ncsu.csc574.emailserver.workflowmanager.IRequest;



/**
 * @author Harsha
 *
 */
public interface IAuthManager {
	
	
	/**
	 * Authenticates the user with the default/external Auth server.
	 * 1)check if the requesting user is form the default domain
	 * 2)Contact correcponding auth server(using details fetched from domainManager)
	 * @param request
	 * @return
	 */
	public boolean process(IRequest request);
}
