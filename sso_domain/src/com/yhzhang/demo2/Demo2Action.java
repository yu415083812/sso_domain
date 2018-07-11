package com.yhzhang.demo2;

import com.opensymphony.xwork2.ActionSupport;
import com.yhzhang.util.SSOCheck;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;

/**
 * Demo class
 *
 * @author zhangyuhang
 * @date 2018/7/11
 */
public class Demo2Action extends ActionSupport {
    private String gotoUrl;

    public String main(){
        HttpServletRequest request = ServletActionContext.getRequest();
        if(SSOCheck.checkCookie(request)){
            return SUCCESS;
        }
        gotoUrl = "/demo2/main.action";
        return LOGIN;
    }

    public String getGotoUrl() {
        return gotoUrl;
    }

    public void setGotoUrl(String gotoUrl) {
        this.gotoUrl = gotoUrl;
    }
}
