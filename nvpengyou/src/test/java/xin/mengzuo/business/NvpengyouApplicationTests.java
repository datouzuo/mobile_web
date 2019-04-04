package xin.mengzuo.business;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import xin.mengzuo.config.DataUntil;
import xin.mengzuo.dao.ItemMapper;
import xin.mengzuo.service.ItemService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NvpengyouApplicationTests {

	
	@Test
	public void contextLoads() {
		
		
            System.out.println(DataUntil.getYearMonthDay());
	}

}