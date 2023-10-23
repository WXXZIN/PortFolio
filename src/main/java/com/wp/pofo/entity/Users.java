package com.wp.pofo.entity;

public class Users {
	private int id;
	private String password;
	private int role;
	
	public Users() {
	}
	
	public Users(int id, String password, int role) {
		super();
		this.id = id;
		this.password = password;
		this.role = role;
	}
	public int getStudno() {
		return id;
	}
	public void setStudno(int studno) {
		this.id = studno;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getRole() {
		return role;
	}
	public void setRole(int role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Users [studno=" + id + ", password=" + password + ", role=" + role + "]";
	}
}