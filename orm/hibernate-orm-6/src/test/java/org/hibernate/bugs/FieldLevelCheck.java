package org.hibernate.bugs;

import org.hibernate.annotations.Check;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class FieldLevelCheck {

	@Id
	@GeneratedValue
	private Long id;

	@Basic
	@Check(constraints = "myValue <> null")
	private String myValue;

}
