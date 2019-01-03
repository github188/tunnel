package dll.struct;
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
public class PU_DIALING_CONFIG_INFO extends Structure {
	/** C type : PU_ENABLE_TYPE_E */
	public int enEnable;
	/** C type : DIAL_MODE_E */
	public int enDialingMode;
	/** C type : WIRELESS_NET_MODE_E */
	public int enWirelessNetMode;
	/** C type : PU_DIALING_PARA_S */
	public PU_DIALING_PARA stDialingPara;
	public PU_DIALING_CONFIG_INFO() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("enEnable", "enDialingMode", "enWirelessNetMode", "stDialingPara");
	}
	/**
	 * @param enEnable C type : PU_ENABLE_TYPE_E<br>
	 * @param enDialingMode C type : DIAL_MODE_E<br>
	 * @param enWirelessNetMode C type : WIRELESS_NET_MODE_E<br>
	 * @param stDialingPara C type : PU_DIALING_PARA_S
	 */
	public PU_DIALING_CONFIG_INFO(int enEnable, int enDialingMode, int enWirelessNetMode, PU_DIALING_PARA stDialingPara) {
		super();
		this.enEnable = enEnable;
		this.enDialingMode = enDialingMode;
		this.enWirelessNetMode = enWirelessNetMode;
		this.stDialingPara = stDialingPara;
	}
	public PU_DIALING_CONFIG_INFO(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends PU_DIALING_CONFIG_INFO implements Structure.ByReference {
		
	};
	public static class ByValue extends PU_DIALING_CONFIG_INFO implements Structure.ByValue {
		
	};
}
