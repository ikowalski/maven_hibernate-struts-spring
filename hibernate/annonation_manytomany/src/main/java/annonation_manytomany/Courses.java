package annonation_manytomany;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Courses {
private int id;
private String course_name;
private Set<Students> students = new HashSet<Students>();
@Id
@GeneratedValue
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCourse_name() {
	return course_name;
}
@ManyToMany(mappedBy="courses")
public Set<Students> getStudents() {
	return students;
}
public void setStudents(Set<Students> students) {
	this.students = students;
}
public void setCourse_name(String course_name) {
	this.course_name = course_name;
}
 

}
