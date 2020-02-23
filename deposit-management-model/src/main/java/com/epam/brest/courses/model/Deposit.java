package com.epam.brest.courses.model;

public class Deposit {

    private Integer depositId;

    private String depositName;

    public Integer getDepositId() {
        return depositId;
    }

    public void setDepositId(Integer depositId) {
        this.depositId = depositId;
    }

    public String getDepositName() {
        return depositName;
    }

    public void setDepositName(String depositName) {
        this.depositName = depositName;
    }

    @Override
    public String toString() {
        return "Deposit{" +
                "depositId=" + depositId +
                ", depositName='" + depositName + '\'' +
                '}';
    }

}
