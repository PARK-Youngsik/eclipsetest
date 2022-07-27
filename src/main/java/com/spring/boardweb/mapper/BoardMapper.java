package com.spring.boardweb.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BoardMapper {
	@Select("SELECT IFNULL(MAX(BOARD_SEQ), 0) + 1 FROM T_BOARD")
	int getNextBoardSeq();
	
	void updateBoardSeq(int boardSeq);
}
