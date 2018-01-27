package com.ghost.writing.character;

/**
 * 
 * @author toyan
 * 
 * Going to use this class as a helper to learn complex hibernate funtions.
 * 
 * 1.  Complex Key out of ID.  The key will reside in the character table (will not be embedded (seperate table))
 * 2.  Embedded table - I need to use composition to merge another object into this character object.  This will allow me to use hibernate to create a sub table out of the second object.
 * 		Example would be if i added address object to this character object.  There will be a character table for the character object and an address table for the address object.
 *
 */
public class Character {
	private long id;
	private String firstName;
	private String lastName;
	
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setId(long id) {
		this.id = id;
	}
}
