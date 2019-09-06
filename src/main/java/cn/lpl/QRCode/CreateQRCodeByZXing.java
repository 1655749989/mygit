package cn.lpl.QRCode;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.sun.org.glassfish.gmbal.ParameterNames;

import java.io.File;
import java.nio.file.Path;
import java.util.HashMap;

//使用ZXing的方式生成二维码
public class CreateQRCodeByZXing {
    /**
     * @Param content 二维码内容
     * */
    public void createCode(String content){

//        final int width = 300;
//                 final int height = 300;
//                final String format = "png";
////                 final String content = "我爱你，中国";
//
//                //定义二维码的参数
//                HashMap hints = new HashMap();
//                 hints.put(EncodeHintType.CHARACTER_SET, "utf-8");
//                hints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.M);
//               hints.put(EncodeHintType.MARGIN, 2);
//
//                //生成二维码
//                 try{
//                         //OutputStream stream = new OutputStreamWriter();
//                        BitMatrix bitMatrix = new MultiFormatWriter().encode(content, BarcodeFormat.QR_CODE, width, height, hints);
//                        Path file = new File("F:/img.png").toPath();
//                         MatrixToImageWriter.writeToPath(bitMatrix, format, file);
//                        //MatrixToImageWriter.writeToStream(bitMatrix, format, stream);
//                    }catch(Exception e){
//                    }



    //定义图片的宽度和高度
    int width=300,height=300;
    String format="png";

    //定义二维码参数
        HashMap map = new HashMap();
        map.put(EncodeHintType.CHARACTER_SET,"utf-8");
        map.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.M);//设置纠错等级
        map.put(EncodeHintType.MARGIN,2);//边框


        // 参数顺序分别为：编码内容，编码类型，生成图片宽度，生成图片高度，设置参数

        try {
            BitMatrix encode = new MultiFormatWriter().encode(content, BarcodeFormat.QR_CODE, width, height, map);

            File file = new File("C:\\Users\\Administrator\\Desktop\\新建文件夹\\img.png");
            Path path = file.toPath();
            MatrixToImageWriter.writeToPath(encode,format,path);
            System.out.println("完成");


        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public void createCode2(){

    }

    public static void main(String[] args) {
        CreateQRCodeByZXing code = new CreateQRCodeByZXing();
        code.createCode("你好");
    }

}
