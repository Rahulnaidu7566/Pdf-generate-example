package com.psa.pdf;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.psa.pdf.utility.ExcelReader;


@SpringBootTest
class PdfGenerateExampleApplicationTests {

	@Test
	void contextLoads() {
		ExcelReader read = new ExcelReader();
		read.readExcel();
		
	}

}
