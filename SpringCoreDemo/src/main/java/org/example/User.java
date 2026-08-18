package org.example;

/*
 * Simple Java class used to demonstrate a normal POJO.
 *
 * POJO = Plain Old Java Object.
 *
 * This class is NOT being used as a Spring Bean here.
 *
 * It simply has:
 * - Fields
 * - Constructor
 * - Getters
 * - Setters
 *
 * Important:
 * An object is not automatically a Spring Bean.
 * A Spring Bean is an object whose lifecycle is managed by
 * the Spring IoC Container.
 */
public class User {

    // Instance variables / fields
    private String name;
    private int age;


    /*
     * Parameterized constructor.
     *
     * Used to initialize the User object when it is created.
     */
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }


    // Getter for age
    public int getAge() {
        return age;
    }


    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }


    // Getter for name
    public String getName() {
        return name;
    }


    // Setter for name
    public void setName(String name) {
        this.name = name;
    }
}