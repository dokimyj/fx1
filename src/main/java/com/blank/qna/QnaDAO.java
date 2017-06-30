package com.blank.qna;

import java.util.HashMap;
import java.util.List;
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
	
	public QnaDTO view(int num) throws Exception{
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("num", num);
		sqlSession.selectOne(NAMESPACE+"view", map);
		List<QnaDTO> al=(List<QnaDTO>)map.get("qna"); //몇개가 오는지 모르므로 리스트로 꺼내옴
		return al.get(0);
	}
	
	public List<QnaDTO> list(int firstrow, int lastrow) throws Exception{ //원래는 RowMaker로 받아와야 함
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("firstrow", firstrow);
		map.put("lastrow", lastrow);
		sqlSession.selectOne(NAMESPACE+"list", map); //Map개체 1개로 리턴되기 때문에 굳이 selectList를 선택할 필요는 없음.
		List<QnaDTO> al=(List<QnaDTO>)map.get("qna"); //몇개가 오는지 모르므로 리스트로 꺼내옴
		return al;
	}
}
