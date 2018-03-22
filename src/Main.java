package com.company;

import java.io.*;

public class Main {

    public static boolean isNumeric(String str)
    {
        try
        {
            double d = Double.parseDouble(str);
        }
        catch(NumberFormatException nfe)
        {
            return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("files/file.txt"));
        PrintWriter wr = new PrintWriter("files/out.txt");

        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();


            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
                if (isNumeric(line)) {
                    wr.println(line);
                }
            }
            String everything = sb.toString();
        } finally {
            br.close();
        }

    }
}
