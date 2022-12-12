package com.spring_boot.ydpos.dao;

import java.util.ArrayList;

import com.spring_boot.ydpos.model.PagingVO;
import com.spring_boot.ydpos.model.UserProfileVO;

public interface IPagingDAO {
	public int countBoard(); // 게시물 총 갯수
	public ArrayList<UserProfileVO> selectBoard(PagingVO vo); // 페이징 처리 게시글 조회
}
