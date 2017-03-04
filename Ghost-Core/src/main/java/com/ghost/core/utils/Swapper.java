package com.ghost.core.utils;
import java.util.List;
import java.util.*;
import com.ghost.core.components.Entry;

public class Swapper<T>
{
	public List<T> moveEntry(List<T> entries, int currentPosition, int newPosition){
		T x = entries.get(currentPosition);
		entries.remove(currentPosition);
		entries.add(newPosition,x);
		return entries;
	}
	
	public List<T> deleteEntry(List<T> entries, int position){
		entries.remove(position);
		return entries;
	}
	
	public List<T> addEntry(List<T> entries, int position, T entry){
		entries.add(position, entry);
		return entries;
	}
}
