package ghost.service;

import java.util.List;

import com.ghost.writing.character.domainobject.CharacterArch;
import com.ghost.writing.character.domainobject.CharacterProfile;

import ghost.hibernate.HiberDriver;


public class CharacterArchService {

	HiberDriver db = new HiberDriver("characterArch"); 

	public List<CharacterProfile> getAllCharacterArchs() {
		return db.getAll();
	}

	public CharacterProfile getCharacterArch(String characterArchName) {
		return db.get(characterArchName);
	}

	public CharacterProfile addProfile(CharacterProfile characterArch) {
		db.add(characterArch);
		return characterArch;
	}

	public CharacterProfile updateProfile(CharacterArch characterArch) {
		db.update(characterArch);
		return characterArch;
	}

	public void removeProfile(CharacterArch characterArch) {
		db.remove(characterArch);
	}

}
