package com.evergent.corejava.collections2.task3;

import java.util.Scanner;

public class PG_Member {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		PGinterface pg = new PGImp();
		for (;;) {
			System.out.println("1.admember 2.searchbyser 3.GetAllMembers 4.exit");
			System.out.println("Enter Your Choice ");
			int n = sc.nextInt();
			switch (n) {
			case 1:
				System.out.println("Enter the serial number :");
				PG p = new PG();
				int sr = sc.nextInt();
				p.setSerialnum(sr);
				System.out.println("Enter member name:");
				String nam = sc.next();
				p.setName(nam);
				System.out.println("Enter your adrress:");
				String add = sc.next();
				p.setAdress(add);
				System.out.println("Enter room num:");
				int rm = sc.nextInt();
				p.setRoomnum(rm);
				System.out.println("Enter sharing like 2 sharing or 3 sharing 4 sharing:");
				int sh = sc.nextInt();
				p.setSharing(sh);
				System.out.println("Enter your phone num:");
				int pn = sc.nextInt();
				p.setPhonenum(pn);
				System.out.println("Enter amount");
				int am = sc.nextInt();
				p.setAmount(am);
				pg.admember(p);

				break;

			case 2:
				System.out.println("Enter serial number of member");
				int srl = sc.nextInt();
				pg.searchbyser(srl);

				break;

			case 3:
				System.out.println("Users are");
				pg.getAllMembers();
				break;

			case 4:
				System.exit(0);

			}
		}

	}

}
