package org.json.simple;

import org.junit.Test;

public class Test501 {
	@Test
	public void testJsonObject() {
		JSONObject object = new JSONObject();
		object.put("name", "bk");
		object.put("nick", "born to kill");
		
		System.out.println(object);
	}

}
