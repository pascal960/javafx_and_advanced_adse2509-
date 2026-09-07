
package com.adse.sess01_java_util_apis;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
//ADDED THE IMPORT BELOW SINCE THE ASSIGNEMENT REQUIRES USING AN ITERATOR
import java.util.Iterator;   

/**
 * JavaProgram to demonstrate the java.util.Hashset class and some of its methods
 * @author pascal
 */
public class HashSetDemo {

	
	public static void main(String[] args) {
		// Create a HashSet
		Set designClass = new HashSet();
		designClass.add("James");
		designClass.add("Mary");
		designClass.add("Paul");
		designClass.add("Oliver");
		designClass.add("Amanda");
		designClass.add("Sean");
		designClass.add("Erick");
		designClass.add("George");
		designClass.add("Ema");
		designClass.add("Salim");
		designClass.add("Nadia");
		designClass.add("Rachael");
		designClass.add("Roocy");
		designClass.add("Abigail");

		// Create a string array of art students
		String[] artStudents = {
		        "Roocy", "Julius", "Paul", "Amanda", "Kamau", "Leviathan", "Sean",
		        "Erick", "Joe", "Alejandro"
		};
		//Create  a set from the art class string array
		Set artClass = new HashSet<>(Arrays.asList(artStudents));
		
		// Create a set of all students in the campus
		Set allCampusStudents = new HashSet(designClass);
		// Add the students from the art class as well
		allCampusStudents.addAll(artClass);

	    // Display all the students in the design class
	    displayDesignStudents(designClass);

	    // Display all the students in the art class
	    displayArtStudents(artClass);
            
            //ADDED: CALL METHOD TO DISPLAY ALL STUDENTS ON CAMPUS
            displayAllStudents(allCampusStudents);

	}

	
	private static void displayDesignStudents(Set designClass)
	{
		// Display the design class details using a for...each loop: NB Works
		// in Java 7 & prior versions and current versions
		System.out.printf(
		        """

		        The design class has %d students and their names are:

		        """, designClass.size()
		);

		for (Object obj : designClass)
		    System.out.println(obj);
}
	private static void displayArtStudents(Set<String> artClass)
	{
		// Display the details of the art students using functional programming
        // NB: works in Java 8 and later versions
        System.out.printf("""
                          The art class has %d students and their names are:
                          
                          """,artClass.size());
        
        artClass.forEach((artStudent) ->
        {
            System.out.println(artStudent);
        }); 
	}
                
       //CREATED A METHOD TO DISPLAY ALL STUDENTS ON CAMPUS USING AN ITERATOR
private static void displayAllStudents(Set allCampusStudents)
{
    // Displays a heading before showing the student names
    System.out.println("All students in the campus:");

    // Creates an iterator to go through the students in the set
    Iterator students = allCampusStudents.iterator();

    // Continues while there are still students left in the set
    while(students.hasNext())
    {
        // Gets the next student and displays their name
        System.out.println(students.next());
    }
}


	}




// TODO: Assignment -> Write code for the 'displayAllStudents(allCampusStudents)'
// accepts a set of all the student names in the campus and displays them
// using an 'iterator'.