package com.dao.impl;

import com.dao.UserDao;
import com.pojo.User;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class UserDaoImpl implements UserDao {
    public SqlSession sqlSession;

    public UserDaoImpl(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }


    public User queryUserById(String id) {
        return sqlSession.selectOne("UserDao.queryUserById",id);
    }

    public List<User> queryUserAll() {
        return sqlSession.selectList("UserDao.queryUserAll");
    }

    public void insertUser(User user) {
        sqlSession.insert("UserDao.insertUser",user);
    }

    public void updateUser(User user) {
        sqlSession.update("UserDao.updateUser",user);
    }

    public void deleteUser(String id) {
        sqlSession.delete("UserDao.deleteUser",id);
    }
}