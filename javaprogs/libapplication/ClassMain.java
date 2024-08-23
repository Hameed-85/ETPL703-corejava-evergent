package com.evergent.corejava.libapplication;
class AgeNotSupportException extends Exception
{
	public AgeNotSupportException(String message) 
	{
		super(message);
	}
}
class BookNotFoundException extends Exception
{
  public BookNotFoundException(String mess) 
  {
	  super(mess);
  }	
}


class KidUsers implements LibraryUser{
	int age;
	String btype;
	public void registerAccount(int age) throws AgeNotSupportException
	{
		this.age=age;
		if(age<12) 
		{
			System.out.println("You have successfully registered under a Kids Account");
		}
		else 
		{
			throw new AgeNotSupportException("Sorry, Age must be less than 12 to register as a kid");
		}
		
	}
	public void requestBook(String btype) throws BookNotFoundException
	{
		this.btype=btype;
		if(btype.equals("Kids")) 
		{
			System.out.println("Book Issued successfully, please return the book within 10 days");
		}
		else 
		{
			throw new BookNotFoundException("Oops, you are allowed to take only kids books");
		}
		
	}


}
class AdultUser implements LibraryUser
{
	int age;
	String btype;
	public void registerAccount(int age) throws AgeNotSupportException
	{
		this.age=age;
		if(age > 12) 
		{
			System.out.println("You have successfully registered under an Adult Account");
		}
		else 
		{
			throw new AgeNotSupportException("Sorry, Age must be greater than 12 to register as an adult");
		}
	  	
	} 
	public void requestBook(String btype) throws BookNotFoundException	
	{
		this.btype=btype;
		if(btype.equals("Fiction")) 
		{
			System.out.println("Book Issued successfully, please return the book within 7 days");
		}
		else 
		{
			throw new BookNotFoundException("Oops, you are allowed to take only adult Fiction books");
		}
		
	}
}
public class ClassMain
{
	public static void main(String args[]) 
	{
		KidUsers ku=new KidUsers();
		AdultUser au=new AdultUser();
		try 
		{
			ku.registerAccount(10);
			ku.requestBook("Gents");
			
		}
		catch(Exception e) 
		{
		 System.out.println(e);	
		}
	    try 
	    {
	    	au.registerAccount(20);
	    	au.requestBook("kids");
	    }
	    catch(Exception e) 
	    {
	    	System.out.println(e);
	    }
	}
	}

