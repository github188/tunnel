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
public class PU_EVENT_TRANSPARENT extends Structure {
	/**
	 * \u901a\u7528\u4e8b\u4ef6<br>
	 * C type : PU_EVENT_COMMON_S
	 */
	public PU_EVENT_COMMON stPuEventCommon;
	/** C type : PU_TRANSPARENT_CMD_S */
	public PU_TRANSPARENT_CMD stTransparentCmd;
	/** C type : CHAR[32] */
	public byte[] szReserved = new byte[32];
	public PU_EVENT_TRANSPARENT() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("stPuEventCommon", "stTransparentCmd", "szReserved");
	}
	/**
	 * @param stPuEventCommon \u901a\u7528\u4e8b\u4ef6<br>
	 * C type : PU_EVENT_COMMON_S<br>
	 * @param stTransparentCmd C type : PU_TRANSPARENT_CMD_S<br>
	 * @param szReserved C type : CHAR[32]
	 */
	public PU_EVENT_TRANSPARENT(PU_EVENT_COMMON stPuEventCommon, PU_TRANSPARENT_CMD stTransparentCmd, byte szReserved[]) {
		super();
		this.stPuEventCommon = stPuEventCommon;
		this.stTransparentCmd = stTransparentCmd;
		if ((szReserved.length != this.szReserved.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szReserved = szReserved;
	}
	public PU_EVENT_TRANSPARENT(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends PU_EVENT_TRANSPARENT implements Structure.ByReference {
		
	};
	public static class ByValue extends PU_EVENT_TRANSPARENT implements Structure.ByValue {
		
	};
}
