package edu.ncsu.csc574.emailserver.module;

import edu.ncsu.csc574.emailserver.emailmanagement.ReceiveCommand;
import edu.ncsu.csc574.emailserver.emailmanagement.RetrieveCommand;
import edu.ncsu.csc574.emailserver.emailmanagement.SendCommand;
import edu.ncsu.csc574.module.BasicRequestProcessor;
import edu.ncsu.csc574.module.ICommandProcessor;
import edu.ncsu.csc574.module.IRequest;
import edu.ncsu.csc574.module.IRequestProcessor;
import edu.ncsu.csc574.module.IResponse;
import edu.ncsu.csc574.module.IUserContext;

public class EmailRequestProcessor extends BasicRequestProcessor {	
	/**
	 * Email processing logic
	 */
	@Override
	public IResponse process(IUserContext ctx, IRequest request)
			throws Exception {
		return super.process(ctx, request);
	}

	@Override
	public void registerCommand(String name, Class cmd) {
		super.registerCommand(name, cmd);
	}

	public static IRequestProcessor getInstance() {
		if(instance == null) {
			instance = new EmailRequestProcessor();
			
			//register each command
			instance.registerCommand("SEND", SendCommand.class);
			instance.registerCommand("RETRIEVE", RetrieveCommand.class);
			instance.registerCommand("RECEIVE", ReceiveCommand.class);
		}
		return instance ;
	}

}
