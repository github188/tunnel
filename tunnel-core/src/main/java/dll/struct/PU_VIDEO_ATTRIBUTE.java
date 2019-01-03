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
public class PU_VIDEO_ATTRIBUTE extends Structure {
	/** \u7801\u7387 */
	public NativeLong ulBitRate;
	/** I\u5e27\u95f4\u9694 */
	public NativeLong ulIFrameInterval;
	/** \u5e27\u7387 */
	public NativeLong ulFrameRate;
	/**
	 * \u89c6\u9891\u7f16\u7801\u7c7b\u578b<br>
	 * C type : PU_ENCODE_TYPE_E
	 */
	public int enVideoEncodeMode;
	/**
	 * \u5206\u8fa8\u7387<br>
	 * C type : PU_RESOLUTION_TYPE_E
	 */
	public int enResolution;
	/**
	 * \u7801\u7387\u7c7b\u578b<br>
	 * C type : PU_BITRATE_TYPE_E
	 */
	public int enBitRateType;
	/**
	 * \u56fe\u50cf\u8d28\u91cf<br>
	 * C type : PU_PIC_QUALITY_E
	 */
	public int enPicQuality;
	/**
	 * \u56fe\u50cf\u5236\u5f0f<br>
	 * C type : PU_VIDEO_FORMAT_E
	 */
	public int enVideoFormat;
	/**
	 * \u5e27\u7387\u4f18\u5148\u7801\u7387\u4f18\u5148\u6a21\u5f0f,\u4ec5H264\u4e0b\u6709\u6548<br>
	 * C type : PU_H264_RC_PRI_E
	 */
	public int enRcPriMode;
	/**
	 * \u955c\u50cf\u6a21\u5f0f(\u5b9e\u9645\u4ee5\u4e3b\u7801\u6d41\u955c\u50cf\u6a21\u5f0f\u751f\u6548)<br>
	 * C type : PU_VIDEO_MIRROR_MODE_E
	 */
	public int enMirrorMode;
	/**
	 * szReserve[0]\u6807\u8bc6\u7f16\u7801\u590d\u6742\u5ea6: H264 0 BP,   1 MP,     2 HP<br>
	 * C type : CHAR[32]
	 */
	public byte[] szReserve = new byte[32];
	public PU_VIDEO_ATTRIBUTE() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("ulBitRate", "ulIFrameInterval", "ulFrameRate", "enVideoEncodeMode", "enResolution", "enBitRateType", "enPicQuality", "enVideoFormat", "enRcPriMode", "enMirrorMode", "szReserve");
	}
	public PU_VIDEO_ATTRIBUTE(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends PU_VIDEO_ATTRIBUTE implements Structure.ByReference {
		
	};
	public static class ByValue extends PU_VIDEO_ATTRIBUTE implements Structure.ByValue {
		
	};
}
