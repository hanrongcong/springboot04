package org.hrc.springboot04.service;

import org.hrc.springboot04.dao.CusDao;
import org.hrc.springboot04.pojo.CusSms;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CusServiceImpl implements CusService{

    @Autowired
    private CusDao cusDao;

    @Override
    public void regist(CusSms cusSms) {
        cusDao.save(cusSms);
    }

    @Override
    public CusSms findById(Long id) {
        return cusDao.findOne(id);
    }

    @Override
    public List<CusSms> findByPage(Integer pageIndex, Integer pageSize) {

        Pageable pageable=new PageRequest(pageIndex,pageSize);
        Page<CusSms> page= cusDao.findAll(pageable);
        int totalPages=page.getTotalPages();
        System.out.println(totalPages);
        List<CusSms> list=page.getContent();
        return list;
    }
}
