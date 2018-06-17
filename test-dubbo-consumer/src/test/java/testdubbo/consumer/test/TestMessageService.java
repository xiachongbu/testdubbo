package testdubbo.consumer.test;


import com.alibaba.dubbo.config.annotation.Reference;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import testdubbo.service.IMessageService;
import testdubbo.vo.Message;

@ContextConfiguration(locations = {"classpath:spring/spring-*.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class TestMessageService {
    @Reference
    private IMessageService messageService;

    @Test
    public void testEcho() {
        Message msg = new Message();
        msg.setTitle("测试dubbo");
        msg.setContent("是否正常运行");
        msg.setSender("consumer");
        System.out.println(this.messageService.echo(msg));
    }
}
