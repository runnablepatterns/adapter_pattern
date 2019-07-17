package com.runnablepatterns.adapterpattern;

/**
 * 
 * @author Carlos Marin
 * Runnable Patterns (runnablepatterns.com)
 * 
 * ITaxable interface used to make taxable classes
 *
 */
public interface ITaxable {
	
	/**
	 * Process the specific tax for the amount received as a parameter
	 * @param amount The amount to be taxed
	 * @return The tax value for the amount
	 */
	public String processTax(double amount);
	
	/**
	 * Gets the current tax value applied.
	 * @return The tax applied in the operation
	 */
	public String getTaxValue();

}
