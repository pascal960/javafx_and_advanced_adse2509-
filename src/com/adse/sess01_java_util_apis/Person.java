package com.adse.sess01_java_util_apis;

import java.time.LocalDate;

/**
 * The abstract class {@code Person} represents a person with common
 * attributes or properties such as names, birthdate, gender(binary) and
 * nationality. It provides a basic structure for its subclasses and includes
 * getters and setters for these attributes.
 * The class also defines an abstract method {@code getPersonRole} that must
 * be implemented by any concrete class.
 * 
 * <p>This class can be extended by other classes that represent more specific
 * types of persons or people (e.g. Student, Employee) by providing additional
 * attributes or behaviours.
 *
 * @author pascal
 */
public abstract class Person
{
    //Fields
    /**
     * the person's full name(S)
     */
    protected String names;
    /**
     * the person birth date represented as a [@code localDate]
     */
    protected LocalDate birthDate;
    /**
     * the person gender represented as a character ,, [F-female, M-male]
     */
   protected char gender;
    /**
     * the person nationality
     */
  protected  String nationality;
   public Person() {
    
  
    
    }
  
  
  /**
 * Parameterised constructor for the {@code Person} class.
 *
 * @param names the person's full name
 * @param birthDate the person's date of birth as a {@code LocalDate}
 * @param gender the person's binary gender represented as a character
 * @param nationality the person's nationality
 */
public Person(String names, LocalDate birthDate, char gender, String nationality)
{
    this.names = names;
    this.birthDate = birthDate;
    this.gender = gender;
    this.nationality = nationality;
}

/** 
 * 
 * @return the names
 */

    public String getNames() {
        return names;
    }
    /** 
    * 
    * @return names the names to set
    */


    public void setNames(String names) {
        this.names = names;
    }
    /** 
    * 
    * @return the birthdate
    */


    public LocalDate getBirthdate() {
        return birthDate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthDate = birthdate;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }



/**
 * Returns the role of the person (e.g. "Student", "Customer", "Employee", "Patient").
 * Each subclass must provide its own role.
 *
 * @return the role of the person as a String.
 */
public abstract String getPersonRole();


/**
 * Returns a formatted string representation of the details.
 * @return person's details
 * 
 */
@Override
public String toString() {
    return String.format(
        """
        Role       : %s
        Name(s)    : %s
        Birthdate  : %s
        Gender     : %s
        Nationality: %s
        """,
        getPersonRole(),
        getNames(),
        this.birthDate,
        (getGender() == 'M' || getGender() == 'm') ? "Male" : "Female",
        this.nationality
    );
}

            
  
}