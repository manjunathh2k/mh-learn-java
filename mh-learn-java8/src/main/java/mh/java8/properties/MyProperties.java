package mh.java8.properties;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

public class MyProperties {

    public static void main(String[] args) throws IOException {


        Properties prop = new Properties();

        prop.setProperty("loc","blr");
        prop.setProperty("company","Morgan Stanley");
        prop.setProperty("title","VP");


        try(BufferedWriter br = Files.newBufferedWriter(Paths.get("properties.txt"))){
            prop.store(br,"Sample for testing");

        }
    }
}
