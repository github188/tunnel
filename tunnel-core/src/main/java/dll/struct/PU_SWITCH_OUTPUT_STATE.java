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
public class PU_SWITCH_OUTPUT_STATE extends Structure {
	public NativeLong ulOutputId;
	/** \u5e38\u5f00/\u5e38\u95ed= 0\uff1a\u5e38\u5f00 1\uff1a\u5e38\u95ed */
	public NativeLong ulSwitchType;
	/** C type : CHAR[32] */
	public byte[] szReserved = new byte[32];
	public PU_SWITCH_OUTPUT_STATE() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("ulOutputId", "ulSwitchType", "szReserved");
	}
	/**
	 * @param ulSwitchType \u5e38\u5f00/\u5e38\u95ed= 0\uff1a\u5e38\u5f00 1\uff1a\u5e38\u95ed<br>
	 * @param szReserved C type : CHAR[32]
	 */
	public PU_SWITCH_OUTPUT_STATE(NativeLong ulOutputId, NativeLong ulSwitchType, byte szReserved[]) {
		super();
		this.ulOutputId = ulOutputId;
		this.ulSwitchType = ulSwitchType;
		if ((szReserved.length != this.szReserved.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szReserved = szReserved;
	}
	public PU_SWITCH_OUTPUT_STATE(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends PU_SWITCH_OUTPUT_STATE implements Structure.ByReference {
		
	};
	public static class ByValue extends PU_SWITCH_OUTPUT_STATE implements Structure.ByValue {
		
	};
}
