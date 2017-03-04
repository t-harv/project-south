package com.ghost.core.brainstorming.web.iterator;

import java.util.Iterator;
import java.util.List;

import com.ghost.core.brainstorming.web.IdeaComponent;

/**
 * 
 * @author Nomagon
 * 
 * The Iterator!  This is my custom iterator for the Web component of GhostWriter.
 *
 */
public class IdeaIterator implements Iterator<IdeaComponent>{
	List<IdeaComponent> ideas;
	int position;

	public IdeaIterator(List<IdeaComponent> ideas){
		this.ideas = ideas;
		this.position = 0;
	}
	public boolean hasNext() {
		if(position < ideas.size()){
			return true;
		}else
			return false;
	}

	public IdeaComponent next() {
		int returnPos = 0;
		if(hasNext() == true){
			returnPos = position;
			position++;
			return this.ideas.get(returnPos);
		}
		return null;
	}
	
	public void remove(){
		this.ideas.remove(position - 1);
	}
}
