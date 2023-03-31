package rppbackend.model;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.math.BigDecimal;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: StavkaPorudzbine
 *
 */
@Entity
@Table(name = "stavka_porudzbine", schema = "public")
@NamedQuery(name="StavkaPorudzbine.findAll", query="SELECT s FROM StavkaPorudzbine s")
public class StavkaPorudzbine implements Serializable {

	   
	@Id
	@SequenceGenerator(name="STAVKA_PORUDZBINE_ID_GENERATOR", sequenceName="STAVKA_PORUDZBINE_SEQ", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="STAVKA_PORUDZBINE_ID_GENERATOR")
	private Integer id;
	private BigDecimal cena;
	
	@Column(name="jedinica_mere")
	private String jedinicaMere;
	
	@Column(name="redni_broj")
	private Integer redniBroj;
	
	private BigDecimal kolicina;
	
	@ManyToOne
	@JoinColumn(name="artikl")
	private Artikl artikl;
	
	@ManyToOne
	@JoinColumn(name="porudzbina")
	private Porudzbina porudzbina;
	
	private static final long serialVersionUID = 1L;

	public StavkaPorudzbine() {
		super();
	}   
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public BigDecimal getCena() {
		return this.cena;
	}

	public void setCena(BigDecimal cena) {
		this.cena = cena;
	}   
	public String getJedinicaMere() {
		return this.jedinicaMere;
	}

	public void setJedinicaMere(String jedinicaMere) {
		this.jedinicaMere = jedinicaMere;
	}   
	public Integer getRedniBroj() {
		return this.redniBroj;
	}

	public void setRedniBroj(Integer redniBroj) {
		this.redniBroj = redniBroj;
	}   
	public BigDecimal getKolicina() {
		return this.kolicina;
	}

	public void setKolicina(BigDecimal kolicina) {
		this.kolicina = kolicina;
	}   
	public Artikl getArtikl() {
		return this.artikl;
	}

	public void setArtikl(Artikl artikl) {
		this.artikl = artikl;
	}   
	public Porudzbina getPorudzbina() {
		return this.porudzbina;
	}

	public void setPorudzbina(Porudzbina porudzbina) {
		this.porudzbina = porudzbina;
	}
   
}
