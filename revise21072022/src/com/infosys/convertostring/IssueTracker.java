package com.infosys.convertostring;

public class IssueTracker {
private int id;
private String customerName;
public IssueTracker(int id, String customerName) {
	super();
	this.id = id;
	this.customerName = customerName;
}

/**
 * @return the id
 */
public int getId() {
	return id;
}

/**
 * @param id the id to set
 */
public void setId(int id) {
	this.id = id;
}

/**
 * @return the customerName
 */
public String getCustomerName() {
	return customerName;
}

/**
 * @param customerName the customerName to set
 */
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}

@Override
public String toString() {
	return "IssueTracker [id=" + id + ", customerName=" + customerName + "]";
}

}
