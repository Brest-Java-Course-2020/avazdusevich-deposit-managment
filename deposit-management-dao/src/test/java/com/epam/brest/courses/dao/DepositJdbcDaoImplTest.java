package com.epam.brest.courses.dao;


import com.epam.brest.courses.model.Deposit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = {"classpath*:test-db.xml", "classpath*:test-dao.xml"})
public class DepositJdbcDaoImplTest {

    @Autowired
    private DepositDao depositDao;

    @Test
    public void getDeposits() {

        List<Deposit> deposits = depositDao.getDeposits();
        assertNotNull(deposits);
    }

    @Test
    public void getDepositById() {
    }

    @Test
    public void addDeposit() {
    }

    @Test
    public void updateDeposit() {
    }

    @Test
    public void deleteDeposit() {
    }


}
