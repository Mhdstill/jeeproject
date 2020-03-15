package fr.pantheonsorbonne.ufr27.miage.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.datatype.XMLGregorianCalendar;

@Entity
public class AvailabilityNeutralResponse {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;    
    String identifiantCompanie; 
    String identifiantVol;
    int nbPlacesRestantes;    
    String origine;   
    String destination;
	XMLGregorianCalendar dateDepart;
    XMLGregorianCalendar dateArrivee;
    XMLGregorianCalendar heureDepart;
    XMLGregorianCalendar heureArrivee;
    String dureeVol;

    /* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AvailabilityNeutralResponse [id=" + id + ", identifiantCompanie=" + identifiantCompanie
				+ ", identifiantVol=" + identifiantVol + ", nbPlacesRestantes=" + nbPlacesRestantes + ", origine="
				+ origine + ", destination=" + destination + ", dateDepart=" + dateDepart + ", dateArrivee="
				+ dateArrivee + ", heureDepart=" + heureDepart + ", heureArrivee=" + heureArrivee + ", dureeVol="
				+ dureeVol + "]";
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the identifiantCompanie
	 */
	public String getIdentifiantCompanie() {
		return identifiantCompanie;
	}
	/**
	 * @param identifiantCompanie the identifiantCompanie to set
	 */
	public void setIdentifiantCompanie(String identifiantCompanie) {
		this.identifiantCompanie = identifiantCompanie;
	}
	/**
	 * @return the identifiantVol
	 */
	public String getIdentifiantVol() {
		return identifiantVol;
	}
	/**
	 * @param identifiantVol the identifiantVol to set
	 */
	public void setIdentifiantVol(String identifiantVol) {
		this.identifiantVol = identifiantVol;
	}
	/**
	 * @return the nbPlacesRestantes
	 */
	public int getNbPlacesRestantes() {
		return nbPlacesRestantes;
	}
	/**
	 * @param nbPlacesRestantes the nbPlacesRestantes to set
	 */
	public void setNbPlacesRestantes(int nbPlacesRestantes) {
		this.nbPlacesRestantes = nbPlacesRestantes;
	}
	/**
	 * @return the origine
	 */
	public String getOrigine() {
		return origine;
	}
	/**
	 * @param origine the origine to set
	 */
	public void setOrigine(String origine) {
		this.origine = origine;
	}
	/**
	 * @return the destination
	 */
	public String getDestination() {
		return destination;
	}
	/**
	 * @param destination the destination to set
	 */
	public void setDestination(String destination) {
		this.destination = destination;
	}
	/**
	 * @return the dateDepart
	 */
	public XMLGregorianCalendar getDateDepart() {
		return dateDepart;
	}
	/**
	 * @param dateDepart the dateDepart to set
	 */
	public void setDateDepart(XMLGregorianCalendar dateDepart) {
		this.dateDepart = dateDepart;
	}
	/**
	 * @return the dateArrivee
	 */
	public XMLGregorianCalendar getDateArrivee() {
		return dateArrivee;
	}
	/**
	 * @param dateArrivee the dateArrivee to set
	 */
	public void setDateArrivee(XMLGregorianCalendar dateArrivee) {
		this.dateArrivee = dateArrivee;
	}
	/**
	 * @return the heureDepart
	 */
	public XMLGregorianCalendar getHeureDepart() {
		return heureDepart;
	}
	/**
	 * @param heureDepart the heureDepart to set
	 */
	public void setHeureDepart(XMLGregorianCalendar heureDepart) {
		this.heureDepart = heureDepart;
	}
	/**
	 * @return the heureArrivee
	 */
	public XMLGregorianCalendar getHeureArrivee() {
		return heureArrivee;
	}
	/**
	 * @param heureArrivee the heureArrivee to set
	 */
	public void setHeureArrivee(XMLGregorianCalendar heureArrivee) {
		this.heureArrivee = heureArrivee;
	}
	/**
	 * @return the dureeVol
	 */
	public String getDureeVol() {
		return dureeVol;
	}
	/**
	 * @param dureeVol the dureeVol to set
	 */
	public void setDureeVol(String dureeVol) {
		this.dureeVol = dureeVol;
	}

}
