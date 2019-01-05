package ghost.hibernate;

import java.util.List;

import com.ghost.writing.character.domainobject.ICharacterProfile;

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
	
	public void remove(ICharacterProfile object) {
		
	}
	
	public void add(ICharacterProfile object) {
		
	}
	
	public void update(ICharacterProfile object) {
		
	}
	
	public ICharacterProfile get(String name) {
		return null;
		
	}
	
	public List<ICharacterProfile> getAll() {
		return null;
		
	}

}
