package my.dao;

import my.model.user_info;

public interface user_infoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(user_info record);

    int insertSelective(user_info record);

    user_info selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(user_info record);

    int updateByPrimaryKey(user_info record);
}