package com.stud.model;

public class StudentDTO {
	private Long studId;
	private String name;
	private String studyClass;
	private String dob;
	private String email;
	/**
	 * @return the studId
	 */
	public Long getStudId() {
		return studId;
	}
	/**
	 * @param studId the studId to set
	 */
	public void setStudId(Long studId) {
		this.studId = studId;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the studyClass
	 */
	public String getStudyClass() {
		return studyClass;
	}
	/**
	 * @param studyClass the studyClass to set
	 */
	public void setStudyClass(String studyClass) {
		this.studyClass = studyClass;
	}
	/**
	 * @return the dob
	 */
	public String getDob() {
		return dob;
	}
	/**
	 * @param dob the dob to set
	 */
	public void setDob(String dob) {
		this.dob = dob;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
}
