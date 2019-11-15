package chapter9;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File file = new File("./src/chapter9/test.txt");

        try( FileWriter fileWriter = new FileWriter(file,true)) {
            fileWriter.append("Hello World BarneyWong !\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
