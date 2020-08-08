package org.spring.springboot.service;

import org.apache.ibatis.annotations.Param;
import org.spring.springboot.domain.Mater;

import java.util.List;

public interface MaterInService {

    List<Mater> findAllMater();

    Mater findMaterByMid(int mid);

    Long saveMater(Mater mater);

    Long updateMater(Mater mater);

    Long updateMaterNum(int num);

    Long deleteMater(int mid);

}
