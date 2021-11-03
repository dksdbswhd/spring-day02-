package jcpdev.day02.service;

import org.springframework.stereotype.Component;

import jcpdev.day02.dto.BoardDto;
import jcpdev.day02.mapper.FreeboardMapper;

@Component
public class FreeboardServicelmpl implements FreeboardService {

	private final FreeboardMapper freeDao;
	
	//@Autowired //생성자 자동주입
	public FreeboardServicelmpl(FreeboardMapper freeDao) {
		this.freeDao = freeDao;
	}
	
	@Override
	public int getCount() {
		return freeDao.getCount();
	}

	@Override
	public BoardDto getBoardOne(int idx) {
		return freeDao.getBoardOne(idx);
	}

}
