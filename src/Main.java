import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Команды для ввода:
                'write {file}' - Записывает в file сообщение message
                'read {file}' - Выводит содержимое файла file на экран
                'copy {file1} {file2}' - Копирует file1 в file2
                'exit' - выход
                """);
        System.out.println();
        String str;
        while (true) {
            String next = scanner.nextLine();
            try {
                if (next.contains("read")) {
                    str = next.replace("read ", "");
                    File file = new File("src", str);
                    new Read(file);
                } else if (next.contains("write")) {
                    str = next.replace("write ", "");
                    File file = new File("src", str);
                    System.out.println("Введите ваш текст ниже:");
                    String input = scanner.nextLine();
                    new Write(input, file);
                    System.out.println("Done!  ");
                } else if (next.contains("copy")) {
                    str = next.replace("copy ", "");
                    int delimiter = str.indexOf(" ");
                    File file1 = new File("src", str.substring(0, delimiter));
                    File file2 = new File("scr", str.substring(delimiter + 1, str.length()));
                    new Copy(file1, file2);
                } else if (next.contains("exit")) break;
            } catch (Exception E) {
                System.out.println("Вы ввели что-то не то, попробуйте еще раз");
            }
        }
    }
}


