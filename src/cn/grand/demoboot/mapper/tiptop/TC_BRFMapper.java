package cn.grand.demoboot.mapper.tiptop;

import cn.grand.demoboot.entity.tiptop.TC_BRF;
import org.apache.ibatis.annotations.Param;

public interface TC_BRFMapper {
    int deleteByPrimaryKey(@Param("tcBrf01") String tcBrf01, @Param("tcBrf02") String tcBrf02, @Param("tcBrf03") String tcBrf03);

    int insert(TC_BRF record);

    int insertSelective(TC_BRF record);

    TC_BRF selectByPrimaryKey(@Param("tcBrf01") String tcBrf01, @Param("tcBrf02") String tcBrf02, @Param("tcBrf03") String tcBrf03);

    int updateByPrimaryKeySelective(TC_BRF record);

    int updateByPrimaryKey(TC_BRF record);
}