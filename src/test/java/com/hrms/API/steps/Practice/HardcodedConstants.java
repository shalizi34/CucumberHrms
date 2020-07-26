package com.hrms.API.steps.Practice;
public class HardcodedConstants {
    public static String updateCreatedEmpBody() {
        String updateBody = "{\r\n" + "  \"employee_id\": \"" + HardcodedExamples.employeeID + "\",\r\n"
                + "  \"emp_firstname\": \"ServetUpdate\",\r\n"
                + "  \"emp_lastname\": \"ServetUpdatedLast\",\r\n"
                + "  \"emp_middle_name\": \"ServetDoNOT Have MiddleName\",\r\n" + "  \"emp_gender\": \"M\",\r\n"
                + "  \"emp_birthday\": \"2000-06-06\",\r\n"
                + "  \"emp_status\": \"Independent contractor\",\r\n"
                + "  \"emp_job_title\": \"API Tester\"\r\n" + "}";
        return updateBody;
    }
}