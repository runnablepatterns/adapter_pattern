package com.runnablepatterns.adapterpattern;

/**
 * 
 * @author Carlos Marin
 * Runnable Patterns (runnablepatterns.com)
 * 
 * TaxA class used to create tax objects of type A
 *
 */
public class TaxA implements ITaxable {

	/**
	 * Current tax to be applied.
	 */
	private double taxValue;
	
	/**
	 * Overloaded constructor used to set the current tax value
	 * @param _taxValue The tax value to use
	 */
	public TaxA(double _taxValue) {
		this.taxValue = _taxValue;
	}
	
	@Override
	public String processTax(double amount) {
		// get the tax for the amount
		return (amount * this.taxValue) + "";
	}

	@Override
	public String getTaxValue() {
		// get the tax applied
		return (this.taxValue * 100) + "%";
	}

}
