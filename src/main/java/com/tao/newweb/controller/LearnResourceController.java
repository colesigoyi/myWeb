package com.tao.newweb.controller;

/**
 * @author taoxuefeng
 * @create 2018-10-10 00:44
 * @desc
 **/

import com.tao.newweb.domain.LearnResouce;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tengj on 2017/3/7.
 */
@Controller

public class LearnResourceController {



    @RequestMapping("/homepage")
    public ModelAndView homepage(){
        ModelAndView modelAndView = new ModelAndView("/homepage");
        return modelAndView;
    }
    @RequestMapping("/lover")
    public ModelAndView lover(){
        ModelAndView modelAndView = new ModelAndView("/lover");
        return modelAndView;
    }
    @RequestMapping("/family")
    public ModelAndView family(){
        ModelAndView modelAndView = new ModelAndView("/family");
        return modelAndView;
    }

    @RequestMapping("/favoriteweb")
    public ModelAndView index2(){

        List<LearnResouce> learnList =new ArrayList<LearnResouce>();
        LearnResouce bean =new LearnResouce("官方参考文档","Spring Boot Reference Guide","http://docs.spring.io/spring-boot/docs/1.5.1.RELEASE/reference/htmlsingle/#getting-started-first-application");
        learnList.add(bean);
        bean =new LearnResouce("Github","我的Github仓库 ","https://github.com/colesigoyi");
        learnList.add(bean);
        bean =new LearnResouce("并发编程网","并发编程网 ","http://ifeve.com/");
        learnList.add(bean);
        bean =new LearnResouce("并发编程网","leetCode ","https://leetcode-cn.com/");
        learnList.add(bean);
        bean =new LearnResouce("并发编程网","CSDN ","https://bbs.csdn.net/");
        learnList.add(bean);
        bean =new LearnResouce("并发编程网","云栖社区 ","https://yq.aliyun.com/?spm=5176.164075.1146454.20.4bd02fef5IWCPg");
        learnList.add(bean);
        bean =new LearnResouce("并发编程网","我的码云 ","https://gitee.com/taoxuefeng/");
        learnList.add(bean);
        bean =new LearnResouce("并发编程网","youtube ","https://www.youtube.com/");
        learnList.add(bean);
        bean =new LearnResouce("并发编程网","Google ","https://www.google.com/");
        learnList.add(bean);
        bean =new LearnResouce("并发编程网","牛客网 ","https://www.nowcoder.com/2400831");
        learnList.add(bean);
        ModelAndView modelAndView = new ModelAndView("/template");
        modelAndView.addObject("learnList", learnList);
        return modelAndView;
    }


}
