package com.messenger.utils;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Main {


    public static void main(String[] args) throws IOException {



        Socket socket = new Socket("192.168.104.1",9090);
        ObjectInputStream read = new ObjectInputStream(socket.getInputStream());

        ObjectOutputStream write = new ObjectOutputStream(socket.getOutputStream());



    }
}
