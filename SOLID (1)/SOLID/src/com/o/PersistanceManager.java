package com.o;

public class PersistanceManager {
	ICollegeAdmPersistence icollegeAdmPersistence;
	    IStudentPersistance studentPersistence;
	    
	    public PersistanceManager(ICollegeAdmPersistence icollegeAdmPersistence,
	    		IStudentPersistance studentPersistence) {
	        this.icollegeAdmPersistence = icollegeAdmPersistence;
	        this.studentPersistence = studentPersistence;
	    }
}
