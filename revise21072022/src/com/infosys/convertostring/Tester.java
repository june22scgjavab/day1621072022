package com.infosys.convertostring;

public class Tester {

	public static void main(String[] args) {
	// We have to create an object of IssueTracker
	// We have to create an object of IssueTrackerService
	IssueTracker issue=new IssueTracker(-1,"Tom");
	IssueTrackerService issueTrackerService=new IssueTrackerServiceImpl();
	try {
		issueTrackerService.addIssues(issue);
		System.out.println("Add with success");
	} catch (IssueTrackerException e) {
		System.out.println(e.getMessage());
		
	}		
	}

}
