package com.pcsgpl.entity;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table (name = "employee_user_profile")
public class EmployeeUserProfile {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private int userId;
	
	@Column(name="employee_id")
	private long employeeId;
	
	@Column(name = "user_name")
	private String userName;
	
	@Column(name = "user_password")
	private String userPassword;
	
	@Column(name = "user_call_name")
	private String userCallName;
	
	@Column(name = "user_role_id")
	private int userRoleID;
	
	
	
	
	public EmployeeUserProfile() {
    	super();
	}
	
	public EmployeeUserProfile(long employeeId, int userRoleID,int userId, String userName, String userPassword, String userCallName) {
		
		this.userId = userId;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userCallName = userCallName;
		this.userRoleID = userRoleID;
		this.employeeId = employeeId;
		
	}
	
	
	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserCallName() {
		return userCallName;
	}
	public void setUserCallName(String userCallName) {
		this.userCallName = userCallName;
	}

	public int getUserRoleID() {
		return userRoleID;
	}

	public void setUserRoleID(int userRoleID) {
		this.userRoleID = userRoleID;
	}
	
	
	
//	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "user_role_id")
//	private UserRole userRoleId;
	
//	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, optional = false)
//	@JoinColumn(name = "userRoleID", referencedColumnName = "user_role_id")
//	private UserRole userrole;
	

}
