package com.dxc.ihub.model;

public class DatabaseInfo {
	private String databaseUrl;
	private String databaseUserName;
	private String databasePassword;
	
	public DatabaseInfo() {}
	public DatabaseInfo(String url, String userName, String password) {
		this.databaseUrl = url;
		this.databaseUserName = userName;
		this.databasePassword = password;
	}
	
	public String getDatabaseUrl() {
		return databaseUrl;
	}
	public void setDatabaseUrl(String databaseUrl) {
		this.databaseUrl = databaseUrl;
	}
	public String getDatabaseUserName() {
		return databaseUserName;
	}
	public void setDatabaseUserName(String databaseUserName) {
		this.databaseUserName = databaseUserName;
	}
	public String getDatabasePassword() {
		return databasePassword;
	}
	public void setDatabasePassword(String databasePassword) {
		this.databasePassword = databasePassword;
	}
}
