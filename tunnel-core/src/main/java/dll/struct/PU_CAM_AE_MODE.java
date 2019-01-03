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
public class PU_CAM_AE_MODE extends Structure {
	/**
	 * AE\u66dd\u5149\u6a21\u5f0f<br>
	 * C type : PU_AE_MODE_E
	 */
	public int enAEMode;
	public PU_CAM_AE_MODE() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("enAEMode");
	}
	/**
	 * @param enAEMode AE\u66dd\u5149\u6a21\u5f0f<br>
	 * C type : PU_AE_MODE_E
	 */
	public PU_CAM_AE_MODE(int enAEMode) {
		super();
		this.enAEMode = enAEMode;
	}
	public PU_CAM_AE_MODE(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends PU_CAM_AE_MODE implements Structure.ByReference {
		
	};
	public static class ByValue extends PU_CAM_AE_MODE implements Structure.ByValue {
		
	};
}
