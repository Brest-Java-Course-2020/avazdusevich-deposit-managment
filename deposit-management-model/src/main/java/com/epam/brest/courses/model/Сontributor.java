package com.epam.brest.courses.model;

import java.util.List;

public class Сontributor {

    private Integer contributorId;

    private String firstname;

    private String lastname;

    private Double salary;

    private List<Integer> depositsIds;

    public Integer getContributorId() {
        return contributorId;
    }

    public void setContributorId(Integer contributorId) {
        this.contributorId = contributorId;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public List<Integer> getDepositsIds() {
        return depositsIds;
    }

    public void setDepositsIds(List<Integer> depositsIds) {
        this.depositsIds = depositsIds;
    }

    @Override
    public String toString() {
        return "Contributor{" +
                "contributorId=" + contributorId +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", number of deposits" + depositsIds.size() +
                '}';

    }
}
