package com.jdpaley;

import java.io.Serializable;
import javax.persistence.*;


@Entity
@Table(name = "user")
public class User implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
		@GeneratedValue
		@Column(name="id")
		private Long id;
	
	

}
