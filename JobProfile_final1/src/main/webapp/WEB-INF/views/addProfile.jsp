<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Job Profile</title>
</head>
<body>
<form:form method="POST"  modelAttribute="profileBean" action="saveProfile">
	<h2><u>Job Details</u></h2>
		<table>
	 	<%-- 
			<tr>
				<td>Company :</td>
				<td><form:select path="company_id">
						<form:option value="0" label="Select" /> 
						<form:option value="1"  label="TCS" />
						<form:option value="2" label="Accenture" />
						<form:option value="3"  label="Reliance" />
						<form:option value="4" label="Godrej" />
						
					</form:select></td>
			</tr>
			 --%> 
			<tr>
				<td>Job Id :</td>
				<td><form:input path="job_id" /></td>
			</tr>
			<tr>
				<td>Event Id :</td>
				<td><form:input path="event_id" /></td>
			</tr>
			<tr>
				<td>Description :</td>
				<td><form:textarea path="job_description" /></td>
			</tr>
			<tr>
				<td>Category :</td>
				<td><form:select path="job_category">
						<%-- <form:option value="0" label="Select" /> --%>
						<form:option value="Non Dream"  label="Non Dream" />
						<form:option value="Dream" label="Dream" />
						<form:option value="Super Dream" label="Super Dream" />
						
					</form:select></td>
			</tr>
			
			<tr>
				<td>CTC :</td>
				<td><form:input path="ctc" /></td>
			</tr>
			<tr>
				
			<tr>
				<td>Skills required :</td>
				<td><form:textarea path="skills_required" /></td>
			</tr>
			
			<tr>
				<td>Documents required :</td>
				<td><form:textarea path="docs_required" /></td>
			</tr>
			
			<tr>
				<td>Drive date :</td>
				<td><form:input path="drive_date" /></td>
			</tr>
			
			<tr>
				<td>Created Date :</td>
				<td><form:input path="created_date" /></td>
			</tr>
			
			<tr>
				<td>Created By :</td>
				<td><form:input path="created_by" /></td>
			</tr>
			
			<tr>
				<td>Modified Date :</td>
				<td><form:input path="modified_date" /></td>
			</tr>
			
			<tr>
				<td>Modified By :</td>
				<td><form:input path="modified_by" /></td>
			</tr>
			
						
			<tr><td></td></tr>
			
			<td><b><u>Criteria Details :</u></b></td>
			
			<tr>
				<td>Criteria Id :</td>
				<td><form:input path="criteria_id" /></td>
			</tr>
			
			<%-- <tr>
				<td>Eligible Branches :</td>
				<td><form:checkbox path="eligible_branches" value="Computers" label="Computers"/></td>
				<td><form:checkbox path="eligible_branches" value="IT" label="IT"/></td>
				<td><form:checkbox path="eligible_branches" value="Electronics" label="Electronics"/></td>
				<td><form:checkbox path="eligible_branches" value="Production" label="Production"/></td>
			</tr> --%>
			
			<tr>
				<td>Eligible Branches :</td>
				<td><form:textarea path="eligible_branches" /></td>
			</tr>
			
			<tr>
				<td>Year of passing :</td>
				<td><form:input path="year_of_passing" /></td>
			</tr>
			
			<tr>
				<td>Placed Students Allowed :</td>
				<td><form:input path="placed_students_allowed" /></td>
			</tr>
			
			<tr>
				<td>Percentage :</td>
				<td><form:input path="percentage" /></td>
			</tr>
			
			<tr>
				<td>CGPA :</td>
				<td><form:input path="cgpa" /></td>
			</tr>
			
			<tr>
				<td>No. Of Live KTS Allowed :</td>
				<td><form:input path="no_of_live_kts_allowed" /></td>
			</tr>
			
			<tr>
				<td>No. Of Dead KTS Allowed :</td>
				<td><form:input path="no_of_dead_kts_allowed" /></td>
			</tr>
			
			<tr>
				<td>Year Gap Allowed :</td>
				<td><form:input path="year_gap_allowed" /></td>
			</tr>
			
			<tr>
				<td>SSC Percentage :</td>
				<td><form:input path="ssc_percentage" /></td>
			</tr>
			
			<tr>
				<td>HSC/Diploma Percentage :</td>
				<td><form:input path="hsc_or_dip_percentage" /></td>
			</tr>
			
			<tr>
				<td>Last Date To Apply :</td>
				<td><form:input path="last_date_to_apply" /></td>
			</tr>
						
			<tr></tr><tr></tr>
			
			<tr>
			
				<td colspan="2"><input type="submit" value="Add Profile"></td>
			</tr>
		</table>
	</form:form>


</body>
</html>