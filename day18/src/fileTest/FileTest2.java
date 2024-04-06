package fileTest;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileTest2 {
	public static void main(String[] args) {

		// workspace 폴더에 test18.txt 파일을 생성하고
		// abc라는 문자 넣기

		File f = new File("test18.txt");

		try {
			FileOutputStream fos = new FileOutputStream(f);
			fos.write('a');
			fos.write('\n');
			fos.write('b');
			fos.write('\n');
			fos.write('c');
			fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
