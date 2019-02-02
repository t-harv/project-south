package ghost.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ghost.writing.character.domainobject.ICharacter;

import ghost.service.CharacterService;

@Path("/characters")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class CharacterResource {

	CharacterService characterService = new CharacterService();

	@GET
	public List<ICharacter> getCharacters() {
		return characterService.getAllCharacters();
	}

	@GET
	@Path("/{characterId}")
	public ICharacter getCharacter(@PathParam("characterId") long id) {	
		return characterService.getCharacter(id);
	}


	@POST
	public ICharacter addCharacter(ICharacter character){
		return characterService.addCharacter(character);
	}


	@PUT
	@Path("/{characterId}")
	public ICharacter updateCharacter(@PathParam("characterId") long id, ICharacter character){
//		character.setId(id);
		return characterService.updateCharacter(character);
	}

	@DELETE
	@Path("/{characterId}")
	public ICharacter removeCharacter(@PathParam("characterId") long id){
		return characterService.removeCharacter(id);
	}

}
