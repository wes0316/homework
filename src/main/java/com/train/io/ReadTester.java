package com.train.io;

import java.io.*;

public class ReadTester {
    public static void main(String[] args) {
        //inputstream();
        // filereader();
        File file;
        try {
            BufferedReader br = new BufferedReader(new FileReader("data.txt"));
            String line =br.readLine();
            while (line!=null)
            {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private static void filereader() {
        try {
            FileReader fr = new FileReader("data.txt");
            int n =fr.read();
            while(n!= -1)
            {
                System.out.print((char)n);
                n=fr.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void inputstream() {
        File file = new File("data.txt");
        System.out.println(file.exists());
        System.out.println(file.getAbsolutePath());
        try {
            FileInputStream fs = new FileInputStream(file);
            int n = fs.read();
            while(n != -1)
            {
                System.out.print((char)n);
                n= fs.read();
            }
            System.out.println(" ");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("File open success");
    }

}

