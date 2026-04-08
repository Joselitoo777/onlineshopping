package com.tienda;




/**
 * Class Customer
 */
public class Customer {

  //
  // Fields
  //

  private String id;
  private Address address;
  private Phone phone;
  private String email;
  private Account nuevo_atributo;
  private Account nuevo_atributo_1;
  private Account nuevo_atributo_2;
  
  //
  // Constructors
  //
  public Customer () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of id
   * @param newVar the new value of id
   */
  public void setId (String newVar) {
    id = newVar;
  }

  /**
   * Get the value of id
   * @return the value of id
   */
  public String getId () {
    return id;
  }

  /**
   * Set the value of address
   * @param newVar the new value of address
   */
  public void setAddress (Address newVar) {
    address = newVar;
  }

  /**
   * Get the value of address
   * @return the value of address
   */
  public Address getAddress () {
    return address;
  }

  /**
   * Set the value of phone
   * @param newVar the new value of phone
   */
  public void setPhone (Phone newVar) {
    phone = newVar;
  }

  /**
   * Get the value of phone
   * @return the value of phone
   */
  public Phone getPhone () {
    return phone;
  }

  /**
   * Set the value of email
   * @param newVar the new value of email
   */
  public void setEmail (String newVar) {
    email = newVar;
  }

  /**
   * Get the value of email
   * @return the value of email
   */
  public String getEmail () {
    return email;
  }

  /**
   * Set the value of nuevo_atributo
   * @param newVar the new value of nuevo_atributo
   */
  public void setNuevo_atributo (Account newVar) {
    nuevo_atributo = newVar;
  }

  /**
   * Get the value of nuevo_atributo
   * @return the value of nuevo_atributo
   */
  public Account getNuevo_atributo () {
    return nuevo_atributo;
  }

  /**
   * Set the value of nuevo_atributo_1
   * @param newVar the new value of nuevo_atributo_1
   */
  public void setNuevo_atributo_1 (Account newVar) {
    nuevo_atributo_1 = newVar;
  }

  /**
   * Get the value of nuevo_atributo_1
   * @return the value of nuevo_atributo_1
   */
  public Account getNuevo_atributo_1 () {
    return nuevo_atributo_1;
  }

  /**
   * Set the value of nuevo_atributo_2
   * @param newVar the new value of nuevo_atributo_2
   */
  public void setNuevo_atributo_2 (Account newVar) {
    nuevo_atributo_2 = newVar;
  }

  /**
   * Get the value of nuevo_atributo_2
   * @return the value of nuevo_atributo_2
   */
  public Account getNuevo_atributo_2 () {
    return nuevo_atributo_2;
  }

  //
  // Other methods
  //

}
