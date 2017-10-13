package com.n1books.dev.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Repository;

@Repository("ibatis")
public class Text2SpeechDAOibatis implements Text2SpeechDAO {
	
@Autowired
private SqlMapClientTemplate SqlMapClientTemplate;

@Override
public void insertText2Speech(Text2SpeechVO vo) throws Exception {
	SqlMapClientTemplate.insert("tts.insertText2Speech", vo);
}

@Override
public List<Text2SpeechVO> getText2SpeechList() throws Exception {
	return SqlMapClientTemplate.queryForList("tts.getText2SpeechList");
}

@Override
public int deleteText2Speech(int no) throws Exception {
	return SqlMapClientTemplate.delete("tts.deleteText2speech",no);
	
}




	
}
