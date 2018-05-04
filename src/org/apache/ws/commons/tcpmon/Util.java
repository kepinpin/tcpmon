package org.apache.ws.commons.tcpmon;

import java.time.Instant;
import java.io.PrintWriter;

public class Util {
    public static void writeFile(String fname, String contents) {
        try {
            System.out.println("writeFile" + fname + ": " + contents);
            String nowTime = Instant.now().toString();
            fname = "/tmp/" + fname + "." + nowTime.replace(":", "") + ".txt";
            PrintWriter writer = new PrintWriter(fname, "UTF-8");
            System.out.println("writing to " + fname);
            writer.println(contents);
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
