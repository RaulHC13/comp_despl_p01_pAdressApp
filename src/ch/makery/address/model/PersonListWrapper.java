/**
 * comp_despl_p01_pAdressApp_HerreriasCorralRaul - ch.makery.address.model - PersonListWrapper.java
 * 1 feb 2023 - 13:46:50
 * @author Raúl Herrerías Corral
 */
package ch.makery.address.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author b
 *
 */
@XmlRootElement(name = "persons")
public class PersonListWrapper {

	private List<Person> persons;

	@XmlElement(name = "person")
	public List<Person> getPersons() {
		return persons;
	}

	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}
}