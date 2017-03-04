package com.ghost.core.writing.category.catagoryImpl;
import com.ghost.core.writing.category.*;
import com.ghost.core.components.*;
import java.util.List;

public class NovelImpl implements Novel
{
	public String title;
	//im thinking we should have an arraylist of epilogues and prologues...  but for now i will leave it as is.
	private Entry epilogue;
	private Entry prologue;
	//looks like we need a chapter class
	private List<Entry> chapters;
	
	public void createChapter(){}
	//public void cr
}
