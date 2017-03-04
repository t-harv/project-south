package com.ghost.core.components;
import java.util.Date;
//java.util.Date date= new java.util.Date();
//System.out.println(new Timestamp(date.getTime()));
public class Entry
{
	Date create, update;
	String text;
	
	public Entry(){
		create = new Date();
	}
}
