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
public class PU_DOT1X_CONFIG_INFO extends Structure {
	/** \u542f\u7528\u6807\u5fd7 */
	public boolean bDot1xEnable;
	/**
	 * EAPOL\u7248\u672c<br>
	 * C type : PU_DOT1X_EAPOL_VERSION_E
	 */
	public int enEapolVersion;
	/**
	 * EAP\u7528\u6237\u540d<br>
	 * C type : CHAR[32]
	 */
	public byte[] szEapUserName = new byte[32];
	/**
	 * EAPPwd<br>
	 * C type : CHAR[(64 + 4)]
	 */
	public byte[] szEapPassWord = new byte[64 + 4];
	/**
	 * szReserved[0]\u8868\u793aEAP MD5\u5f00\u5173 0:\u5173\u95ed 1:\u5f00\u542f<br>
	 * C type : CHAR[32]
	 */
	public byte[] szReserved = new byte[32];
	public PU_DOT1X_CONFIG_INFO() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("bDot1xEnable", "enEapolVersion", "szEapUserName", "szEapPassWord", "szReserved");
	}
	/**
	 * @param bDot1xEnable \u542f\u7528\u6807\u5fd7<br>
	 * @param enEapolVersion EAPOL\u7248\u672c<br>
	 * C type : PU_DOT1X_EAPOL_VERSION_E<br>
	 * @param szEapUserName EAP\u7528\u6237\u540d<br>
	 * C type : CHAR[32]<br>
	 * @param szEapPassWord EAPPwd<br>
	 * C type : CHAR[(64 + 4)]<br>
	 * @param szReserved szReserved[0]\u8868\u793aEAP MD5\u5f00\u5173 0:\u5173\u95ed 1:\u5f00\u542f<br>
	 * C type : CHAR[32]
	 */
	public PU_DOT1X_CONFIG_INFO(boolean bDot1xEnable, int enEapolVersion, byte szEapUserName[], byte szEapPassWord[], byte szReserved[]) {
		super();
		this.bDot1xEnable = bDot1xEnable;
		this.enEapolVersion = enEapolVersion;
		if ((szEapUserName.length != this.szEapUserName.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szEapUserName = szEapUserName;
		if ((szEapPassWord.length != this.szEapPassWord.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szEapPassWord = szEapPassWord;
		if ((szReserved.length != this.szReserved.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szReserved = szReserved;
	}
	public PU_DOT1X_CONFIG_INFO(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends PU_DOT1X_CONFIG_INFO implements Structure.ByReference {
		
	};
	public static class ByValue extends PU_DOT1X_CONFIG_INFO implements Structure.ByValue {
		
	};
}
