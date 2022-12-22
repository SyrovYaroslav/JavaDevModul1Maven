package org.example;

import com.google.gson.Gson;

import java.util.Map;

public class App {
    public static void main( String[] args ) {
        Map<String, String> myName = Map.of("name", "Yaroslav", "lastName", "Syrovatka");
        System.out.println(new Gson().toJson(myName));
    }
}
