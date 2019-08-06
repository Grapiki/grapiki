package com.udev.grapiki.model;

public class User {

	private int id;
	private String alias;
	private String birthday;
	private String email;
	private String password;
	private String picture;
	private String registrationDate;
	private boolean isSubscribedToNewsletter;
	private boolean isDeletedAccount;
	
	public User(int id, String alias, String birthday, String email, String password, String picture, String registrationDate, boolean isSubscribedToNewsletter, boolean isDeletedAccount) {
		this.setId(id);
		this.setAlias(alias);
		this.setBirthday(birthday);
		this.setEmail(email);
		this.setPassword(password);
		this.setPicture(picture);
		this.setRegistrationDate(registrationDate);
		this.setSubscribedToNewsletter(isSubscribedToNewsletter);
		this.setDeletedAccount(isDeletedAccount);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
	}

	public boolean isSubscribedToNewsletter() {
		return isSubscribedToNewsletter;
	}

	public void setSubscribedToNewsletter(boolean isSubscribedToNewsletter) {
		this.isSubscribedToNewsletter = isSubscribedToNewsletter;
	}

	public boolean isDeletedAccount() {
		return isDeletedAccount;
	}

	public void setDeletedAccount(boolean isDeletedAccount) {
		this.isDeletedAccount = isDeletedAccount;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
