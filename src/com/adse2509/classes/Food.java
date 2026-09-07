package com.adse2509.classes;

import java.util.Date;

/**
 * Represents a food item with a name and expiration date.
 *
 * @author pascal
 */
public class Food
{
    /**
     * The name of the food.
     */
    protected String name;

    /**
     * The expiration date of the food.
     */
    protected Date expirationDate;

    /**
     * Creates a Food object with default values.
     */
    public Food()
    {
        this.name = "";
        this.expirationDate = null;
    }

    /**
     * Creates a Food object with the specified name and expiration date.
     *
     * @param name the name of the food
     * @param expirationDate the expiration date of the food
     */
    public Food(String name, Date expirationDate)
    {
        this.name = name;
        this.expirationDate = expirationDate;
    }

    /**
     * Gets the name of the food.
     *
     * @return the name of the food
     */
    public String getName()
    {
        return name;
    }

    /**
     * Sets the name of the food.
     *
     * @param name the new name of the food
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * Gets the expiration date of the food.
     *
     * @return the expiration date of the food
     */
    public Date getExpirationDate()
    {
        return expirationDate;
    }

    /**
     * Sets the expiration date of the food.
     *
     * @param expirationDate the new expiration date of the food
     */
    public void setExpirationDate(Date expirationDate)
    {
        this.expirationDate = expirationDate;
    }

    /**
     * Returns a string representation of the food.
     *
     * @return the name and expiration date of the food
     */
    @Override
    public String toString()
    {
        return String.format(
                "Food{name='%s', expirationDate=%s}",
                name,
                expirationDate
        );
    }
}
