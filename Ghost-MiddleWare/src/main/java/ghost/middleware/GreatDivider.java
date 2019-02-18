package ghost.middleware;

import java.util.List;

import com.ghost.domainobject.ICharacter;

/**
 * 
 * @author root
 * 
 * Purpose of this class is to simulate a 3 zone architecture.  Presentation Layer transmitted to Data Layer.  This middle layer simulates data transmitting through
 * WS Queues or whatever separates the presentation layer from the data layer.
 *
 *This class needs a direct reference to the HiberDriver because, the presentation layer will call a specific method here that correspond/ simulate a call from the 
 *presentation layer to the data layer.
 *
 *So... unfortunately, what this means, is the webservice logic will hardcode a call to this class which in turn will call a method from the data layer to CRUD data
 *
 *More information.  From PostMan, you should call invoke the correct webservice methods, which will come here and simply display data.  After you get that far,
 *we add more functionality, from simply displaying data to calling the data layer and creating/persisting, updating, retrieving and deleting the data.
 */
public class GreatDivider {
	
	
	
	public List<ICharacter> getCharacters() {
		return null;
//		return characterService.getAllCharacters();
	}

//	public ICharacter getCharacter(@PathParam("characterId") long id) {
		public ICharacter getCharacter(long id) {
			return null;
//		return characterService.getCharacter(id);
	}


	public ICharacter addCharacter(ICharacter character){
		return character;
//		return characterService.addCharacter(character);
	}


	public ICharacter updateCharacter(long id, ICharacter character){
		return character;
//		character.setId(id);
//		return characterService.updateCharacter(character);
	}

	public ICharacter removeCharacter(long id){
		return null;
//		return characterService.removeCharacter(id);
	}
	

}
