package com.ghost.core.brainstorming.web;

import com.ghost.core.brainstorming.web.iterator.IdeaIterator;

public class IdeaComposite extends IdeaComponent {
	
	public IdeaComposite(){}
	
	public IdeaComposite(String ideaName){
		super(ideaName);
	}

	@Override
	public void add(IdeaComponent item) {
		this.getIdeaList().add(item);
	}

	@Override
	public void remove(IdeaComponent item) {
		this.getIdeaList().remove(item);
		
	}

	@Override
	public IdeaComponent getChild(int i) {
		return this.getIdeaList().get(i);
	}

	@Override
	public void operation() {
		throw new UnsupportedOperationException("Operation not implemented yet!");
	}

	@Override
	public IdeaIterator createIterator() {
		return new IdeaIterator(this.getIdeaList());
	}

}
