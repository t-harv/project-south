package com.ghost.core.components;
import java.util.List;
//soooo, a chapter basically is a bunch of entries that form a chapter.  this class should have:
//1.  a way to create a new entry to add to chapter
//2.  a way to update an entry
//3.  a way to remove an entry
//4.  reorder entries.  this is going to be tough.  i would want a UI to handle this but... the UI has to 
//    communicate with this class to reorder sooo we need some type of business logic.  need to think about this
public class Chapter
{
	private String title;
	private List<Entry> entries;
}
