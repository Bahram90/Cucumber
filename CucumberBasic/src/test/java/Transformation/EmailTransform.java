package Transformation;

import cucumber.api.Transformer;

//this class will help transfer from 1 data to another data example: String to double)))
public class EmailTransform extends Transformer<String>{

	@Override
	public String transform(String userName) {
		//it will return our data to ea.com
		return userName.concat("ea.com");
	}
}
