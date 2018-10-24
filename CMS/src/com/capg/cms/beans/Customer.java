package com.capg.cms.beans;

public class Customer {

	private int cid;
	private String cname;
	private String addr;
	
	
	
	public int getCid() {
		return cid;
	}
	public String getCname() {
		return cname;
	}
	public String getAddr() {
		return addr;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", addr=" + addr
				+ "]";
	}
	
	
	
	
	
}
