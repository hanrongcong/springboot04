package org.hrc.springboot04.action;

import org.hrc.springboot04.pojo.CusSms;
import org.hrc.springboot04.service.CusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.UUID;

@Controller
public class CusAction {

    @Autowired
    private CusService cusService;

    @RequestMapping("/regist")
    @ResponseBody
    public String regist()
    {
        CusSms cusSms=new CusSms();
        cusSms.setCname("111");
        cusSms.setToken(UUID.randomUUID().toString());
        cusService.regist(cusSms);
        return "OK!";
    }

    @RequestMapping("/find")
    @ResponseBody
    public CusSms find(Long id)
    {
        return cusService.findById(id);
    }

    @RequestMapping("/findByPage")
    @ResponseBody
    public List<CusSms> find(Integer pageIndex, Integer pageSize)
    {
        return cusService.findByPage(pageIndex,pageSize);
    }


}
