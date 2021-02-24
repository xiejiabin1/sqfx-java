package com.lzxx.common.utils;

import org.apache.tomcat.util.codec.binary.Base64;
import javax.crypto.*;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.AlgorithmParameterSpec;

/**
 * @author 先谢郭嘉
 * @version 1.0
 * @description: 小程序AES加解密工具类
 * @date 2021/2/22
 */
public class AESUtil {
    /**
     * AES解密
     *
     * @param data   //密文，被加密的数据
     * @param key    //秘钥
     * @param iv     //偏移量
     * @return
     * @throws Exception
     */
    public static String decryptGet(String data, String key,String iv){
        //被加密的数据
        byte[] dataByte = Base64.decodeBase64(data);
        //加密秘钥
        byte[] keyByte = Base64.decodeBase64(key);
        //偏移量
        byte[] ivByte = Base64.decodeBase64(iv);
        try {
            AlgorithmParameterSpec ivSpec = new IvParameterSpec(ivByte);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            SecretKeySpec keySpec = new SecretKeySpec(keyByte, "AES");
            cipher.init(Cipher.DECRYPT_MODE, keySpec, ivSpec);
            return new String(cipher.doFinal(dataByte),"UTF-8");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (InvalidAlgorithmParameterException e) {
            e.printStackTrace();
        } catch (IllegalBlockSizeException e) {
            e.printStackTrace();
        } catch (BadPaddingException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return null;
    }

}
