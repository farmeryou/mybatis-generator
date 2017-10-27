package my.dao;

import my.model.userInfo;

public interface userInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(userInfo record);

    int insertSelective(userInfo record);

    userInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(userInfo record);

    int updateByPrimaryKey(userInfo record);
}