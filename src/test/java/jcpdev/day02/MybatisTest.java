package jcpdev.day02;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import jcpdev.day02.mapper.CustomerMapper;
import jcpdev.day02.mapper.FreeboardMapper;
import jcpdev.day02.service.FreeboardService;

/*
 * JUnit : 테스트케이스 도구(단위테스트)
 * 		   지금 사용 버전은 JUnit5(jupiter)
 * 		   @Test 메소드를 테스트하여 성공 또는 실패 확인(assert 메소드 사용)
 */


@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = {"classpath:META-INF/spring/applicationContext.xml"})
class MybatisTest {
	
	@Autowired
	ApplicationContext context;
	
	@Autowired
	FreeboardMapper fdao;
	
	@Autowired
	FreeboardService fservice;
	
	@Autowired
	CustomerMapper cdao;
	

	//@Test	//테스트할 메소드에 작성 → 출력문 작성 또는 test case 메소드로 성공 또는 실패를 리턴
	void test() {
		fail("Not yet implemented");
	}
	
	//@Test
	void sqlTest() {
		System.out.println(fdao.getCount());
	}
	
	@Test
	void connect() {
		SqlSessionTemplate sqlSeeion = (SqlSessionTemplate) context.getBean("sqlSessionTemplate");
		assertNotNull(sqlSeeion);	//성공 또는 실패를 리턴
		System.out.println(sqlSeeion);
		
		assertNotNull(fdao);
		System.out.println(fdao);
		assertNotNull(fservice);
		System.out.println(fservice);
		assertNotNull(cdao);
		System.out.println(cdao.selectOne(6));
	}

}
