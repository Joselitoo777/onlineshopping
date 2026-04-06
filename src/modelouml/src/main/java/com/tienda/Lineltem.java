package com.tienda;

import java.util.*;


/**
 * Class Lineltem
 */
public class Lineltem {

  //
  // Fields
  //

  private int quantity;
  private double price;
  
  //
  // Constructors
  //
  public Lineltem () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of quantity
   * @param newVar the new value of quantity
   */
  public void setQuantity (int newVar) {
    quantity = newVar;
  }

  /**
   * Get the value of quantity
   * @return the value of quantity
   */
  public int getQuantity () {
    return quantity;
  }

  /**
   * Set the value of price
   * @param newVar the new value of price
   */
  public void setPrice (double newVar) {
    price = newVar;
  }

  /**
   * Get the value of price
   * @return the value of price
   */
  public double getPrice () {
    return price;
  }

  //
  // Other methods
  //

}
