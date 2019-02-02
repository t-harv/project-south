package ghost.service;

import java.util.List;

import com.ghost.writing.character.domainobject.ICharacter;
import com.ghost.writing.character.domainobject.impl.CharacterImpl;

public class CharacterService {

	public List<ICharacter> getAllCharacters() {
		// TODO Auto-generated method stub
		return null;
	}

	public ICharacter getCharacter(long id) {
		System.out.println(id);
		return null;
	}

	public ICharacter addCharacter(ICharacter character) {
		// TODO Auto-generated method stub
		System.out.println("Character ID: " + ((CharacterImpl)character).getCharacterId());
		System.out.println("Character Record ID: " + ((CharacterImpl)character).getRecordId());
		System.out.println("Character First Name: " + ((CharacterImpl)character).getFirstName());
		System.out.println("Character Last Name: " + ((CharacterImpl)character).getLastName());
		
		return character;
	}

	public ICharacter updateCharacter(ICharacter character) {
		// TODO Auto-generated method stub
		return character;
	}

	public ICharacter removeCharacter(long id) {
		// TODO Auto-generated method stub
		System.out.println("Remove ID: " + id);
		return null;
	}

}
