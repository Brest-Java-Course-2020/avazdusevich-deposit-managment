package com.epam.brest.courses.dao;

import com.epam.brest.courses.model.Deposit;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class DepositJdbcDaoImpl implements DepositDao {


    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public DepositJdbcDaoImpl(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
    }

    @Override
    public List<Deposit> getDeposits() {
        List<Deposit> deposits = namedParameterJdbcTemplate
                .query("SELECT d.depositId, d.depositName FROM deposit d ORDER BY d.depositName", new DepositRowMapper());
        return deposits;
    }

    @Override
    public Deposit getDepartmentById(Integer depositId) {
        return null;
    }

    @Override
    public Deposit addDepartment(Deposit deposit) {
        return null;
    }

    @Override
    public void updateDepartment(Deposit deposit) {

    }

    @Override
    public void deleteDepartment(Integer depositId) {

    }

    private class DepositRowMapper implements RowMapper<Deposit> {
        @Override
        public Deposit mapRow(ResultSet resultSet, int i) throws SQLException {
            Deposit deposit = new Deposit();
            deposit.setDepositId(resultSet.getInt("DEPOSIT_ID"));
            deposit.setDepositName(resultSet.getString("DEPOSIT_NAME"));
            return deposit;
        }
    }
}
