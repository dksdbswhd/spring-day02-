package jcpdev.day02;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import jcpdev.day02.mapper.FreeboardMapper;
import jcpdev.day02.service.FreeboardService;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = {"classpath:META-INF/spring/applicationContext.xml"})
class MybatisTest {
	
	@Autowired
	ApplicationContext context;
	
	@Autowired
	FreeboardMapper fdao;
	
	@Autowired
	FreeboardService fservice;

	@Test	//테스트할 메소드에 작성 → 출력문 작성 또는 test case 메소드로 성공 또는 실패를 리턴
	void test() {
		fail("Not yet implemented");
	}
	
	@Test
	void connect() {
		SqlSessionTemplate sqlSeeion = (SqlSessionTemplate) context.getBean("sqlSessionTemplate");
		assertNotNull(sqlSeeion);
		System.out.println(sqlSeeion);
	}

}
