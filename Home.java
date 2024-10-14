package JPAPractice_1.group.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="\"user\"")
public class Home {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String Fname;
private String Lname;
private String Pname;
private String add1;
public String tostring() {
	return Fname+" :"+id+" :"+Lname+" :"+Pname+" :"+add1+" :";
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFname() {
	return Fname;
}
public void setFname(String fname) {
	Fname = fname;
}
public String getLname() {
	return Lname;
}
public void setLname(String lname) {
	Lname = lname;
}
public String getPname() {
	return Pname;
}
public void setPname(String pname) {
	Pname = pname;
}
public String getAdd1() {
	return add1;
}
public void setAdd1(String add1) {
	this.add1 = add1;
}


}
