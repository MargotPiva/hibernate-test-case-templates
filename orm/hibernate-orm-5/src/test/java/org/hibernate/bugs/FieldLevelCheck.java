package org.hibernate.bugs;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.Check;

@Entity
public class FieldLevelCheck {

	@Id
	@GeneratedValue
	private Long id;

	@Basic
	@Check(constraints = "myValue <> null")
	private String myValue;

}
