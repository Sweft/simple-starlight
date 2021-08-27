package com.gosweft.simple_starlight.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.gosweft.services.SweftService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SweftServiceTest {
	@Autowired
	private SweftService sweftService;

	@Test
	public void testEditDistance() {
			String str1 = "cat";
			String str2 = "cut";
			int editDistance = sweftService.getEditDistance(str1, str2);
			assert(editDistance==1);
			
			str1="geek";
			str2="gesek";
			editDistance = sweftService.getEditDistance(str1, str2);
			assert(editDistance==1);
			
			str1="sunday";
			str2="saturday";
			editDistance = sweftService.getEditDistance(str1, str2);
			assert(editDistance==3);
			
	}
}