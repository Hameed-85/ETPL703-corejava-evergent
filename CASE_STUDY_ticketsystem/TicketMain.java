package com.evergent.corejava.casestudy.ticketsystem;

import java.util.Scanner;

public class TicketMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("=========================");
		System.out.println(" Welcome to TicketSystem ");
		
		SupportTicketSystem sts=new SupportTicketSystem();
		
		
		for(;;) 
		{
			System.out.println("Enter the following for choice:");
			System.out.println("1.Adding the Ticket");
			System.out.println("2.Process the ticket and to remove it");
			System.out.println("3.Display the last added ticket");
			System.out.println("4.Display all the ticket");
			System.out.println("5.Exit");
			System.out.println("=========================");
			int n=sc.nextInt();
			switch(n) 
			{
			case 1 :
				TicketBean tb=new TicketBean();
				System.out.println("Enter the id ");
				int id=sc.nextInt();
				tb.setEmpId(id);
				System.out.println("Enter the name");
				String nam=sc.next();
				tb.setName(nam);
				System.out.println("Enter no peoples which is Rs.200 per head");
				double p=sc.nextDouble();
				tb.setPrice(p*200);
				sts.addTicket(tb);
				break;
			case 2:
				System.out.println("Ticket which is last added is");
				sts.processTicket();
				System.out.println("This ticket is now Processed and removed");
				break;
			case 3:
				 sts.peekNextTicket();
				 break;
			case 4:
				 sts.displayQueue();
				 break;
			case 5:
				System.exit(0);
				break;
				
				
				
			}
			
		}
		

	}

}
