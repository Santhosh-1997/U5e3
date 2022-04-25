package com.masai.First;

public class GooglePlusStrategy implements SocialMediaStrategy{
    @Override
    public void connect(String s) {
        System.out.println("Connecting with " + s +" through Google Plus");

    }
}
