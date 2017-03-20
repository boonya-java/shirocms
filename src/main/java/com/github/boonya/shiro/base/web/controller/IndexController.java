package com.github.boonya.shiro.base.web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.github.boonya.shiro.base.Constants;
import com.github.boonya.shiro.base.service.AuthorizationService;
import com.github.boonya.shiro.base.service.ResourceService;
import com.github.boonya.shiro.base.web.bind.annotation.CurrentUser;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * <p>User: Zhang Kaitao
 * <p>Date: 14-2-14
 * <p>Version: 1.0
 */
@Controller
public class IndexController {

    @Autowired
    private ResourceService resourceService;
    @Autowired
    private AuthorizationService authorizationService;

    @RequestMapping("/")
    public String index(@CurrentUser com.github.boonya.shiro.base.entity.User loginUser, Model model) {
        Set<String> permissions = authorizationService.findPermissions(Constants.SERVER_APP_KEY, loginUser.getUsername());
       /* List<Resource> menus = resourceService.findMenus(permissions);
        model.addAttribute("menus", menus);*/
        List<Map<String,Object>> categoryMenus = resourceService.findCategoryMenus(permissions);
        model.addAttribute("categoryMenus", categoryMenus);
        return "index";
    }

    @RequestMapping("/welcome")
    public String welcome() {
        return "welcome";
    }


}
