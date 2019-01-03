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
public class PU_SMS_CMD_INFO extends Structure {
	/** C type : CHAR[(4 + 1)] */
	public byte[] szRcNum = new byte[4 + 1];
	/** C type : CHAR[(16)] */
	public byte[] szPeerNum = new byte[16];
	/** C type : PU_ENABLE_TYPE_E */
	public int enRestartEnable;
	/** C type : PU_ENABLE_TYPE_E */
	public int enDialEnable;
	public PU_SMS_CMD_INFO() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("szRcNum", "szPeerNum", "enRestartEnable", "enDialEnable");
	}
	/**
	 * @param szRcNum C type : CHAR[(4 + 1)]<br>
	 * @param szPeerNum C type : CHAR[(16)]<br>
	 * @param enRestartEnable C type : PU_ENABLE_TYPE_E<br>
	 * @param enDialEnable C type : PU_ENABLE_TYPE_E
	 */
	public PU_SMS_CMD_INFO(byte szRcNum[], byte szPeerNum[], int enRestartEnable, int enDialEnable) {
		super();
		if ((szRcNum.length != this.szRcNum.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szRcNum = szRcNum;
		if ((szPeerNum.length != this.szPeerNum.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szPeerNum = szPeerNum;
		this.enRestartEnable = enRestartEnable;
		this.enDialEnable = enDialEnable;
	}
	public PU_SMS_CMD_INFO(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends PU_SMS_CMD_INFO implements Structure.ByReference {
		
	};
	public static class ByValue extends PU_SMS_CMD_INFO implements Structure.ByValue {
		
	};
}
