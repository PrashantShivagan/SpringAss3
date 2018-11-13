package com.cg.mobileapplication.Dto;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="ScheduledSessions")
public class Session {
	@Id
	@Column(name="Id")
	@NotNull(message="id should not be empty")
 int sessionid;
	@Column(name="course")
 String sessioncourse;
	@Column(name="dur")
 int sessiondur;
	@Column(name="faculty")
 String sessionfaculty;
	@Column(name="mode")
 String sessionmode;
 public Session(int sessionid, String sessioncourse,int sessiondur,String sessionfaculty,String sessionmode){
	 super();
	 this.sessionid=sessionid;
	 this.sessioncourse=sessioncourse;
	 this.sessiondur=sessiondur;
	 this.sessionfaculty=sessionfaculty;
	 this.sessionmode=sessionmode;
	 
 }
 public Session(){
	 
 }
public int getSessionid() {
	return sessionid;
}
public void setSessionid(int sessionid) {
	this.sessionid = sessionid;
}
public String getSessioncourse() {
	return sessioncourse;
}
public void setSessioncourse(String sessioncourse) {
	this.sessioncourse = sessioncourse;
}
public int getSessiondur() {
	return sessiondur;
}
public void setSessiondur(int sessiondur) {
	this.sessiondur = sessiondur;
}
public String getSessionfaculty() {
	return sessionfaculty;
}
public void setSessionfaculty(String sessionfaculty) {
	this.sessionfaculty = sessionfaculty;
}
public String getSessionmode() {
	return sessionmode;
}
public void setSessionmode(String sessionmode) {
	this.sessionmode = sessionmode;
}
 
 
 
}
