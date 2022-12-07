package com.java.lesson.lesson101;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
 File file = new File("resources/text.txt");
 System.out.println(file.exists());
 System.out.println(file.createNewFile());
 System.out.println(file.isFile());
 System.out.println(file.exists());
 System.out.println(file.getParent());
 System.out.println(file.getName());

// File dir = new File("resources/test/dir");
// System.out.println(dir.mkdirs());
// String[] list = dir.list();
// Arrays.stream(list).forEach(System.out::println);

// File file1 = new File(String.join(File.separator,"resources", "text.txt"));

// File file = Path.of("resources", "text.txt").toFile();

// FileInputStream fileInputStream = null;

// try (FileInputStream fileInputStream = new FileInputStream(file);) {
// byte[] bytes = fileInputStream.readAllBytes();
// String text = new String(bytes);
// System.out.println(text);
// } catch (IOException e) {
// e.printStackTrace();
// }
//
// try (FileInputStream fileInputStream = new FileInputStream(file);) {
// byte[] bytes = new byte[fileInputStream.available()];
// int count = 0;
// byte currentByte;
//
// while ((currentByte=(byte) fileInputStream.read())!= -1){
// bytes[count++]= currentByte;
// }
//
// String text = new String(bytes);
// System.out.println(text);
//
// } catch (IOException e) {
// e.printStackTrace();
// }


    }
}