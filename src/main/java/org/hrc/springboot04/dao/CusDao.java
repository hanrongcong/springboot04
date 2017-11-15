package org.hrc.springboot04.dao;

import org.hrc.springboot04.pojo.CusSms;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CusDao extends JpaRepository<CusSms,Long> {

}
