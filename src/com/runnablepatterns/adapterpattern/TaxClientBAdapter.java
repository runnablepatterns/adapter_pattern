package com.runnablepatterns.adapterpattern;

/**
 * 
 * @author Carlos Marin
 * Runnable Patterns (runnablepatterns.com)
 * 
 * TaxClientB Adapter class used to transform third party class TaxClientB into a ITaxable object
 *
 */
public class TaxClientBAdapter implements ITaxable {

	/**
	 * Defines a composition variable to store 3rd party class
	 */
	private TaxClientB taxClientB;
	
	/**
	 * Overloaded constructor to force clients to provide instance of 3rd party class
	 * @param _taxClientB The 3rd party class used to perform the requests
	 */
	public TaxClientBAdapter(TaxClientB _taxClientB) {
		this.taxClientB = _taxClientB;
	}
	
	@Override
	public String processTax(double amount) {
		// return the tax for the amount using 3rd party class
		return this.taxClientB.calculateTax(amount);
	}

	@Override
	public String getTaxValue() {
		// return the tax value from the third party class
		return (this.taxClientB.getTax() * 100) + "%";
	}

}
