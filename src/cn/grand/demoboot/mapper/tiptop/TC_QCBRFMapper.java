package cn.grand.demoboot.mapper.tiptop;

import cn.grand.demoboot.entity.tiptop.TC_QCBRF;
import org.apache.ibatis.annotations.Param;

public interface TC_QCBRFMapper {
    int deleteByPrimaryKey(@Param("tcQcbrf01") String tcQcbrf01, @Param("tcQcbrf02") String tcQcbrf02, @Param("tcQcbrf03") String tcQcbrf03);

    int insert(TC_QCBRF record);

    int insertSelective(TC_QCBRF record);

    TC_QCBRF selectByPrimaryKey(@Param("tcQcbrf01") String tcQcbrf01, @Param("tcQcbrf02") String tcQcbrf02, @Param("tcQcbrf03") String tcQcbrf03);

    int updateByPrimaryKeySelective(TC_QCBRF record);

    int updateByPrimaryKey(TC_QCBRF record);
}