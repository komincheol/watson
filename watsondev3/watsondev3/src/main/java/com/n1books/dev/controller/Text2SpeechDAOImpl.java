package com.n1books.dev.controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class Text2SpeechDAOImpl implements Text2SpeechDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public void insertText2Speech(Text2SpeechVO vo) throws Exception {
		Object[] args = new Object[] {
			vo.getStatement(),
			vo.getLang()
		};
		
		jdbcTemplate.update(
				"insert into tbl_texttospeech(statement,lang)values(?,?)",args);
	}

	@Override
	public List<Text2SpeechVO> getText2SpeechList() throws Exception {
		RowMapper<Text2SpeechVO> rowMapper = new RowMapper<Text2SpeechVO>() {

			@Override
			public Text2SpeechVO mapRow(ResultSet rs, int rownum) throws SQLException {
				Text2SpeechVO vo = new Text2SpeechVO();
				vo.setNo(rs.getInt("no"));
				vo.setStatement(rs.getString("statement"));
				vo.setLang(rs.getString("lang"));
				return vo;
			}
			
		};
		return jdbcTemplate.query(
			" select no, statement, lang from tbl_texttospeech" +
			" order by no desc", rowMapper);
	}

	@Override
	public void delete(int no) throws Exception {
		Object[] args = new Object[] {
				no
			};
		jdbcTemplate.update(
				"delete from tbl_texttospeech where no=?",args
				);
		
	}
}
