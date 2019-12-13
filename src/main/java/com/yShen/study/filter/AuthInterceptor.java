package com.yShen.study.filter;

import com.yShen.study.model.Admin;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerExceptionResolverComposite;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AuthInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HandlerMethod handlerMethod = (HandlerMethod) handler;
        String methodName = handlerMethod.getMethod().getName();
//        System.out.println(methodName);
        if (!methodName.equals("login")&&!methodName.equals("add")&&!methodName.equals("index")){
            /*未完成*/
            HttpSession session = request.getSession(true);
            Admin loginUser = (Admin) session.getAttribute("admin");
            if (loginUser == null) {
                response.sendRedirect(request.getContextPath()+"/");
            }
        }
        return super.preHandle(request, response, handler);
    }
}
