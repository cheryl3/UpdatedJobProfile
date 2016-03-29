package org.crce.interns.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.SecondaryTables;
import javax.persistence.Table;


@Entity
@Table(name = "job_schema.job")
@SecondaryTables({
		@SecondaryTable(name = "job_schema.criteria", pkJoinColumns = @PrimaryKeyJoinColumn(name = "criteria_id")),
		 })
public class Profile implements Serializable {

	private static final long serialVersionUID = -3153101241508852277L;

	@Column(name="company_id")
	private String company_id;
	
	@Id
	@Column(name="job_id")
	private String job_id;
	
	@Column(name="event_id")
	private String event_id;
	
	@Column(name="job_description")
	private String job_description;
	
	@Column(name="job_category")
	private String job_category;
	
	@Column(name="ctc")
	private String ctc;
	
	@Column(name="skills_required")
	private String skills_required;
	
	@Column(name="docs_required")
	private String docs_required;
	
	@Column(name="drive_date")
	private Date drive_date;
	
	@Column(name="created_date")
	private Date created_date;
	
	@Column(name="created_by")
	private String created_by;
	
	@Column(name="modified_date")
	private Date modified_date;
	
	@Column(name="modified_by")
	private String modified_by;
	
	
	
	//@JoinColumn(name="company_id",table="job_schema.criteria")
	//@OneToOne
    //@JoinColumn(name="company_id",insertable=false,updatable=false)
	
	@Column(name="criteria_id",table="job_schema.criteria",insertable=false,updatable=false)
	private String criteria_id;
	
	@Column(name="eligible_branches",table="job_schema.criteria")
	private String eligible_branches;
	
	@Column(name="year_of_passing",table="job_schema.criteria")
	private String year_of_passing;
	
	@Column(name="placed_students_allowed",table="job_schema.criteria")
	private String placed_students_allowed;
	
	@Column(name="percentage",table="job_schema.criteria")
	private String percentage;
	
	@Column(name="cgpa",table="job_schema.criteria")
	private String cgpa;
	
	@Column(name="no_of_live_kts_allowed",table="job_schema.criteria")
	private String no_of_live_kts_allowed;
	
	@Column(name="no_of_dead_kts_allowed",table="job_schema.criteria")
	private String no_of_dead_kts_allowed;
	
	@Column(name="year_gap_allowed",table="job_schema.criteria")
	private String year_gap_allowed;
	
	@Column(name="ssc_percentage",table="job_schema.criteria")
	private String ssc_percentage;
	
	@Column(name="hsc_or_dip_percentage",table="job_schema.criteria")
	private String hsc_or_dip_percentage;
	
	@Column(name="last_date_to_apply",table="job_schema.criteria")
	private String last_date_to_apply;
	
	
	
	public String getCompany_id() {
		return company_id;
	}
	public void setCompany_id(String company_id) {
		this.company_id = company_id;
	}
	public String getJob_id() {
		return job_id;
	}
	public void setJob_id(String job_id) {
		this.job_id = job_id;
	}
	public String getEvent_id() {
		return event_id;
	}
	public void setEvent_id(String event_id) {
		this.event_id = event_id;
	}
	public String getJob_description() {
		return job_description;
	}
	public void setJob_description(String job_description) {
		this.job_description = job_description;
	}
	public String getJob_category() {
		return job_category;
	}
	public void setJob_category(String job_category) {
		this.job_category = job_category;
	}
	public String getCtc() {
		return ctc;
	}
	public void setCtc(String ctc) {
		this.ctc = ctc;
	}
	public String getSkills_required() {
		return skills_required;
	}
	public void setSkills_required(String skills_required) {
		this.skills_required = skills_required;
	}
	public String getDocs_required() {
		return docs_required;
	}
	public void setDocs_required(String docs_required) {
		this.docs_required = docs_required;
	}
	public Date getDrive_date() {
		return drive_date;
	}
	public void setDrive_date(Date drive_date) {
		this.drive_date = drive_date;
	}
	public Date getCreated_date() {
		return created_date;
	}
	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}
	public String getCreated_by() {
		return created_by;
	}
	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}
	public Date getModified_date() {
		return modified_date;
	}
	public void setModified_date(Date modified_date) {
		this.modified_date = modified_date;
	}
	public String getModified_by() {
		return modified_by;
	}
	public void setModified_by(String modified_by) {
		this.modified_by = modified_by;
	}
	public String getCriteria_id() {
		return criteria_id;
	}
	public void setCriteria_id(String criteria_id) {
		this.criteria_id = criteria_id;
	}
	public String getEligible_branches() {
		return eligible_branches;
	}
	public void setEligible_branches(String eligible_branches) {
		this.eligible_branches = eligible_branches;
	}
	public String getYear_of_passing() {
		return year_of_passing;
	}
	public void setYear_of_passing(String year_of_passing) {
		this.year_of_passing = year_of_passing;
	}
	public String getPlaced_students_allowed() {
		return placed_students_allowed;
	}
	public void setPlaced_students_allowed(String placed_students_allowed) {
		this.placed_students_allowed = placed_students_allowed;
	}
	public String getPercentage() {
		return percentage;
	}
	public void setPercentage(String percentage) {
		this.percentage = percentage;
	}
	public String getCgpa() {
		return cgpa;
	}
	public void setCgpa(String cgpa) {
		this.cgpa = cgpa;
	}
	public String getNo_of_live_kts_allowed() {
		return no_of_live_kts_allowed;
	}
	public void setNo_of_live_kts_allowed(String no_of_live_kts_allowed) {
		this.no_of_live_kts_allowed = no_of_live_kts_allowed;
	}
	public String getNo_of_dead_kts_allowed() {
		return no_of_dead_kts_allowed;
	}
	public void setNo_of_dead_kts_allowed(String no_of_dead_kts_allowed) {
		this.no_of_dead_kts_allowed = no_of_dead_kts_allowed;
	}
	public String getYear_gap_allowed() {
		return year_gap_allowed;
	}
	public void setYear_gap_allowed(String year_gap_allowed) {
		this.year_gap_allowed = year_gap_allowed;
	}
	public String getSsc_percentage() {
		return ssc_percentage;
	}
	public void setSsc_percentage(String ssc_percentage) {
		this.ssc_percentage = ssc_percentage;
	}
	public String getHsc_or_dip_percentage() {
		return hsc_or_dip_percentage;
	}
	public void setHsc_or_dip_percentage(String hsc_or_dip_percentage) {
		this.hsc_or_dip_percentage = hsc_or_dip_percentage;
	}
	public String getLast_date_to_apply() {
		return last_date_to_apply;
	}
	public void setLast_date_to_apply(String last_date_to_apply) {
		this.last_date_to_apply = last_date_to_apply;
	}
	
	
}
