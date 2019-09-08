package com.originfriend.base.controller;

import com.originfriend.base.pojo.Label;
import com.originfriend.base.service.LabelService;
import entity.Result;
import entity.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController     /*ResponseBody+Controller的结合，该控制器的所有方法返回数据JSON格式*/
@CrossOrigin        /*微服务的跨域请求*/
@RequestMapping("/label")
public class LabelController {

    @Autowired
    private LabelService labelService;

    /*添加信息*/
    @RequestMapping(method = RequestMethod.POST)
    public Result save(@RequestBody Label label){
        labelService.save(label);
        return new Result(true, StatusCode.OK,"添加成功!",null);
    }

    /*删除信息*/
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public Result deleteById(@PathVariable(value = "id") String id){
        labelService.deleteById(id);
        return new Result(true, StatusCode.OK,"删除成功!",null);
    }

    /*修改信息*/
    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public Result update(@RequestBody Label label,@PathVariable(value = "id") String id){
        label.setId(id);
        labelService.update(label);
        return new Result(true,StatusCode.OK,"修改成功!",null);
    }

    /*查询所有信息*/
    @RequestMapping(method = RequestMethod.GET)
    public Result findAll(){
        List<Label> list = labelService.findAll();
        return new Result(true, StatusCode.OK,"查询成功!",list);
    }

    /*分页查询所有信息*/
    @RequestMapping(value = "/search/{pageNum}/{pageSize}",method = RequestMethod.POST)
    public Result findAll(@PathVariable Integer pageNum,@PathVariable Integer pageSize){
        PageRequest pageRequest = new PageRequest(pageNum-1,pageSize,Sort.Direction.ASC,"state");
        Page page = labelService.finAllPage(pageRequest);
        Result result = new Result(true,StatusCode.OK,"分页查询成功!",page);
        return result;
    }


}
