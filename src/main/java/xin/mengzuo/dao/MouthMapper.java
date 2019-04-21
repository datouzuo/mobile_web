package xin.mengzuo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import xin.mengzuo.pojo.Mouth;
import xin.mengzuo.pojo.MouthExample;
@Mapper
public interface MouthMapper {
    int countByExample(MouthExample example);

    int deleteByExample(MouthExample example);

    int deleteByPrimaryKey(Integer mouthId);

    int insert(Mouth record);

    int insertSelective(Mouth record);

    List<Mouth> selectByExample(MouthExample example);

    Mouth selectByPrimaryKey(Integer mouthId);

    int updateByExampleSelective(@Param("record") Mouth record, @Param("example") MouthExample example);

    int updateByExample(@Param("record") Mouth record, @Param("example") MouthExample example);

    int updateByPrimaryKeySelective(Mouth record);

    int updateByPrimaryKey(Mouth record);
}