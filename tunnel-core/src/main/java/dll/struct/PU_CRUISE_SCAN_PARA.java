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
public class PU_CRUISE_SCAN_PARA extends Structure {
	/** \u5de1\u822a\u8f68\u8ff9\u5e8f\u5217\u53f7 */
	public NativeLong ulCruiseIndex;
	public PU_CRUISE_SCAN_PARA() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("ulCruiseIndex");
	}
	/** @param ulCruiseIndex \u5de1\u822a\u8f68\u8ff9\u5e8f\u5217\u53f7 */
	public PU_CRUISE_SCAN_PARA(NativeLong ulCruiseIndex) {
		super();
		this.ulCruiseIndex = ulCruiseIndex;
	}
	public PU_CRUISE_SCAN_PARA(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends PU_CRUISE_SCAN_PARA implements Structure.ByReference {
		
	};
	public static class ByValue extends PU_CRUISE_SCAN_PARA implements Structure.ByValue {
		
	};
}
