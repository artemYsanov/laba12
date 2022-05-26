package com.company;
import javax.imageio.IIOException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ip-адрес ");
        String input = scanner.nextLine();
        //matches проверяет регулярное выражение
        boolean result = input.matches("^(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$");
        if (result) {
            try (FileWriter fw = new FileWriter("C:\\Users\\Artem\\IdeaProjects\\ip_adress2//file.txt");
                 BufferedWriter bw = new BufferedWriter(fw)){
                bw.write(input);
            }catch (IIOException ex){

            }
        } else {
            System.out.println("адрес некорректный");
        }
    }

}