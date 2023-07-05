package org.hibernate.bugs;

import java.util.List;

import org.hibernate.annotations.Check;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
@Check(constraints = "myValue <> null")
public class EntityLevelCheck {

	@Id
	@GeneratedValue
	private Long id;

	@Basic
	private String myValue;

}
