package com.hrms.API.utils;

import com.hrms.API.steps.Practice.HardcodedExamples;

public class PayloadConstants {
	
	
	
	/**
	 * Create employee body
	 * @return
	 */
	public static String createEmployeeBody() {	
		String createEmployeeBody = "{\n" + 
				"  \"emp_firstname\": \"syntaxFirstName\",\n" + 
				"  \"emp_lastname\": \"syntaxLastName\",\n" + 
				"  \"emp_middle_name\": \"syntaxMiddleName\",\n" + 
				"  \"emp_gender\": \"F\",\n" + 
				"  \"emp_birthday\": \"2000-07-11\",\n" + 
				"  \"emp_status\": \"Employee\",\n" + 
				"  \"emp_job_title\": \"Cloud Architect\"\n" + 
				"}";	
		return createEmployeeBody;
	}	
	/**
	 * Creating payload using JSONObject and returning it as a String 
	 * @return
	 */
	
	public static String creatEmployeePayload() {	
		JSONObject obj = new JSONObject();
		
		obj.put("emp_firstname", "syntaxFirstName");
		obj.put("emp_lastname", "syntaxLastName");
		obj.put("emp_middle_name", "syntaxMiddleName");
		obj.put("emp_gender", "F");
		obj.put("emp_birthday", "2000-07-11");
		obj.put("emp_status", "Employee");
		obj.put("emp_job_title", "Cloud Architect");		
		return obj.toString();	
	}
	/**
	 * Created method to return payload - to reduce messy code
	 * @return
	 */
	public static String updateCreatedEmpBody() {		
		String updateBody = "{\n" + "  \"employee_id\": \"" + HardcodedExamples.employeeID + "\",\n"
				+ "  \"emp_firstname\": \"syntaxUpdatedFirstName\",\n"
				+ "  \"emp_lastname\": \"syntaxUpdatedLastName\",\n"
				+ "  \"emp_middle_name\": \"syntaxUpdatedMiddleName\",\n" + "  \"emp_gender\": \"F\",\n"
				+ "  \"emp_birthday\": \"2000-07-11\",\n" + "  \"emp_status\": \"Employee\",\n"
				+ "  \"emp_job_title\": \"Cloud Consultant\"\n" + "}";
				return updateBody;
	}
	
	

}