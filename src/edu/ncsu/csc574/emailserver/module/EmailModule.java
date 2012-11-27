package edu.ncsu.csc574.emailserver.module;

import edu.ncsu.csc574.module.IModule;
import edu.ncsu.csc574.module.IRequestProcessor;

public class EmailModule implements IModule{

	@Override
	public IRequestProcessor getRequestProcessorInstance() {
		return EmailRequestProcessor.getInstance();
	}

	@Override
	public String getName() {
		return "EmailModule";
	}

}
