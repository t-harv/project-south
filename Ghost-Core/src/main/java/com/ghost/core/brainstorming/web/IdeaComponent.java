package com.ghost.core.brainstorming.web;

import java.util.ArrayList;
import java.util.List;

import com.ghost.core.brainstorming.web.iterator.IdeaIterator;

/*
 * what is a composite?  The composite is the idea
 * what is a leaf?  The leaf is an idea broken down to it's lowest point!
 */
public abstract class IdeaComponent{
	private String ideaName;
	private String description;
	
	//Any ideas related to the main idea of this gets stored in the ideaList!
	private List<IdeaComponent> ideaList;

	public IdeaComponent(){
		ideaName = "Blank";
		ideaList = new ArrayList<IdeaComponent>();
	}
	public IdeaComponent(String ideaName){
		this.ideaName = ideaName;
		ideaList = new ArrayList<IdeaComponent>();
	}
	
	public IdeaComponent(String ideaName, String description){
		this.ideaName = ideaName;
		this.description = description;
		ideaList = new ArrayList<IdeaComponent>();
		
	}
	public abstract void add(IdeaComponent item);
	public abstract void remove(IdeaComponent item);
	public abstract IdeaComponent getChild(int i);
	public abstract void operation();
	public String getIdeaName() {
		return ideaName;
	}
	public void setIdeaName(String ideaName) {
		this.ideaName = ideaName;
	}
	public List<IdeaComponent> getIdeaList() {
		return ideaList;
	}
	public void setIdeaList(List<IdeaComponent> ideaList) {
		this.ideaList = ideaList;
	}
	public abstract IdeaIterator createIterator();
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
