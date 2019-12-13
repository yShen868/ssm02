import com.yShen.study.dao.IAdminDao;
import com.yShen.study.dao.impl.AdminDao;
import com.yShen.study.model.Admin;
import com.yShen.study.service.IAdminService;
import com.yShen.study.service.impl.AdminService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_01 {



    @Test
    public void addAdmin(){

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("mybatis-config.xml");
        AdminService adminService = (AdminService) context.getBean("adminDao");
        Admin admin = new Admin("123","123",1);
        System.out.println(adminService.selectAdmin("123"));

    }



}
