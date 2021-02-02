package com.fedex.validation.processSHVS;

import org.apache.log4j.BasicConfigurator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.fedex.validation.DAO.ValidationDAO;

@Import({ValidationDAO.class})
@SpringBootApplication(scanBasePackages={"com.fedex.validation.DAO.ValidationDAO"})
public class BaselineValidationUtility {	
	
	public static void main(String[] args) throws Exception  {
		
    	SpringApplication.run(BaselineValidationUtility.class,args);
    	BasicConfigurator.configure();  // ---> Log4j Configuration
    	boolean isValidated = true;
    	while(isValidated){
    		Validate.validate();
    	}
    	
    } 
}