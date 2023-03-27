package com.testPaper;

public class Department3 
{

	private int deptId;
	private String deptName;
	private int deptNo;
	
	
	
	public Department3(int deptId, String deptName, int deptNo) 
	{		
		this.deptId = deptId;
		this.deptName = deptName;
		this.deptNo = deptNo;
	}



	public int getDeptId() {
		return deptId;
	}



	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}



	public String getDeptName() {
		return deptName;
	}



	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}



	public int getDeptNo() {
		return deptNo;
	}



	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}



	
	public String toString() 
	{
		return "deptId=" + deptId + ", deptName=" + deptName + ", deptNo=" + deptNo ;
	}
	
	
	
	
	
	
}
