package com.sanli.model;


public record MentorClass(String name, String lastName,int age , Gender gender) {


    public enum Gender {

        MALE, FEMALE;
    }

}
