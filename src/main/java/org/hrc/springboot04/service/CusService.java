package org.hrc.springboot04.service;

import org.hrc.springboot04.pojo.CusSms;

import java.util.List;

public interface CusService {

    void regist(CusSms cusSms);

    CusSms findById(Long id);

    List<CusSms> findByPage(Integer pageIndex, Integer pageSize);


}
