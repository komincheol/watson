package com.n1books.dev.controller;

import java.io.InputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ibm.watson.developer_cloud.text_to_speech.v1.TextToSpeech;
import com.ibm.watson.developer_cloud.text_to_speech.v1.model.AudioFormat;
import com.ibm.watson.developer_cloud.text_to_speech.v1.model.Voice;

@Component("service")
public class Text2SpeechServiceImpl 
	extends TextToSpeech
	implements Text2SpeechService {
	
	@Autowired
	private Text2SpeechDAO text2SpeechDAO;

	public Text2SpeechServiceImpl() {
		setUsernameAndPassword(
			"0a3f4d46-2ab1-4b73-ab79-9970543734ce", "MEOCGJkFDFTv");
	}

	public List<Voice> getVoiceList() throws Exception {
		return getVoices().execute();
	}

	@Override
	public InputStream getSpeech(String statement, String voice) throws Exception {
		return synthesize(statement, new Voice(voice,null,null), AudioFormat.OGG).execute();
	}

	@Override
	public void insertText2Speech(Text2SpeechVO vo) throws Exception {
		// TODO Auto-generated method stub
		
	}
}