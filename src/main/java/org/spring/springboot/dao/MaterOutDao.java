package org.spring.springboot.dao;

import org.apache.ibatis.annotations.Param;
import org.spring.springboot.domain.Mater;

import java.util.List;

public interface MaterOutDao {

    List<Mater> findAllMater();

    Mater findMaterByMid(@Param("mid") int mid);

    Mater findMaterByMname(@Param("mname") String mname);

    Long saveMater(Mater mater);

    Long updateMater(Mater mater);

    Long updateMaterNum(@Param("mid") int mid,@Param("mnum") int num);

    Long updateMaterSub(@Param("mid") int mid);

    Long deleteMater(int mid);

}
