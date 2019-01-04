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
public class PU_AUTOGAIN_MAXVALUE extends Structure {
	/** \u81ea\u52a8\u589e\u76ca\u6700\u5927\u503c */
	public NativeLong lMaxAutoGain;
	public PU_AUTOGAIN_MAXVALUE() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("lMaxAutoGain");
	}
	/** @param lMaxAutoGain \u81ea\u52a8\u589e\u76ca\u6700\u5927\u503c */
	public PU_AUTOGAIN_MAXVALUE(NativeLong lMaxAutoGain) {
		super();
		this.lMaxAutoGain = lMaxAutoGain;
	}
	public PU_AUTOGAIN_MAXVALUE(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends PU_AUTOGAIN_MAXVALUE implements Structure.ByReference {
		
	};
	public static class ByValue extends PU_AUTOGAIN_MAXVALUE implements Structure.ByValue {
		
	};
}