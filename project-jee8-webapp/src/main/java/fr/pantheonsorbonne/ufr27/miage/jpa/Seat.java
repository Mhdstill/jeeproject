package fr.pantheonsorbonne.ufr27.miage.jpa;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlElement;

import org.eclipse.persistence.oxm.annotations.XmlInverseReference;


@Entity
public class Seat {
	
	@Id
	@ManyToOne
	@XmlElement(name = "idVol")
	@XmlInverseReference(mappedBy="nbPlacesRestantes")
	protected Flight flight; 
	
	@XmlElement(name = "prix")
	private Double prix;
	
	@Id
	@XmlElement(name = "classe")
	protected String classe; 
	
	@XmlElement(name = "nbSieges")
	protected int nbSieges;

	/**
	 * @return the flight
	 */
	public Flight getFlight() {
		return flight;
	}

	/**
	 * @param flight the flight to set
	 */
	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	/**
	 * @return the prix
	 */
	public Double getPrix() {
		return prix;
	}

	/**
	 * @param prix the prix to set
	 */
	public void setPrix(Double prix) {
		this.prix = prix;
	}

	/**
	 * @return the classe
	 */
	public String getClasse() {
		return classe;
	}

	/**
	 * @param classe the classe to set
	 */
	public void setClasse(String classe) {
		this.classe = classe;
	}

	/**
	 * @return the nbSieges
	 */
	public int getNbSieges() {
		return nbSieges;
	}

	/**
	 * @param nbSieges the nbSieges to set
	 */
	public void setNbSieges(int nbSieges) {
		this.nbSieges = nbSieges;
	}
	
}
