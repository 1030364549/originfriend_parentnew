package com.originfriend.base.dao;

import com.originfriend.base.pojo.Label;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface LabelDao extends JpaRepository<Label,String>,JpaSpecificationExecutor<Label>{
                                                                /*实现分页*/
}
