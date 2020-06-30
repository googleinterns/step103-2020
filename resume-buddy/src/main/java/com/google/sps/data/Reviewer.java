package com.google.sps.data;

public final class Reviewer {

  private final String firstName;
  private final String lastName;
  private final String email;
  private final String school;
  private final String fieldOfWork;
  private final String company;
  private final String highestLevelOfEducation;
  private final String yearsOfWorkExperience;

  public Reviewer(String fname, String lname, String email) {
    this.firstName = fname;
    this.lastName = lname;
    this.email = email;
    this.school = "";
    this.company = "";
    this.fieldOfWork = "";
    this.highestLevelOfEducation = "";
    this.yearsOfWorkExperience = "";
  }

  public Reviewer(
      String firstName,
      String lastName,
      String email,
      String school,
      String company,
      String fieldOfWork,
      String highestLevelOfEducation,
      String yearsOfWorkExperience) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.school = school;
    this.company = company;
    this.fieldOfWork = fieldOfWork;
    this.highestLevelOfEducation = highestLevelOfEducation;
    this.yearsOfWorkExperience = yearsOfWorkExperience;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getEmail() {
    return email;
  }

  public String getSchool() {
    return school;
  }

  public String getFieldOfWork() {
    return fieldOfWork;
  }

  public String getCompany() {
    return company;
  }

  public String getYearsOfWorkExperience() {
    return yearsOfWorkExperience;
  }
}
