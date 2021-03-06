package edu.swjtu.model;

/**
 * 
 * Staff.java类
 * 2016年7月9日
 * @author wujunyu
 * TODo
 */
public class Staff {
	private int staffId;
	private String name;
	private String number;
	private String department;
	private String group;
	private int arrangeId;
	private double lati;
	private double longti;
	public int getArrangeId() {
		return arrangeId;
	}
	public void setArrangeId(int arrangeId) {
		this.arrangeId = arrangeId;
	}
	public int getLineId() {
		return lineId;
	}
	public double getLati() {
		return lati;
	}
	public void setLati(double lati) {
		this.lati = lati;
	}
	public double getLongti() {
		return longti;
	}
	public void setLongti(double longti) {
		this.longti = longti;
	}
	public void setLineId(int lineId) {
		this.lineId = lineId;
	}
	private String address;
	private int lineId;
	public int getStaffId() {
		return staffId;
	}
	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getSiteId() {
		return siteId;
	}
	public void setSiteId(int site_id) {
		this.siteId = site_id;
	}
	private int siteId;
}
