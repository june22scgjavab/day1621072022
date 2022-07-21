package com.infosys.convertostring;

public class Validator {

	
	public void validate(IssueTracker issueTracker) throws IssueTrackerException {
		
		if(!(validateId(issueTracker.getId())))
		{
			throw new IssueTrackerException("Id is not allowed as 0 in negative");
		}
		if(!(validateName(issueTracker.getCustomerName())))
		{
			throw new IssueTrackerException("Name should start with uppercase followed by lowercase");
		}
		
	}

	private boolean validateName(String customerName) {
		boolean isValid=true;
		String regexName="[A-Z][a-z]+";
		if(!customerName.matches(regexName))
		{
		isValid=false;
		}
		return isValid;
		}

	private boolean validateId(int id) {
		boolean isValid=true;
		if(id<=0) {
			isValid=false;
		}
	   return isValid;
	}
}
