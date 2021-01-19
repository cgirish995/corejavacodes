package com.xworkz.solutions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class EmailTester {

	public static void main(String[] args) {
		// Create a collection , add 20 email ids and find the duplicates

		Collection<String> emailIds = new ArrayList<String>();

		// String girish = "cgirish995@gmail.com";
		// String suma = "suma@gmail.com";
		// String vignesh="vignesh@gmail.com";
		// String tribhuvan = "tribuvan@gmail.com";

		// emailIds.add(girish);
		// emailIds.add(suma);
		// emailIds.add(vignesh);
		// emailIds.add(tribhuvan);
		// emailIds.add(suma);
		// emailIds.add(suma);
		// emailIds.add(suma);
		// emailIds.add(vignesh);
		// emailIds.add(vignesh);
		// emailIds.add(vignesh);

		emailIds.add("cgirish995@gmail.com");
		emailIds.add("suma@gmail.com");
		emailIds.add("xworkz@gmail.com");
		emailIds.add("vignesh@gmail.com");
		emailIds.add("tribhuvan@gmail.com");
		emailIds.add("deepak@gmail.com");
		emailIds.add("veeresh@gmail.com");
		emailIds.add("rishebh@gmail.com");
		emailIds.add("cgirish995@gmail.com");
		emailIds.add("shilpa@gmail.com");
		emailIds.add("xworkz@gmail.com");
		emailIds.add("sudhindar@gmail.com");
		emailIds.add("karthik@gmail.com");
		emailIds.add("dhanush@gmail.com");
		emailIds.add("cgirish995@gmail.com");
		emailIds.add("chethan@gmail.com");
		emailIds.add("anothny@gmail.com");
		emailIds.add("daniel@gmail.com");
		emailIds.add("rohith@gmail.com");
		emailIds.add("raghu@gmail.com");

		System.out.println("The size of the List are :" + emailIds.size());

		int count = 0;

		Iterator<String> email = emailIds.iterator();
		while (email.hasNext()) {
			String ids = email.next();
			if (ids.equals("cgirish995@gmail.com")) {
				System.out.println("The Number of email is :" + count++);
				System.out.println(ids);

			}

		}

	}

}
