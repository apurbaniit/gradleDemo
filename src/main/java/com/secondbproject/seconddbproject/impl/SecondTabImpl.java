package com.secondbproject.seconddbproject.impl;

import com.secondbproject.seconddbproject.model.SecondTab;
import com.secondbproject.seconddbproject.repository.SecondTabInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Types;
import java.util.List;

/**
 * Created by abhi on 24/07/18.
 */

@Repository
public class SecondTabImpl implements SecondTabInterface{

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public void saveData(SecondTab secondTab) {

        String sql="insert into pune values" +
                "(?,?,?)";

        jdbcTemplate.update(sql,
                new Object[]{secondTab.getId(),secondTab.getName(),
                secondTab.getCity()});
    }

    @Override
    public List<SecondTab> getList() {
        String sql="select * from secondtab";

        List<SecondTab> list=jdbcTemplate.query(sql,
                new BeanPropertyRowMapper(SecondTab.class));

        return list;
    }

    @Override
    public SecondTab getSingleRecord(Integer id) {

        String sql="select * from secondtab where id=?";

        SecondTab st=jdbcTemplate.
                queryForObject(sql,new Object[]{id},
                        new BeanPropertyRowMapper<>(SecondTab.class));
        return st;
    }

    @Override
    public void updateData(Integer id, String name) {

        String sql="update pune set name=? where id=?";
        jdbcTemplate.update(sql,
                new Object[]{name,id},
                new int[]{Types.VARCHAR,
                        Types.INTEGER});
    }

    @Override
    public void deleteData(Integer id) {

        String sql="delete from pune where id=?";

        jdbcTemplate.update(sql,new Object[]{id},
                new int[]{Types.INTEGER});

    }


}
