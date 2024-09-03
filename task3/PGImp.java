package com.evergent.corejava.collections2.task3;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class PGImp implements PGinterface {
	Set<PG> pgset=null;
	public PGImp() 
	{
		pgset=new LinkedHashSet<PG>();
	}
	public  int admember(PG p) 
	{
		pgset.add(p);
		return p.getSerialnum();
	}
	public void searchbyser(int sernum) 
	{
		boolean b=false;
		if(pgset.size()>0 && pgset!=null ) 
		{
			for(PG p:pgset) 
			{
				if(p.getSerialnum()==sernum) 
				{
					System.out.println("Name:"+p.getName()+" Adress:"+p.getAdress()+" Phonenum:"+p.getPhonenum()+" Roomnum:"+p.getRoomnum()+" Sharing"+p.getSharing()+" AmountPaid"+p.getAmount());
					b=true;
					break;
				}
			}
		}
		if(!b) 
		{
			System.out.println("Member is not found");
		}
	}
	public void getAllMembers() 
	{
		if(pgset!=null && pgset.size()>0) 
		{
			for(PG pt:pgset) 
			{
				System.out.println("Name:"+pt.getName()+" Adress:"+pt.getAdress()+" Phonenum:"+pt.getPhonenum()+" Roomnum:"+pt.getRoomnum()+" Sharing"+pt.getSharing()+" AmountPaid"+pt.getAmount());
			}
		}
		else 
		{
			System.out.println("No members are there");
		}
	}


}
