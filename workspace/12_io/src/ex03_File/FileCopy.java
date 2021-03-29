package ex03_File;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) {
		
		// 원본 Windmill.mp4
		// FileInputStream을 통해서 읽습니다.
		// 속도를 높이기 위해서 BufferedInputStream을 사용합니다.
		BufferedInputStream bis = null;
		
		// 복사본 C:\\MyTemp\\Windmill.mp4
		// 경로 지정을 위해서 File 클래스를 사용하고,
		// FileOutputStream을 통해서 만듭니다.
		// 속도를 높이기 위해서 BufferedOutputStream을 사용합니다.
		File cpy = new File("C:\\MyTemp", "Windmill.mp4");
		BufferedOutputStream bos = null;
		
		try {
			bis = new BufferedInputStream(new FileInputStream("Windmill.mp4"));  // 현재 디렉터리의 Windmill.mp4
			bos = new BufferedOutputStream(new FileOutputStream(cpy));  // C:\\MyTemp 디렉터리의 Windmill.mp4
			// 복사 시작 시간
			long start = System.currentTimeMillis();
			byte[] b = new byte[1024];
			int length = 0;
			while ( (length = bis.read(b)) != -1 ) {
				bos.write(b, 0, length);
			}
			// 복사 종료 시간
			long end = System.currentTimeMillis();
			System.out.println(cpy.getAbsolutePath() + " 파일이 복사되었습니다.");
			System.out.println("복사 소요시간: " + ((end - start) * 0.001) + "초");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bos != null) { bos.close(); }
				if (bis != null) { bis.close(); }
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
