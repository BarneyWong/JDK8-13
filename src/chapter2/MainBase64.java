package chapter2;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class MainBase64 {
    public static void main(String[] args) {
        /**
         *
         */
//        BASE64Encoder base64Encoder = new BASE64Encoder();
//        BASE64Decoder base64Decoder = new BASE64Decoder();
//        String text = "BarneyWong";
//        try {
//            byte[] bytes = text.getBytes("UTF-8");
//            String encodedText = base64Encoder.encode(bytes);
//            System.out.println(encodedText);
//            byte[] decodedText = base64Decoder.decodeBuffer(encodedText);
//            System.out.println(new String(decodedText,"UTF-8"));
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        Base64.Encoder encoder = Base64.getEncoder();
        Base64.Decoder decoder = Base64.getDecoder();
        String text = "BarneyWong";
        try {
            byte[] bytes = text.getBytes("UTF-8");
            String encodedText = encoder.encodeToString(bytes);
            System.out.println(encodedText);
            byte[] decodedText = decoder.decode(encodedText);
            System.out.println(new String (decodedText,"UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }


    }
}
