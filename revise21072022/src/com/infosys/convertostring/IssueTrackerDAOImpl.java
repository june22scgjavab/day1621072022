package com.infosys.convertostring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IssueTrackerDAOImpl implements IssueTrackerDAO {

	List<IssueTracker> issueTrackerList=new ArrayList<IssueTracker>();

	
	/*  public IssueTrackerDAOImpl() {
		IssueTracker[] issues= {new
	  IssueTracker(1,"No Power"),new IssueTracker(2,"No Water")};
	  issueTrackerList=Arrays.asList(issues); 
	  
	  
	  issueTrackerList.add(new IssueTracker(1,"No Power")); 
	  issueTrackerList.add(new IssueTracker(2,"No Water")); 
	  }   */
	 

	@Override
	public void addIssue(IssueTracker issue) {
		issueTrackerList.add(issue);
		System.out.println(issueTrackerList);

	}

}
