package com.s;

public class UniversityAdminstration {
	private CollegeAdminstration college;
	private Long universityId;
	private String universityAddress;
	public UniversityAdminstration(CollegeAdminstration college, Long universityId, String universityAddress) {
		this.college = college;
		this.universityId = universityId;
		this.universityAddress = universityAddress;
	}
	
}
