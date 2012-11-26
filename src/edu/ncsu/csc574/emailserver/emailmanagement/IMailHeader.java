package edu.ncsu.csc574.emailserver.emailmanagement;

public interface IMailHeader {
	public String getFromAddress();
	public String getId();
	public String getDate();
	public String getToAddress();
	public String getSubject();
}
