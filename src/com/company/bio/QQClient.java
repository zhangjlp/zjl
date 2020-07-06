package com.company.bio;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class QQClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1",80);
//            socket.getOutputStream().write("fdsfs5".getBytes());
            Scanner scanner = new Scanner(System.in);
            String txt = scanner.next();
            socket.getOutputStream().write(txt.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
