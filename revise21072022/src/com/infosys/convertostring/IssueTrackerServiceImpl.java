package com.infosys.convertostring;

public class IssueTrackerServiceImpl implements IssueTrackerService {

	 IssueTrackerDAO issueTrackerDAO=new IssueTrackerDAOImpl();
	 Validator validator=new Validator();
	@Override
	public void addIssues(IssueTracker issue) throws IssueTrackerException {
		validator.validate(issue);
		issueTrackerDAO.addIssue(issue);

	}

}
