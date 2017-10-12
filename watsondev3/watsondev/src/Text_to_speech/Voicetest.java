package Text_to_speech;

import java.util.List;

import com.ibm.watson.developer_cloud.http.ServiceCall;
import com.ibm.watson.developer_cloud.text_to_speech.v1.TextToSpeech;
import com.ibm.watson.developer_cloud.text_to_speech.v1.model.Voice;

public class Voicetest {
	
	public static void main(String[] args) {
		TextToSpeech service = new TextToSpeech();
		service.setUsernameAndPassword("140e7a4a-30a3-40cc-8d34-97e6034a7a6c", "onzen3MZd4FP");
		
		ServiceCall call = service.getVoices();
		List<Voice> voices = (List<Voice>) call.execute();
	for(Voice voice : voices){
		System.out.println(voice.getName()+":" + voice.getLanguage());
		
	}
	}

}
