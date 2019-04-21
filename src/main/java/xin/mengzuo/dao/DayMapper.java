package xin.mengzuo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import xin.mengzuo.pojo.Day;
import xin.mengzuo.pojo.DayExample;
@Mapper
public interface DayMapper {
    int countByExample(DayExample example);

    int deleteByExample(DayExample example);

    int deleteByPrimaryKey(Integer dayId);

    int insert(Day record);

    int insertSelective(Day record);

    List<Day> selectByExample(DayExample example);

    Day selectByPrimaryKey(Integer dayId);

    int updateByExampleSelective(@Param("record") Day record, @Param("example") DayExample example);

    int updateByExample(@Param("record") Day record, @Param("example") DayExample example);

    int updateByPrimaryKeySelective(Day record);

    int updateByPrimaryKey(Day record);
}