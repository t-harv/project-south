package com.ghost.writing.character.domainobject.impl;

import org.junit.Before;
import org.junit.Test;

import com.ghost.writing.character.domainobject.CharacterProfile;

public class CharacterProfileImplTest {
	private CharacterProfile Joyce;
	private CharacterProfile Langston;
	

	@Before
	public void setupJoyce() {
		CharacterProfile joyce = new CharacterProfileImpl();
		
		((CharacterProfileImpl)joyce).setBirthOrder(3);
//		((CharacterProfileImpl)joyce).setChildren(children); //Langston & Toyce
//		((CharacterProfileImpl)joyce).setCurrentAddress(currentAddress); //1
		
		//character arch
//		((CharacterProfileImpl)joyce).setCa(ca);
		
		
	}
	

}
