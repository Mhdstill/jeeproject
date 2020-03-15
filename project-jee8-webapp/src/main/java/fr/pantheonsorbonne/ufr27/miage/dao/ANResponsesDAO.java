package fr.pantheonsorbonne.ufr27.miage.dao;

import javax.annotation.ManagedBean;
import java.util.List;
import fr.pantheonsorbonne.ufr27.miage.model.jaxb.AvailabilityNeutralResponse;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import fr.pantheonsorbonne.ufr27.miage.exception.NoSuchUserException;
import fr.pantheonsorbonne.ufr27.miage.jpa.Customer;
import fr.pantheonsorbonne.ufr27.miage.model.jaxb.Address;
import fr.pantheonsorbonne.ufr27.miage.model.jaxb.ObjectFactory;
import fr.pantheonsorbonne.ufr27.miage.model.jaxb.User;

@ManagedBean
public class ANResponsesDAO {

	@Inject
	EntityManager em;

	public List<AvailabilityNeutralResponse> getAN(date dateDepart, IATA iata, date heureDepart) throws NoSuchUserException {

		List<AvailabilityNeutralResponse> customer = em.createQuery("select a from AvailabilityNeutralResponse a "
                + "where dateDepart = :dateDepart "
                + "and iata = :iata "
                + "and heureDepart = :heureDepart", AvailabilityNeutralResponse.class)
                .setParameter("dateDepart", dateDepart)
                .setParameter("iata", iata)
                .setParameter("heureDepart", heureDepart)
                .getResultList();
		if(customer==null) {
			throw new NoSuchUserException();
		}
		
	/*	User user = new ObjectFactory().createUser();
		user.setFname(customer.getLname());
		user.setLname(customer.getLname());
		user.setMembershipId(customer.getId()); */
		return customer;

	}


}
