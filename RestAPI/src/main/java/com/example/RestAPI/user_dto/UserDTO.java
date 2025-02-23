package com.example.RestAPI.user_dto;

public class UserDTO {
    //define attributes
    private String firstName;
    private String lastName;

    //constructor
    public UserDTO(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //use getter and setter
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }
}
