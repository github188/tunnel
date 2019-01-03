package dll.struct;
import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : D:\HWPuSDK.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class PU_VIDEO_ENCODE_PARA extends Structure {
	/**
	 * @see PU_STREAM_MODE_E<br>
	 * \u6d41\u5957\u9910\u65b9\u5f0f<br>
	 * C type : PU_STREAM_MODE_E
	 */
	public int enVideoStreamMode;
	/** \u52a8\u6001\u5e27\u7387\u662f\u5426\u4f7f\u80fd */
	public boolean bDynamicFrmRateEnable;
	/** \u52a8\u6001\u5e27\u7387 */
	public NativeLong ulDynamicFrmRate;
	/** \u52a8\u6001\u7801\u7387\u662f\u5426\u4f7f\u80fd */
	public boolean bDynamicBitRateEnable;
	/** \u52a8\u6001\u7801\u7387 */
	public NativeLong ulDynamicBitRate;
	/**
	 * \u89c6\u9891\u91c7\u96c6\u5e27\u5236\u5f0f<br>
	 * C type : PU_FRAMERATE_FORMAT_E
	 */
	public int enFrameMat;
	/**
	 * \u89c6\u9891\u5c5e\u6027<br>
	 * C type : PU_STREAM_ATTRIBUTE_S[3]
	 */
	public PU_STREAM_ATTRIBUTE[] stStreamAttribute = new PU_STREAM_ATTRIBUTE[3];
	/**
	 * szReserved[0]\u6807\u8bc6\u5bbd\u7a84\u5c4f\u6a21\u5f0f 0:\u5bbd\u5c4f 1:\u7a84\u5c4f<br>
	 * C type : CHAR[32]
	 */
	public byte[] szReserve = new byte[32];
	public PU_VIDEO_ENCODE_PARA() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("enVideoStreamMode", "bDynamicFrmRateEnable", "ulDynamicFrmRate", "bDynamicBitRateEnable", "ulDynamicBitRate", "enFrameMat", "stStreamAttribute", "szReserve");
	}
	/**
	 * @param enVideoStreamMode @see PU_STREAM_MODE_E<br>
	 * \u6d41\u5957\u9910\u65b9\u5f0f<br>
	 * C type : PU_STREAM_MODE_E<br>
	 * @param bDynamicFrmRateEnable \u52a8\u6001\u5e27\u7387\u662f\u5426\u4f7f\u80fd<br>
	 * @param ulDynamicFrmRate \u52a8\u6001\u5e27\u7387<br>
	 * @param bDynamicBitRateEnable \u52a8\u6001\u7801\u7387\u662f\u5426\u4f7f\u80fd<br>
	 * @param ulDynamicBitRate \u52a8\u6001\u7801\u7387<br>
	 * @param enFrameMat \u89c6\u9891\u91c7\u96c6\u5e27\u5236\u5f0f<br>
	 * C type : PU_FRAMERATE_FORMAT_E<br>
	 * @param stStreamAttribute \u89c6\u9891\u5c5e\u6027<br>
	 * C type : PU_STREAM_ATTRIBUTE_S[3]<br>
	 * @param szReserve szReserved[0]\u6807\u8bc6\u5bbd\u7a84\u5c4f\u6a21\u5f0f 0:\u5bbd\u5c4f 1:\u7a84\u5c4f<br>
	 * C type : CHAR[32]
	 */
	public PU_VIDEO_ENCODE_PARA(int enVideoStreamMode, boolean bDynamicFrmRateEnable, NativeLong ulDynamicFrmRate, boolean bDynamicBitRateEnable, NativeLong ulDynamicBitRate, int enFrameMat, PU_STREAM_ATTRIBUTE stStreamAttribute[], byte szReserve[]) {
		super();
		this.enVideoStreamMode = enVideoStreamMode;
		this.bDynamicFrmRateEnable = bDynamicFrmRateEnable;
		this.ulDynamicFrmRate = ulDynamicFrmRate;
		this.bDynamicBitRateEnable = bDynamicBitRateEnable;
		this.ulDynamicBitRate = ulDynamicBitRate;
		this.enFrameMat = enFrameMat;
		if ((stStreamAttribute.length != this.stStreamAttribute.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.stStreamAttribute = stStreamAttribute;
		if ((szReserve.length != this.szReserve.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szReserve = szReserve;
	}
	public PU_VIDEO_ENCODE_PARA(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends PU_VIDEO_ENCODE_PARA implements Structure.ByReference {
		
	};
	public static class ByValue extends PU_VIDEO_ENCODE_PARA implements Structure.ByValue {
		
	};
}
