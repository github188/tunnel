package dll.library;

import com.sun.jna.Native;
import com.sun.jna.NativeLibrary;
import com.sun.jna.win32.StdCallLibrary;

import java.io.File;

/**
 * @描述: SDK对外开放的实现各种业务的同步接口
 *        包含 sdk_func.h、sdk_tollgate_func.h
 *        他们的实现都在imos_sdk.dll中
 * @作者: REN
 * @时间: 2019/1/3 15:32
 */
public interface IMOSLibrary extends StdCallLibrary {
    public static final String JNA_LIBRARY_NAME = "imos_sdk";
    //设置为false
    String result = System.setProperty("jna.protected","false");
    String debug = System.setProperty("jna.debug_load", "true");
    public static final NativeLibrary JNA_NATIVE_LIB = NativeLibrary.getInstance("imos"+ File.separator+"redist"+File.separator+IMOSLibrary.JNA_LIBRARY_NAME);
    public static final IMOSLibrary INSTANCE = Native.load(HWPuSDKLibrary.JNA_LIBRARY_NAME, IMOSLibrary.class);



}

