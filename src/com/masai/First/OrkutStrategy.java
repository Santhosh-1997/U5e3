package com.masai.First;

public class OrkutStrategy implements SocialMediaStrategy {


    @Override
    public void connect(String s) {
        System.out.println("Connecting with " + s +" through Orkut");

    }
}
