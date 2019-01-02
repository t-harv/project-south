package ghost.hibernate;

import java.util.List;

import com.ghost.writing.character.domainobject.CharacterProfile;

public class HiberDriver {
	private String mapping;
	
	public String getMapping() {
		return mapping;
	}

	public void setMapping(String mapping) {
		this.mapping = mapping;
	}

	public HiberDriver(String mapping) {
		this.mapping = mapping;
	}
	
	public void remove(CharacterProfile object) {
		
	}
	
	public void add(CharacterProfile object) {
		
	}
	
	public void update(CharacterProfile object) {
		
	}
	
	public CharacterProfile get(String name) {
		return null;
		
	}
	
	public List<CharacterProfile> getAll() {
		return null;
		
	}

}
