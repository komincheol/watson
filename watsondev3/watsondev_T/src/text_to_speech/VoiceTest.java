package text_to_speech;

import java.util.List;

import com.ibm.watson.developer_cloud.http.ServiceCall;
import com.ibm.watson.developer_cloud.text_to_speech.v1.TextToSpeech;
import com.ibm.watson.developer_cloud.text_to_speech.v1.model.Voice;

public class VoiceTest {
	public static void main(String[] args) {
		TextToSpeech service = new TextToSpeech("bf2c3d40-6fd8-4450-becf-11c5420443e5","VjhzTPpjE5cO");
		//service.setUsernameAndPassword("bf2c3d40-6fd8-4450-becf-11c5420443e5","VjhzTPpjE5cO");

		ServiceCall call = service.getVoices();
		List<Voice> voices = (List<Voice>) call.execute();
		for(Voice voice : voices) {
			System.out.println(voice.getName() + ":" + voice.getLanguage());
		}
	}
}
