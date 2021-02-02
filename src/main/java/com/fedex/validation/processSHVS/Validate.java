package com.fedex.validation.processSHVS;

import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component
public class Validate {
	
	private static boolean isValidated = false;
	
	@SuppressWarnings("resource")
	public static void validate() throws Exception {
		System.out.println();
		System.out.println();
		System.out.println();
		
		System.out.println("----------Baseline Validation Utility----------");
		
		System.out.println();

		System.out.println("For Validating INTL_EXP data - 1");
		System.out.println("For Validating DOM_EXP data - 2");
		System.out.println("For Validating DOM_GRD data - 3");
		System.out.println("For Validating INTL_GRD data - 4");
		System.out.println("Exit - 5");
		System.out.println();
		System.out.print("Enter your choice: ");

		Scanner sc = new Scanner(System.in);
		int shipmentType = sc.nextInt();
		if (shipmentType != 5) {
			if(shipmentType == 1 || shipmentType == 2 || shipmentType == 3 || shipmentType == 4)
			checkShipmentType(shipmentType);

			else{
				System.out.println();
				System.out.println("Please choose from the given choices");
				return;
			}
		} else {
			System.out.println();
			System.out.println("Program terminated..");
			System.exit(0);
		}
		return;
	}

	public static boolean checkShipmentType(int shipmentType) throws Exception {
		BaselineProcessor processObj = new BaselineProcessor();
		processObj.processSHVS(shipmentType);
		System.out.println();
		System.out.println("Process completed..");
		isValidated = true;
		return isValidated;
	}

}
