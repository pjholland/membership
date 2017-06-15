package com.membership;

import com.github.javafaker.Faker;

public class Member {


    private String firstName;
    private String lastName;
    private String day;
    private String month;
    private String year;
    private String postCode;
    private String email;
    private String confirmEmail;
    private String password;
    private String confirmPassword;

    public Member() {

    }

    public static Member buildTestMember() {

        Faker faker = new Faker();
        String LastName = faker.name().lastName();
        Member member = new Member();
        member.firstName = faker.name().firstName();
        member.lastName = LastName;
        member.day = "01";
        member.month = "01;";
        member.year = "1979";
        member.postCode = "M60 0AG";
        member.password = "M3mbership";
        member.confirmPassword = "M3mbership";
        member.email = member.firstName.toLowerCase() + "." + LastName.toLowerCase() + "@mailinator.com";
        member.confirmEmail = member.firstName.toLowerCase() + "." + LastName.toLowerCase() + "@mailinator.com";
        System.out.println(member.email);
        return member;

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

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getConfirmEmail() {
        return confirmEmail;
    }

    public void setConfirmEmail(String confirmEmail) {
        this.confirmEmail = confirmEmail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }


}
