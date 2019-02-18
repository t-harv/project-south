package ghost.service;

import java.util.List;

import com.ghost.domainobject.ICharacterArch;
import com.ghost.domainobject.ICharacterProfile;

import ghost.hibernate.HiberDriver;


public class CharacterArchService {

	HiberDriver db = new HiberDriver("characterArch"); 

	public List<ICharacterProfile> getAllCharacterArchs() {
		return db.getAll();
	}

	public ICharacterProfile getCharacterArch(String characterArchName) {
		return db.get(characterArchName);
	}

	public ICharacterProfile addProfile(ICharacterProfile characterArch) {
		db.add(characterArch);
		return characterArch;
	}

	public ICharacterProfile updateProfile(ICharacterArch characterArch) {
		db.update(characterArch);
		return characterArch;
	}

	public void removeProfile(ICharacterArch characterArch) {
		db.remove(characterArch);
	}

}
