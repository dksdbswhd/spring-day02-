package jcpdev.day02.service;

import jcpdev.day02.dto.BoardDto;

public interface FreeboardService {
	//메소드 이름은 임의로 정의합니다. 그러나 mapper 와 메소드 이름을 통일하는게 편합니다.
	int getCount();
	BoardDto getBoardOne(int idx);
	
}
