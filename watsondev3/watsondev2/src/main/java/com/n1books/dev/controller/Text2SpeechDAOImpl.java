package com.n1books.dev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class Text2SpeechDAOImpl implements Text2SpeechDAO{
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public void insertText2Speech(Text2SpeechVO vo) throws Exception {
		Object[] args = new Object[] {
			vo.getStatement(),
			vo.getLang()
		};
		
		jdbcTemplate.update(
				"insert into tbl_text2speech(statement,lang)values(?,?)",args);
	}
}
