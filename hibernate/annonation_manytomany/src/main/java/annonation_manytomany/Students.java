package annonation_manytomany;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import javassist.expr.Cast;

@Entity
public class Students {
private int id;
private String student_name;
private Set<Courses> courses = new HashSet<Courses>();
@Id
@GeneratedValue
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getStudent_name() {
	return student_name;
}
public void setStudent_name(String student_name) {
	this.student_name = student_name;
}
@ManyToMany(cascade=CascadeType.ALL)
@JoinTable(name="t_courses_students",joinColumns={@JoinColumn(name="student_name")}
,inverseJoinColumns={@JoinColumn(name="course_id")})
//joincolumns引用的是我方的外键，inversejoincolimns引用的是对方外键
public Set<Courses> getCourses() {
	return courses;
}
public void setCourses(Set<Courses> courses) {
	this.courses = courses;
}

}
