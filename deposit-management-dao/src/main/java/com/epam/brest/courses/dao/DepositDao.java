package com.epam.brest.courses.dao;

import com.epam.brest.courses.model.Deposit;

import java.util.List;

public interface DepositDao {

    List<Deposit> getDeposits();

    Deposit getDepartmentById(Integer depositId);

    Deposit addDepartment(Deposit deposit);

    void updateDepartment(Deposit deposit);

    void deleteDepartment(Integer depositId);
}
