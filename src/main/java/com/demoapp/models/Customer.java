package com.demoapp.models;

import com.demoapp.validation.CourseCode;

import javax.validation.constraints.*;

public class Customer {
    private String firstName;
    @NotNull(message = "is required")
    @Size(min = 1, message = "is required")
    private String lastName;
    @NotNull(message = "is required")
    @Min(value = 0, message = "less than min required")//must be greater or equals zero
    @Max(value = 10, message = "greater than max required")//must be less or equals 10
    private Integer freePasses;
    @CourseCode
    private String courseCode;
    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "code must be 5 chars/digits")
    private String postalCode;

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public Integer getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(Integer freePasses) {
        this.freePasses = freePasses;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
