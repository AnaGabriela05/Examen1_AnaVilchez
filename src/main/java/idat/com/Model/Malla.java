package idat.com.Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;


@Table(name="malla")
@Entity

public class Malla implements Serializable {
	
	private static final long serialVersionUID = -59150720975100356L;
	
	@Id
	@Column(name = "id_malla")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer IdMalla;
	
	
	private String Año;
	
	@OneToOne
	@JoinColumn(name = "id_universidad", nullable = false, unique = true,
	foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key(id_universidad) references universidad (id_universidad)"))
	private Universidad universidad;
	
	@OneToMany(mappedBy = "malla")
	private List<Curso> curso=new ArrayList<Curso>();
	
	public Malla() {
			super();
	}
	public Malla(Integer idMalla, String año) {
		IdMalla = idMalla;
		Año = año;
	}
	public Integer getIdMalla() {
		return IdMalla;
	}
	public void setIdMalla(Integer idMalla) {
		IdMalla = idMalla;
	}
	public String getAño() {
		return Año;
	}
	public void setAño(String año) {
		Año = año;
	}
	
	

}
