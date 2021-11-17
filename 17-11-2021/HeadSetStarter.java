package com.xworkz.inheritance2;

import com.xworkz.inheritance.objectmethods.HeadSet;
import com.xworkz.inheritance.objectmethods.enums.HeadSetTypes;

public class HeadSetStarter {

	public static void main(String[] args) {
		
		HeadSet headSet = new HeadSet();
		headSet.setBrand("Apple");
		headSet.setBattery(56.50f);
		headSet.setType(HeadSetTypes.WIRLESS);
		headSet.setWarranty(2);

		HeadSet headSet1 = new HeadSet();
		headSet1.setBrand("Apple");
		headSet1.setBattery(56.50f);
		headSet1.setType(HeadSetTypes.WIRE);
		headSet1.setWarranty(2);

		if (headSet == headSet1) {
			System.out.println("pointing to same location");
		}

		boolean same = headSet.equals(headSet1);
		System.out.println(same);
	}
	}


