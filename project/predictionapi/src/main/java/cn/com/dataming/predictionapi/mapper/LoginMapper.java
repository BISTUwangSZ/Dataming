package cn.com.dataming.predictionapi.mapper;

import cn.com.dataming.entity.module.UserEntity;
import cn.com.dataming.predictionapi.util.DBHelper;
import cn.com.dataming.predictionapi.util.DS;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface LoginMapper {

    @DS(DBHelper.DB_TYPE_R)
    UserEntity checkUserInfo(UserEntity user);
}
