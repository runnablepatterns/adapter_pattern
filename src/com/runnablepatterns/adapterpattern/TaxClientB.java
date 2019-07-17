package com.runnablepatterns.adapterpattern;

/**
 * 
 * @author Carlos Marin
 * Runnable Patterns (runnablepatterns.com)
 * 
 * TaxClientB class created by a third party company
 *
 */
public class TaxClientB {
	
	/**
	 * Variable used to store current tax value
	 */
	private double currentTax;
	
	/**
	 * Constructor to initialize tax value
	 */
	public TaxClientB() {
		this.setTax(0.0);
	}

	/**
	 * Get the current tax value
	 * @return The current tax value
	 */
	public double getTax() {
		return currentTax;
	}

	/**
	 * Set the current tax value
	 * @param currentTax Tax value to be set
	 */
	public void setTax(double currentTax) {
		this.currentTax = currentTax;
	}

	/**
	 * Calculates the tax value for the amount received as a parameter
	 * @param amount The amount to be taxed
	 * @return The taxed amount
	 */
	public String calculateTax(double amount) {
		return (this.getTax() * amount) + "";
	}
}
