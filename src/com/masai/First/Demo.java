package com.masai.First;

public class Demo {

    public static void main(String[] args) {

        SocialMediaContext context = new SocialMediaContext();

        context.SetSocialMediaStrategy(new FaceBookStrategy(), "Santhosh");

        context.SetSocialMediaStrategy(new TwitterStrategy(), "Santhosh");

        context.SetSocialMediaStrategy(new GooglePlusStrategy(), "Santhosh");

        context.SetSocialMediaStrategy(new OrkutStrategy(), "Santhosh");
    }

}
