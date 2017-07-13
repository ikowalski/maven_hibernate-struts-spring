package annonation_onetomany;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="STUDENTS")
public class Students {
private int id;
private String name;
private Classes classes;

@ManyToOne(cascade=CascadeType.ALL)
@JoinColumn(name="class_id")
//JoinColumn是多方表中的外键，不能和@column共存
public Classes getClasses() {
	return classes;
}
public void setClasses(Classes classes) {
	this.classes = classes;
}
@Id
@GeneratedValue
public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

}
