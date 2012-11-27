package edu.ncsu.csc574.emailserver.emailmanagement;

public class Mail implements IMail {
	MailHeader mailHeader;
	String message;
	byte[] attachments;
	
	@Override
	public IMailHeader getMailHeader() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String message() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String attachment(byte[] data) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public byte[] getAttachments() {
		return attachments;
	}

	public void setAttachments(byte[] attachments) {
		this.attachments = attachments;
	}

	public void setMailHeader(MailHeader mailHeader) {
		this.mailHeader = mailHeader;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		sb.append(mailHeader.toString());
		sb.append(MailHeader.MAIL_FIELDS_SEPARATOR);
		sb.append(message);
		
		return sb.toString();
	}
	
}
