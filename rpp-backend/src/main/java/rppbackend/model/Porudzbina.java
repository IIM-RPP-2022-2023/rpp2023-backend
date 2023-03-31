package rppbackend.model;

import java.io.Serializable;
import java.lang.Boolean;
import java.lang.Integer;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;


/**
 * Entity implementation class for Entity: Porudzbina
 *
 */
@Entity
@Table(name = "Porudzbina", schema = "public")
@NamedQuery(name="Porudzbina.findAll", query="SELECT p FROM Porudzbina p")
public class Porudzbina implements Serializable {

	   
	@Id
	@SequenceGenerator(name="PORUDZBINA_ID_GENERATOR", sequenceName="PORUDZBINA_SEQ", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PORUDZBINA_ID_GENERATOR")
	private Integer id;
	/*
	* @Temporal je potrebno samo za verzije jave pre 1.8 (Java 8)
	*/  

	//@Temporal(TemporalType.DATE)
	private Date datum;
	
	//@Temporal(TemporalType.DATE)
	private Date isporuceno;

	private BigDecimal iznos;
	
	private Boolean placeno;
	
	//bi-directional many-to-one association to Dobavljac
	@ManyToOne
	@JoinColumn(name="dobavljac")
	private Dobavljac dobavljac;
	
	private static final long serialVersionUID = 1L;
	
	
	//bi-directional many-to-one association to StavkaPorudzbine
	@OneToMany(mappedBy="porudzbina", cascade = {CascadeType.ALL}) 
	@JsonIgnore
	private List<StavkaPorudzbine> stavkaPorudzbine;

	public Porudzbina() {
		super();
	}   
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public Date getDatum() {
		return this.datum;
	}

	public void setDatum(Date datum) {
		this.datum = datum;
	}   
	public Date getIsporuceno() {
		return this.isporuceno;
	}

	public void setIsporuceno(Date isporuceno) {
		this.isporuceno = isporuceno;
	}   
	public BigDecimal getIznos() {
		return this.iznos;
	}

	public void setIznos(BigDecimal iznos) {
		this.iznos = iznos;
	}   
	public Boolean getPlaceno() {
		return this.placeno;
	}

	public void setPlaceno(Boolean placeno) {
		this.placeno = placeno;
	}   
	public Dobavljac getDobavljac() {
		return this.dobavljac;
	}

	public void setDobavljac(Dobavljac dobavljac) {
		this.dobavljac = dobavljac;
	}
   
}