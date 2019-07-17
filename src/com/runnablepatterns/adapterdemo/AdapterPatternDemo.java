package com.runnablepatterns.adapterdemo;

import java.util.ArrayList;

import com.runnablepatterns.adapterpattern.ITaxable;
import com.runnablepatterns.adapterpattern.TaxA;

/**
 * 
 * @author Carlos Marin
 * Runnable Patterns (runnablepatterns.com)
 * 
 * Demo class for the Adapter Pattern
 *
 */
public class AdapterPatternDemo {

	public static void main(String[] args) {
		// create taxes
		ITaxable taxA = new TaxA(0.13);
		ITaxable taxAA = new TaxA(0.10);

		// create array to store taxes
		ArrayList<ITaxable> taxList = new ArrayList();
		
		// add taxes to list
		taxList.add(taxA);
		taxList.add(taxAA);
		
		// define the amount to be taxed
		double amountToTax = 3500.0;
		
		System.out.println(String.format("Printing tax amounts for: %s \n", amountToTax) );
		
		// iterate in the taxes
		for(int index = 0; index < taxList.size(); index++) {
			// get tax details
			System.out.println(taxList.get(index).processTax(amountToTax));
			System.out.println(taxList.get(index).getTaxValue());
			System.out.println("***************************");
		}
	}

}
