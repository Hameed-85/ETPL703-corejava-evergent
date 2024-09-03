package com.evergent.corejava.casestudy.ticketsystem;

import java.util.ArrayDeque;

public class SupportTicketSystem {
	ArrayDeque<TicketBean> ad = new ArrayDeque<TicketBean>();

	public void addTicket(TicketBean tb) {
		ad.add(tb);
		System.out.println("Ticket is Booked");

	}

	public void processTicket() {
		System.out.println(ad.poll());
	}

	public void peekNextTicket() {
		System.out.println(ad.peekLast());
	}

	public void displayQueue() {
		if (ad.size() > 0) {
			for (TicketBean t : ad) {
				System.out.println(t.getEmpId() + " " + t.getName() + " " + t.getPrice());
			}
			System.out.println(ad);
		} else {
			System.out.println("No tickets are there");
		}
	}

}
