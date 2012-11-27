package edu.ncsu.csc574.emailserver.emailmanagement;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MailManager implements IEmailManager {

	private static MailManager instance = null;
	private static String emailDirectoryName = System.getProperty("user.home") + "/emails";
	private HashMap<String, ArrayList<IMail>> mailRepo;
	
	public static MailManager getInstance() {
		if(instance == null) {
			instance = new MailManager();
		}
		return instance;
	}
	
	public void init() throws Exception {
		File emailDirectory = new File(emailDirectoryName);
		emailDirectory.mkdir();
		
		//iterate through all files in directory
		if(emailDirectory.isDirectory() == false) {
			System.out.println("Invalid email directory... please delete it");
			new Exception("Invalid email directory... please delete it");
		}
		
		File[] allMails = emailDirectory.listFiles();
		
		for(int i = 0; i < allMails.length; i++) {
			File usermails = allMails[i];
			BufferedReader br = new BufferedReader(new FileReader(usermails));
			String str_mail;
			//int userCount = 0;
			int id = 0;
			
			//add mails to arraylist
			ArrayList<IMail> userMailList = new ArrayList<IMail>();
			
			while((str_mail = br.readLine()) != null) {
				String[] fields = str_mail.split(MailHeader.MAIL_FIELDS_SEPARATOR);
				//mail storage format From:subject:date:message:body
				Mail mail = new Mail();
				
				
				if(fields.length != 4) {
					System.out.println("Invalid mail # fields: " + fields.length);
				}
				
				MailHeader mHeader = new MailHeader();
				mHeader.setFromAddress(fields[0]);
				mHeader.setSubject(fields[1]);
				mHeader.setDate(fields[2]);
				mHeader.setToAddress(usermails.getName());
				mHeader.setId(id++);
				
				mail.setMailHeader(mHeader);
				mail.setMessage(fields[3]);
				
				userMailList.add(mail);
			}
			mailRepo.put(usermails.getName(), userMailList);
			System.out.println("Loaded " + usermails.getName() + " mails");
			br.close();
		}
		
	}
	
	
	@Override
	public void sendMail(IMail mail) throws IOException {
		String toUser = mail.getMailHeader().getToAddress();
		mail.getMailHeader().setId(mailRepo.get(toUser).size());
		mailRepo.get(toUser).add(mail);
		//write to toUser file
		File toUserFile = new File(emailDirectoryName + "/" + toUser);
		toUserFile.createNewFile();
		PrintWriter pw = new PrintWriter(new FileWriter(toUserFile, true));
		pw.println(mail);
		pw.flush();
		pw.close();
	}

	//TODO Error handling has to be done
	@Override
	public List<IMailHeader> retrieveMail(String username, int start, int count) {
		ArrayList<IMailHeader> mailHeaderList = new ArrayList<IMailHeader>();
		for (IMail mail: mailRepo.get(username).subList(start, Math.min(start + count, mailRepo.get(username).size()))) {
			mailHeaderList.add(mail.getMailHeader());
		}
		return mailHeaderList;
	}

	
	@Override
	public IMail readMail(String username, int mailId) {
		return mailRepo.get(username).get(mailId);
	}
}
