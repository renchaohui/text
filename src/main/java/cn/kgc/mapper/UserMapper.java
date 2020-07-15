package cn.kgc.mapper;

import cn.kgc.entity.User;

import java.util.List;

/**
 * @author 任朝辉
 * @date 2020/1/10 8:58
 */
public interface UserMapper {

    public List<User> selectAllUsers();
    public User selectUserById(Integer id);
    public Integer insertOneUser(User user);
    public Integer updateOneUser(User user);
    public Integer deleteUserById(Integer id);

}

