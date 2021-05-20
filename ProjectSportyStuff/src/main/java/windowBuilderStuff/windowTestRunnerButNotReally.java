package windowBuilderStuff;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import net.bytebuddy.asm.Advice.This;
import ourCode.ExcelService;

public class windowTestRunnerButNotReally {

	public windowTestRunnerButNotReally() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {


		WindowHandler wh = new WindowHandler();
		
		wh.initialize();
		wh.runLoginSignupWindow();

	}

}
