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
public class ITS_EXPOSURE_LAMP_ATTR extends Structure {
	/**
	 * \u5916\u7f6e\u706f\u5de5\u4f5c\u6a21\u5f0f<br>
	 * C type : PU_EXT_LAMP_WORK_MODE_E
	 */
	public int enExtLampWorkMode;
	/** \u8109\u5bbd */
	public NativeLong ulPulseWidth;
	/** \u5ef6\u540e\u65f6\u95f4\uff0c\u7528\u4e8e\u8c03\u8282\u540c\u6b65 */
	public NativeLong ulDelayTime;
	/**
	 * \u7206\u95ea\u706f\u89e6\u53d1\u7535\u5e73<br>
	 * C type : PU_EXP_LAMP_TRIG_LEVEL_E
	 */
	public int enExpLampTrigLevel;
	/** \u4eae\u5ea6\u9608\u503c\uff0c\u81ea\u52a8\u6a21\u5f0f\u65f6\u751f\u6548 */
	public NativeLong ulLightThreshold;
	/** C type : CHAR[32] */
	public byte[] szReserved = new byte[32];
	public ITS_EXPOSURE_LAMP_ATTR() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("enExtLampWorkMode", "ulPulseWidth", "ulDelayTime", "enExpLampTrigLevel", "ulLightThreshold", "szReserved");
	}
	/**
	 * @param enExtLampWorkMode \u5916\u7f6e\u706f\u5de5\u4f5c\u6a21\u5f0f<br>
	 * C type : PU_EXT_LAMP_WORK_MODE_E<br>
	 * @param ulPulseWidth \u8109\u5bbd<br>
	 * @param ulDelayTime \u5ef6\u540e\u65f6\u95f4\uff0c\u7528\u4e8e\u8c03\u8282\u540c\u6b65<br>
	 * @param enExpLampTrigLevel \u7206\u95ea\u706f\u89e6\u53d1\u7535\u5e73<br>
	 * C type : PU_EXP_LAMP_TRIG_LEVEL_E<br>
	 * @param ulLightThreshold \u4eae\u5ea6\u9608\u503c\uff0c\u81ea\u52a8\u6a21\u5f0f\u65f6\u751f\u6548<br>
	 * @param szReserved C type : CHAR[32]
	 */
	public ITS_EXPOSURE_LAMP_ATTR(int enExtLampWorkMode, NativeLong ulPulseWidth, NativeLong ulDelayTime, int enExpLampTrigLevel, NativeLong ulLightThreshold, byte szReserved[]) {
		super();
		this.enExtLampWorkMode = enExtLampWorkMode;
		this.ulPulseWidth = ulPulseWidth;
		this.ulDelayTime = ulDelayTime;
		this.enExpLampTrigLevel = enExpLampTrigLevel;
		this.ulLightThreshold = ulLightThreshold;
		if ((szReserved.length != this.szReserved.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szReserved = szReserved;
	}
	public ITS_EXPOSURE_LAMP_ATTR(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends ITS_EXPOSURE_LAMP_ATTR implements Structure.ByReference {
		
	};
	public static class ByValue extends ITS_EXPOSURE_LAMP_ATTR implements Structure.ByValue {
		
	};
}