package com.jimbolix.september.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.jimbolix.september.SeptemberApplicationTests;
import com.jimbolix.september.entity.SeptUser;
import com.jimbolix.september.entity.vo.SeptUserVo;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class SeptUserServiceTest extends SeptemberApplicationTests {

    @Autowired
    private ISeptUserService userService;

    @Test
    public void test(){
        List<SeptUser> userList = new ArrayList<>();
        for(int i = 0;i<=10;i++){
            SeptUser septUser = new SeptUser();
            septUser.setPassword("1223");
            septUser.setUserName("test");
            userList.add(septUser);
        }

        userService.saveBatch(userList);
    }

    @Test
    public void testpage(){
        IPage<SeptUser> page = userService.page(new SeptUserVo());
        System.out.println("========Records=========="+page.getRecords().size());
        SeptUserVo userVo = new SeptUserVo();
        userVo.setCurrentPage(2);
        userVo.setPageSize(10);
        page = userService.page(userVo);
        System.out.println("========Records=========="+page.getRecords().size());
    }
}
