package visual_recognition;

import com.ibm.watson.developer_cloud.visual_recognition.v3.VisualRecognition;
import com.ibm.watson.developer_cloud.visual_recognition.v3.model.ClassifyImagesOptions;
import com.ibm.watson.developer_cloud.visual_recognition.v3.model.VisualClassification;


public class VisualRecognitionTest {

	public static void main(String[] args) {
		VisualRecognition service = 
				new VisualRecognition(VisualRecognition.VERSION_DATE_2016_05_20);
		service.setApiKey("apikey");
		System.out.println("Classify an image");
		
		ClassifyImagesOptions options = new ClassifyImagesOptions.Builder()
				.url("http://www.jangsada.com/files/attach/images/1572/500/002/db0e26c4043c42908ad321de21aeef76.jpg")
				.build();
		VisualClassification result = service.classify(options).execute();
		System.out.println(result);
	}
}
