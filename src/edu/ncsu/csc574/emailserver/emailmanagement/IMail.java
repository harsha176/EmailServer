package edu.ncsu.csc574.emailserver.emailmanagement;

public interface IMail {
	public IMailHeader getMailHeader();

	public String message();

	/**
	 * returns name of the attachment and attachment is returned in data array.
	 * 
	 * @param data
	 * @return
	 */
	public String attachment(byte[] data);
}
