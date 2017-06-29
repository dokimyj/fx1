package com.blank.fx1;

import static org.junit.Assert.*;

import javax.inject.Inject;

import org.junit.Test;

import com.blank.qna.QnaDAO;
import com.blank.qna.QnaDTO;

public class PLSQLtest extends Abstract4Test {

	@Inject
	private QnaDAO qnaDAO;
	
	/*@Test
	public void test() throws Exception {
		QnaDTO qnaDTO=new QnaDTO();
		qnaDTO.setWriter("q3");
		qnaDTO.setTitle("q3");
		qnaDTO.setContents("q3");
		qnaDAO.write(qnaDTO);
		System.out.println("Done");
	}
	
	@Test
	public void test2() throws Exception {
		QnaDTO qnaDTO=new QnaDTO();
		qnaDTO.setNum(161);
		qnaDTO.setTitle("update test");
		qnaDTO.setContents("updated!");
		qnaDAO.update(qnaDTO);
		System.out.println("Done");
	}*/
	
	@Test
	public void test3() throws Exception {
		QnaDTO qnaDTO=new QnaDTO();
		qnaDTO.setNum(161);
		qnaDTO.setTitle("newreply");
		qnaDTO.setWriter("sgjkjksdlgkl");
		qnaDTO.setContents("updated!");
		qnaDAO.reply(qnaDTO);
		System.out.println("Done");
	}
}
