package com.xworkz.inheritance2;

import com.xworkz.inheritance.objectmethods.Sock;
import com.xworkz.inheritance.objectmethods.enums.SockMaterial;
import com.xworkz.inheritance.objectmethods.enums.SockType;

public class SockStarter {

	public static void main(String[] args) {

				Sock sock = new Sock();

				sock.setMaterial(SockMaterial.COTTON);
				sock.setPrice(250.00);
				sock.setSize('L');
				sock.setType(SockType.MID_CALF);

				Sock sock1 = new Sock();
				sock1.setMaterial(SockMaterial.COTTON);
				sock1.setPrice(300.00);
				sock1.setSize('L');
				sock1.setType(SockType.ANKEL_FIT);

				if (sock == sock1) {
					System.out.println("both pointing to same memory");
				}
				boolean same = sock.equals(sock1);
				System.out.println(same);

			}
		
	}


