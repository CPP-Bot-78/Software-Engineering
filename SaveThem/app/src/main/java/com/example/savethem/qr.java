package com.example.savethem;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
//import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import android.content.Intent;
import android.app.Activity;


//import javax.imageio.ImageIO;

public class qr extends Activity
{

    private String link;
    // this code wasn't working so in order to build the app it's a comment for now
    /*private static String readQR(String path, String charset, Map hashMap) throws FileNotFoundException, IOException, NotFoundException
    {
        BinaryBitmap binaryBitmap = new BinaryBitmap(
            new HybridBinarizer(
                new BufferedImageLuminanceSource(
                    ImageIO.read(
                        new FileInputStream(path)
                    )
                )
            )
        );
 
        Result result = new MultiFormatReader().decode(binaryBitmap);

        return result.getText();
    }
    */
    public void openCamera()
    {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        startActivity(intent);

    }

    public String getURLfromQR(String pngFilePath) throws NotFoundException, IOException {
        String examplePngFilePath = "C:/folder/file.png";
        String charset = "UTF-8";
        Map<EncodeHintType, ErrorCorrectionLevel> hashMap = new HashMap<EncodeHintType,ErrorCorrectionLevel>();
        hashMap.put(EncodeHintType.ERROR_CORRECTION,ErrorCorrectionLevel.L);
        //this.link = this.readQR(pngFilePath, charset, hashMap);

        return this.link;
    }
}