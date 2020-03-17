package cn.itcast.service.mapper;


import cn.itcast.service.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper{

    @Select("select * from tb_user where id=#{id}")
    User queryById(Long id);


}
