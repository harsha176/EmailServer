package edu.ncsu.csc574.emailserver.emailmanagement;

import java.util.List;

public interface IEmailManager {
	public void sendMail(IMail mail);
	public List<IMailHeader> retrieveMail(String username, int start, int count);
	public IMail readMail(String username, String mailId);
}
