package com.blank.qna;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class QnaDAO {
	
	@Inject
	private SqlSession sqlSession;
	private final String NAMESPACE="testMapper.";
	
	public int write(QnaDTO qnaDTO) throws Exception{
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("qnaDTO", qnaDTO);
		sqlSession.insert(NAMESPACE+"write", map);
		System.out.println(map.get("result"));
		return 0;
	}
	
	public int update(QnaDTO qnaDTO) throws Exception{
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("qnaDTO", qnaDTO);
		sqlSession.update(NAMESPACE+"update", map);
		System.out.println(map.get("result"));
		return 0;
	}
	
	public int reply(QnaDTO qnaDTO) throws Exception{
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("qnaDTO", qnaDTO);
		sqlSession.update(NAMESPACE+"reply", map);
		System.out.println(map.get("result"));
		return 0;
	}
}
