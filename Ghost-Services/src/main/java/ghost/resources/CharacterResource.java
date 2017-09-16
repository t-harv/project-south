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

import com.ghost.writing.character.Character;
import ghost.service.CharacterService;

@Path("/characters")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class CharacterResource {

	CharacterService characterService = new CharacterService();

	@GET
	public List<Character> getCharacters() {
		return characterService.getAllCharacters();
	}

	@GET
	@Path("/{characterId}")
	public Character getCharacter(@PathParam("characterId") long id) {	
		return characterService.getCharacter(id);
	}


	@POST
	public Character addCharacter(Character character){
		return characterService.addCharacter(character);
	}


	@PUT
	@Path("/{characterId}")
	public Character updateCharacter(@PathParam("characterId") long id, Character character){
		character.setId(id);
		return characterService.updateCharacter(character);
	}

	@DELETE
	@Path("/{characterId}")
	public Character removeCharacter(@PathParam("characterId") long id){
		return characterService.removeCharacter(id);
	}

}
