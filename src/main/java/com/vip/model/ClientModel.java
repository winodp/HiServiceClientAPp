package com.vip.model;

public class ClientModel {
	private int clientId;
	private String name;
	private int age;
	
	public ClientModel(int clientId, String name, int age) {
		this.clientId = clientId;
		this.name = name;
		this.age = age;
	}
	public int getClientId() {
		return clientId;
	}
	public void setClientId(int clientId) {
		this.clientId = clientId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "ClientModel [clientId=" + clientId + ", name=" + name + ", age=" + age + "]";
	}

}
