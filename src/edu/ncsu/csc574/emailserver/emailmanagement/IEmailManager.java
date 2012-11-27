package edu.ncsu.csc574.emailserver.emailmanagement;

import java.util.List;

public interface IEmailManager {
	public void sendMail(IMail mail) throws Exception;

	public List<IMailHeader> retrieveMail(String username, int start, int count)
			throws Exception;

	public IMail readMail(String username, int mailId) throws Exception;
}
