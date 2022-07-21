package com.infy.validator;

import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.logging.LogFactory;

import com.infy.model.Employee;

public class Validator {
	
	public void validate(Employee employee) throws Exception {
		try {
			if(employee.getName()==null || employee.getName().isBlank())
				throw new Exception("Validator.INVALID_EMPLOYEE_NAME");
			if(employee.getEmpId()==null || employee.getEmpId()<1000)
				throw new Exception("Validator.INVALID_EMPLOYEE_ID");
		}
		catch(Exception exception) {
			LogFactory.getLog(this.getClass()).
			error(new Configurations().properties("configuration.properties").
			getProperty(exception.getMessage()), exception); 
			
			/*LogFactory.getLog(this.getClass()).
			error(exception.getMessage(), exception); */
			
			
			throw exception;
		}
	}
	
}
   
// Log logger=LogFactory.getLog(this.getClass());


// PropertiesConfiguration propertiesConfig=null;
// Configurations configuration=new Configurations();
// propertiesConfig=configuration.properties("configuration.properties");
// logger.error(propertiesConfig.getProperty("Validator.INVALID_EMPLOYEE_NAME"));




