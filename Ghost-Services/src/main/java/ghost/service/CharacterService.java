package ghost.service;

import java.util.List;

import com.ghost.domainobject.ICharacter;
import com.ghost.domainobject.impl.CharacterImpl;

import ghost.middleware.GreatDivider;

public class CharacterService {
	
	GreatDivider gd;
	
	public CharacterService() {
		gd = new GreatDivider();
	}

	public List<ICharacter> getAllCharacters() {
		// TODO Auto-generated method stub
		gd.getCharacters();
		return null;
	}

	public ICharacter getCharacter(long id) {
		System.out.println(id);
		gd.getCharacter(id);
		return null;
	}

	public ICharacter addCharacter(ICharacter character) {
		// TODO Auto-generated method stub
//		System.out.println("Character ID: " + ((CharacterImpl)character).getCharacterId());
//		System.out.println("Character Record ID: " + ((CharacterImpl)character).getRecordId());
//		System.out.println("Character First Name: " + ((CharacterImpl)character).getFirstName());
//		System.out.println("Character Last Name: " + ((CharacterImpl)character).getLastName());
		
		gd.addCharacter(character);
		
		
		return character;
	}

	public ICharacter updateCharacter(ICharacter character) {
		// TODO Auto-generated method stub
		gd.updateCharacter(1, character);
		return character;
	}

	public ICharacter removeCharacter(long id) {
		// TODO Auto-generated method stub
		System.out.println("Remove ID: " + id);
		gd.removeCharacter(id);
		return null;
	}

}
