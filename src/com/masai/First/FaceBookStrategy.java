package com.masai.First;

public class FaceBookStrategy implements SocialMediaStrategy{
    @Override
    public void connect(String s) {
        System.out.println("Connecting with " + s +" through Facebook");
    }
}
