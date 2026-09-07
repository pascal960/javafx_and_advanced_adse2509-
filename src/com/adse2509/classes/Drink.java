package com.adse2509.classes;

/**
 * Represents a drink with a name and volume.
 * 
 * The Drink class is used as a base class for different types
 * of drinks and demonstrates the use of constructors,
 * getters, setters and method overriding.
 *
 * @author pascal
 */
public class Drink
{
    /**
     * The name of the drink.
     */
    protected String name;

    /**
     * The volume of the drink.
     */
    protected float volume;

    /**
     * Creates a Drink object with default values.
     */
    public Drink()
    {
        this.name = "";
        this.volume = 0.0f;
    }

    /**
     * Creates a Drink object with the specified name and volume.
     *
     * @param name the name of the drink
     * @param volume the volume of the drink
     */
    public Drink(String name, float volume)
    {
        this.name = name;
        this.volume = volume;
    }

    /**
     * Gets the name of the drink.
     *
     * @return the name of the drink
     */
    public String getName()
    {
        return name;
    }

    /**
     * Sets the name of the drink.
     *
     * @param name the new name of the drink
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * Gets the volume of the drink.
     *
     * @return the volume of the drink
     */
    public float getVolume()
    {
        return volume;
    }

    /**
     * Sets the volume of the drink.
     *
     * @param volume the new volume of the drink
     */
    public void setVolume(float volume)
    {
        this.volume = volume;
    }

   /**
     * Returns a formatted string containing the drink's details.
     *
     * <p>The returned string includes the drink's name and volume,
     * formatted for display.</p>
     *
     * @return a formatted string representation of this {@code Drink}
     */
       @Override
    public String toString()
    {
        return String.format(
            """
            Drink Details
            _______________________________________
            Name: %s
            Volume in Litres: %.2f
            _______________________________________
            """, this.getName(), this.getVolume()
        );
    }

}


