package task11.menu;

import java.util.Scanner;

public class MenuClient {
    private int value;
    private String numberMenu;
    Scanner scan = new Scanner(System.in);

    public void callMenuClient() {
        while (!"5".equals(numberMenu)) {
            print("1. Для добавления товара в корзину введите 1");
            print("2. Для удаления товара из корзины введите 2");
            print("3. Для просмотра корзины товаров введите 3");
            print("4. Для просмотра товаров в магазине введите 4");
            print("5. Для выхода из приложения введите 5");
            numberMenu = scan.next();

            try {
                value = Integer.parseInt(numberMenu);
            } catch (NumberFormatException e) {
                print("Неверный ввод");
            }

            callMethod();
        }
        print("До свидания!");
    }

    private void callMethod() {
        switch (value) {
            case 1:
                // вызов метода 1 добавления товара
                break;
            case 2:
                // вызов метода 2 удаления товара
                break;
            case 3:
                // вызов метода 3 просмотра корзины
                break;
            case 4:
                // вызов просмотра списка товаров в магазине
        }
    }

    private void print(String value) {
        System.out.println(value);
    }
}
