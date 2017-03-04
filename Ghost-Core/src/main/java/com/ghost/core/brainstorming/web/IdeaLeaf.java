package com.ghost.core.brainstorming.web;

import com.ghost.core.brainstorming.web.iterator.IdeaIterator;

public class IdeaLeaf extends IdeaComponent {
	
	public IdeaLeaf(){}
	
	public IdeaLeaf(String ideaName){
		this.setIdeaName(ideaName);
	}

	public void add(IdeaComponent item) {
		throw new UnsupportedOperationException("Child Node, add functionality not supported");
	}

	public void remove(IdeaComponent item) {
		throw new UnsupportedOperationException("Child Node, remove functionality not supported");
	}

	public IdeaComponent getChild(int i) {
		throw new UnsupportedOperationException("Child Node, getChild functionality not supported");
	}

	public void operation() {
		System.out.println("Not sure what the operation is yet!");
	}

	@Override
	public IdeaIterator createIterator() {
		return new IdeaIterator(this.getIdeaList());
	}

}
