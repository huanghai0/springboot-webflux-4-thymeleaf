package org.spring.springboot.dao;

import org.apache.ibatis.annotations.Param;
import org.spring.springboot.domain.Mater;

import java.util.List;

public interface MaterInDao {

    List<Mater> findAllMater();

    Mater findMaterByMid(@Param("mid") int mid);

    Long saveMater(Mater mater);

    Long updateMater(Mater mater);

    Long updateMaterNum(int num);

    Long deleteMater(int mid);

}
