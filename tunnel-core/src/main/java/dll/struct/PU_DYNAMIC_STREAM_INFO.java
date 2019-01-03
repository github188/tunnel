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
public class PU_DYNAMIC_STREAM_INFO extends Structure {
	public NativeLong ulChannelId;
	/** \u52a8\u6001\u7801\u6d41\u662f\u5426\u4f7f\u80fd */
	public boolean ulEnable;
	/** \u52a8\u6001\u5e27\u7387 */
	public NativeLong ulDynamicFrameRate;
	/** \u52a8\u6001\u7801\u7387 */
	public NativeLong ulDynamicBitRate;
	/**
	 * szReserved[0]\u52a8\u6001\u5e27\u7387\u662f\u5426\u4f7f\u80fd<br>
	 * C type : CHAR[32]
	 */
	public byte[] szReserved = new byte[32];
	public PU_DYNAMIC_STREAM_INFO() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("ulChannelId", "ulEnable", "ulDynamicFrameRate", "ulDynamicBitRate", "szReserved");
	}
	/**
	 * @param ulEnable \u52a8\u6001\u7801\u6d41\u662f\u5426\u4f7f\u80fd<br>
	 * @param ulDynamicFrameRate \u52a8\u6001\u5e27\u7387<br>
	 * @param ulDynamicBitRate \u52a8\u6001\u7801\u7387<br>
	 * @param szReserved szReserved[0]\u52a8\u6001\u5e27\u7387\u662f\u5426\u4f7f\u80fd<br>
	 * C type : CHAR[32]
	 */
	public PU_DYNAMIC_STREAM_INFO(NativeLong ulChannelId, boolean ulEnable, NativeLong ulDynamicFrameRate, NativeLong ulDynamicBitRate, byte szReserved[]) {
		super();
		this.ulChannelId = ulChannelId;
		this.ulEnable = ulEnable;
		this.ulDynamicFrameRate = ulDynamicFrameRate;
		this.ulDynamicBitRate = ulDynamicBitRate;
		if ((szReserved.length != this.szReserved.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szReserved = szReserved;
	}
	public PU_DYNAMIC_STREAM_INFO(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends PU_DYNAMIC_STREAM_INFO implements Structure.ByReference {
		
	};
	public static class ByValue extends PU_DYNAMIC_STREAM_INFO implements Structure.ByValue {
		
	};
}
