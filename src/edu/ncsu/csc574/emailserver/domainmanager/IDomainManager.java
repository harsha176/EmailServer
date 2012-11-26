package edu.ncsu.csc574.emailserver.domainmanager;

public interface IDomainManager {
	
	public void registerDomain(String domainName, String ipAddr);
	
	public String getAuthServerAddr(String domainName);

}
