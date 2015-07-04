package com.ishowly.jarvis.dao;

import com.ishowly.jarvis.model.Person;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * Created by zhangdongjie on 15-7-4.
 */
@Repository
public interface PersonDao extends BaseDao<Person> {

    public static final String SELECT_KEYS = " id, name, age, sex, address, family_id, role_id ";
    public static final String INSERT_KEYS = " name, age, sex, address, family_id, role_id ";
    public static final String INSERT_VALUES = " #{name}, #{age}, #{sex}, #{address},#{family_id}, #{role_id} ";
    public static final String TABLE_NAME = "person_tb";

    @Insert("insert into (" + TABLE_NAME + ") (" + INSERT_KEYS + ") values (" + INSERT_VALUES + ") ")
    public int insert(Person entity);

    @Select(" select " + SELECT_KEYS + " from (" + TABLE_NAME + ") where id=#{id} ")
    public Person getPersonById(@Param("id") long id);

}
