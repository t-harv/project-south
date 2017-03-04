package com.ghost.core.brainstorming.web.iterator;

import java.util.Iterator;
import java.util.Stack;

import com.ghost.core.brainstorming.web.IdeaComponent;

public class CompositeIterator implements Iterator<IdeaComponent>{
	Stack stack = new Stack();

	public CompositeIterator(Iterator iterator){
		stack.push(iterator);
	}
	public boolean hasNext() {
		if(stack.empty()){
			return false;
		}else {
			Iterator iterator = (Iterator) stack.peek();
			if(!iterator.hasNext()){
				stack.pop();
				return hasNext();
			} else {
				return true;
			}
		}
	}

	public IdeaComponent next() {
		if(hasNext()){
			Iterator<IdeaComponent> iterator = (Iterator<IdeaComponent>) stack.peek();
			IdeaComponent component = (IdeaComponent) iterator.next();
			if(component instanceof IdeaComponent){
				stack.push(component.createIterator());
			}
			return component;
		}else{
			return null;
		}
	}
	
	public void remove(){
		//might have to google what a stack iterator remove implementation is...
	}

}
