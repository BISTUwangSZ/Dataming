package cn.com.dataming.predictionapi.mapper;

import cn.com.dataming.entity.module.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface LoginMapper {
    UserEntity checkUserInfo(UserEntity user);
}
