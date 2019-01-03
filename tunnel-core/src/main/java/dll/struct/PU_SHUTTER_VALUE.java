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
public class PU_SHUTTER_VALUE extends Structure {
	/**
	 * \u5feb\u95e8\u6a21\u5f0f<br>
	 * C type : PU_COMMONMODE_SWITCH_E
	 */
	public int enShutterMode;
	/**
	 * \u5feb\u95e8\u503c<br>
	 * C type : PU_CAM_SHUTTER_MODE_E
	 */
	public int enShutterValue;
	public NativeLong lShutterValueSlow;
	public NativeLong lShutterValueFast;
	/** C type : CHAR[32] */
	public byte[] szReserve = new byte[32];
	public PU_SHUTTER_VALUE() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("enShutterMode", "enShutterValue", "lShutterValueSlow", "lShutterValueFast", "szReserve");
	}
	/**
	 * @param enShutterMode \u5feb\u95e8\u6a21\u5f0f<br>
	 * C type : PU_COMMONMODE_SWITCH_E<br>
	 * @param enShutterValue \u5feb\u95e8\u503c<br>
	 * C type : PU_CAM_SHUTTER_MODE_E<br>
	 * @param szReserve C type : CHAR[32]
	 */
	public PU_SHUTTER_VALUE(int enShutterMode, int enShutterValue, NativeLong lShutterValueSlow, NativeLong lShutterValueFast, byte szReserve[]) {
		super();
		this.enShutterMode = enShutterMode;
		this.enShutterValue = enShutterValue;
		this.lShutterValueSlow = lShutterValueSlow;
		this.lShutterValueFast = lShutterValueFast;
		if ((szReserve.length != this.szReserve.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szReserve = szReserve;
	}
	public PU_SHUTTER_VALUE(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends PU_SHUTTER_VALUE implements Structure.ByReference {
		
	};
	public static class ByValue extends PU_SHUTTER_VALUE implements Structure.ByValue {
		
	};
}
