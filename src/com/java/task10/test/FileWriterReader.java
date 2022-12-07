package com.java.task10.test;

import java.io.*;

public class FileWriterReader {
        public static void main(String[] args) {
// ЗАПИСЫВАНИЕ В ФАЙЛ
            try(FileWriter writer = new FileWriter("notes3.txt", false)) // создание файла в директории проекта


            { // в параметр append в строке выше добавить true, чтоб ДОзаписывать, а не ПЕРЕзаписывать файл.
// запись всей строки или переменной -
                String text = "Java может, Java может всё что угодно!\nМожет это. Может это\n...Но не может банально вывести на консоль тип переменной...";
                writer.write(text);
// запись по символам -
                writer.append('\n');
                writer.append("E\n");

                writer.flush(); // закрытие потока FileWriter, вероятно... Несмотря на то, что мы находимся в try-with-resources с автозакрытием
            }
            catch(IOException ex){

                System.out.println(ex.getMessage());
            }
            System.out.println("Создание и запись файла завершены");

// ЧТЕНИЕ ИЗ ФАЙЛА построковое
            System.out.println("\n\"Чтение из файла\"\n");

            try(FileReader fr = new FileReader("notes3.txt"); BufferedReader reader = new BufferedReader(fr);)
//создаем объект FileReader для файла notes3.txt. И создаем BufferedReader с существующего FileReader для построчного считывания
            {
                String line = reader.readLine(); // считаем сначала первую строку

                int count = 0; //счётчик считываний себе для примера делаю:
                while (line != null) {
                    System.out.printf("Считывание в цикле #%d: ", ++count); //для примера сделал
                    System.out.println(line); // считываем и выводим на печать остальные строки в цикле
                    line = reader.readLine();

                }
            }

            catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            catch (IOException e) {
                e.printStackTrace();
            }

        }
}
