package com.adse2509.classes;

import java.time.LocalDate;
import com.adse.sess01_java_util_apis.Person;

/**
 * Represents a Student object.
 *
 * @author pascal
 */
public class Student extends Person
{
    /**
     * The registration number of the student.
     */
    protected String regNo;

    /**
     * The course that the student is enrolled in.
     */
    protected String course;

    // Constructor(s)

    /**
     * Creates a default Student object.
     */
    public Student()
    {
        super();
    }

    /**
     * Creates a Student object with the specified details.
     *
     * @param regNo the registration number of the student
     * @param course the course that the student is enrolled in
     * @param names the name of the student
     * @param birthDate the birth date of the student
     * @param gender the gender of the student
     * @param nationality the nationality of the student
     */
    public Student(String regNo, String course, String names, LocalDate birthDate,
            char gender, String nationality)
    {
        super(names, birthDate, gender, nationality);
        this.regNo = regNo;
        this.course = course;
    }

    // Getters & Setters

    /**
     * Returns the registration number of the student.
     *
     * @return the registration number
     */
    public String getRegNo()
    {
        return regNo;
    }

    /**
     * Sets the registration number of the student.
     *
     * @param regNo the registration number to set
     */
    public void setRegNo(String regNo)
    {
        this.regNo = regNo;
    }

    /**
     * Returns the course that the student is enrolled in.
     *
     * @return the course
     */
    public String getCourse()
    {
        return course;
    }

    /**
     * Sets the course of the student.
     *
     * @param course the course to set
     */
    public void setCourse(String course)
    {
        this.course = course;
    }

    /**
     * Returns the role of this person.
     *
     * @return the person role
     */
    @Override
    public String getPersonRole()
    {
        return "Student";
    }

    /**
     * Returns a formatted string representation of the student's details.
     *
     * @return the student's details
     */
    @Override
    public String toString()
    {
        return String.format(
                """
                %s
                Registration No.         : %s
                Course                   : %s
                """,
                super.toString(),
                this.regNo,
                this.getCourse()
        );
    }
}