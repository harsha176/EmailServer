package edu.ncsu.csc574.emailserver.emailmanagement;

public class MailHeader implements IMailHeader {
	public static final String MAIL_FIELDS_SEPARATOR = "$$$$";
	String fromAddress;
	String toAddress;
	int id;
	String Date;
	String Subject;
	
	@Override
	public String getFromAddress() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public String getDate() {
		// TODO Auto-generated method stub
		return Date;
	}

	@Override
	public String getToAddress() {
		// TODO Auto-generated method stub
		return toAddress;
	}

	@Override
	public String getSubject() {
		// TODO Auto-generated method stub
		return Subject;
	}

	public void setDate(String date) {
		Date = date;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setFromAddress(String fromAddress) {
		this.fromAddress = fromAddress;
	}
	public void setSubject(String subject) {
		Subject = subject;
	}
	public void setToAddress(String toAddress) {
		this.toAddress = toAddress;
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(id);
		sb.append(MAIL_FIELDS_SEPARATOR);
		sb.append(fromAddress);
		sb.append(MAIL_FIELDS_SEPARATOR);
		sb.append(toAddress);
		sb.append(MAIL_FIELDS_SEPARATOR);
		sb.append(Date);
		sb.append(MAIL_FIELDS_SEPARATOR);
		sb.append(Subject);
		
		return sb.toString();
	}
	
}
