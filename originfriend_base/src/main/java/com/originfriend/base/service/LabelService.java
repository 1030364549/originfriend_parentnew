package com.originfriend.base.service;

import com.originfriend.base.dao.LabelDao;
import com.originfriend.base.pojo.Label;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import util.IdWorker;

import java.util.List;

@Service
public class LabelService {
    @Autowired
    private LabelDao labelDao;
    @Autowired
    private IdWorker idWorker;

    /*添加信息*/
    public void save(Label label){
        /*调用idWorker获取下一个id，并赋值*/
        Long l = idWorker.nextId();
        label.setId(l.toString());
        labelDao.save(label);
    }

    /*删除信息*/
    public void deleteById(String id){
        labelDao.deleteById(id);
    }

    /*修改信息*/
    public void update(Label label){
        labelDao.save(label);
    }

    /*查询所有信息*/
    public List<Label> findAll(){
        return labelDao.findAll();
    }

    /*分页查询所有信息*/
    public Page finAllPage(PageRequest pageRequest){
        return labelDao.findAll(pageRequest);
    }



}
