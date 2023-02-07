/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package main;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import util.FileUtil;

/**
 *
 * @author Lenovo
 */
public class TCP_Client {

    public static void main(String[] args) throws IOException, Exception {
       Socket socket = new Socket("localhost",6789);
       
       OutputStream outputStream = socket.getOutputStream();
       DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
       //fayli goturmek istediyimiz yeri qeyd edirik
        byte[] bytes= FileUtil.readBytes("C:\\Users\\Lenovo\\Desktop\\Espanol\\test.jpg");
       
        dataOutputStream.writeInt(bytes.length);
        dataOutputStream.write(bytes);
       
       socket.close();
    }
}
