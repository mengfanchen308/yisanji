package com.yisanji.pojo;

public class User {
    private Integer id;

	private String username;

	private String password;

	private String tel;

	private String information;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username == null ? null : username.trim();
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password == null ? null : password.trim();
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel == null ? null : tel.trim();
	}

	public String getInformation() {
		return information;
	}

	public void setInformation(String information) {
		this.information = information == null ? null : information.trim();
	}
}