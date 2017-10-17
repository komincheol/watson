package com.n1books.pilot.nlu;

import com.ibm.watson.developer_cloud.natural_language_understanding.v1.NaturalLanguageUnderstanding;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.AnalysisResults;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.AnalyzeOptions;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.ConceptsOptions;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.Features;

public class NLUExample {
private static String username="795d16ee-0068-4bbe-887a-7a6f64815fd3";
private static String password="73teC0sz5E6I";
private static String url="http://www.oxtoto.co.kr/Soccer/game_preview/?lkey=229&gkey=496387&year=2017/2018&hkey=31&akey=727";

public static void main(String[] args) {
	NaturalLanguageUnderstanding service=
			new NaturalLanguageUnderstanding(NaturalLanguageUnderstanding.VERSION_DATE_2017_02_27);
	service.setUsernameAndPassword(username, password);
	
	ConceptsOptions concepts = new ConceptsOptions.Builder().limit(20).build();
	Features features = new Features.Builder().concepts(concepts).build();
	AnalyzeOptions parameters=
			new AnalyzeOptions.Builder().url(url).features(features).build();
	AnalysisResults response = service.analyze(parameters).execute();
	System.out.println(response);
	
}
}
