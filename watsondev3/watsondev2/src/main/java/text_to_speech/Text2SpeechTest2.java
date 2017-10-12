package text_to_speech;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.n1books.dev.controller.Text2SpeechService;

public class Text2SpeechTest2 {
	public static void main(String[] args) {
		//ApplicationContext context= 
		//		new ClassPathXmlApplicationContext("text_to_speech/beeninit.xml");
		
		ApplicationContext context= 
				new ClassPathXmlApplicationContext("beeninit.xml",Text2SpeechTest2.class);
		Text2SpeechService service = (Text2SpeechService)context.getBean("service");
		try {
			System.out.println(service.getVoiceList());
		}catch (Exception e) {
			e.printStackTrace();
		
		}
	}

}
