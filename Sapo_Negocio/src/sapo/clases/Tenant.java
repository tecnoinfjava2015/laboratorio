package sapo.clases;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Tenant implements Serializable {
	@Id @GeneratedValue 
	private int id;	

}
