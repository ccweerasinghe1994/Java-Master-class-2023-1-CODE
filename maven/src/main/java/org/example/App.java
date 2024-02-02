package org.example;

import com.github.javafaker.Faker;

public class App 
{
    public static void main( String[] args )
    {
        Faker faker = new Faker();
        System.out.println(faker.name().fullName());
        System.out.println(faker.address().fullAddress());
    }
}
