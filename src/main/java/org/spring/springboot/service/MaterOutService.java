package org.spring.springboot.service;

import org.apache.ibatis.annotations.Param;
import org.spring.springboot.domain.Mater;

import java.util.List;

public interface MaterOutService {

    List<Mater> findAllMater();

    Mater findMaterByMid(int mid);

    Mater findMaterByMname(@Param("mname") String mname);

    Long saveMater(Mater mater);

    Long updateMater(Mater mater);

    Long updateMaterNum(int mid,int num);

    Long updateMaterSub(int mid);

    Long deleteMater(int mid);

}
