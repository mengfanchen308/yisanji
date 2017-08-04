package sm.test;

import java.util.List;

import javax.annotation.Resource;  
  
import org.apache.log4j.Logger;  
//import org.junit.Before;  
import org.junit.Test;  
import org.junit.runner.RunWith;  
//import org.springframework.context.ApplicationContext;  
//import org.springframework.context.support.ClassPathXmlApplicationContext;  
import org.springframework.test.context.ContextConfiguration;  
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;  
  
import com.alibaba.fastjson.JSON;
import com.yisanji.pojo.Order;
import com.yisanji.service.OrderService;
  
@RunWith(SpringJUnit4ClassRunner.class)     
@ContextConfiguration(locations = {"classpath:spring/spring-dao.xml","classpath:spring/spring-service.xml"})  
  
public class TestSm {  
    private static Logger logger = Logger.getLogger(TestSm.class);  
    @Resource  
    private OrderService orderService;  
  
  
    @Test  
    public void test1() {  
        List<Order> or = orderService.getOrderByStatus("payed");
        for(Order o : or) {
        	System.out.print(o.getOutTime());
        }
//        logger.info(JSON.toJSON(or));  
    }  
}  
