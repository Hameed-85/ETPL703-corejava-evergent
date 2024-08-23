package com.evergent.corejava.libapplication;

public interface  LibraryUser{
	public void registerAccount(int age) throws AgeNotSupportException ;
	public void requestBook(String btype) throws BookNotFoundException;

}
