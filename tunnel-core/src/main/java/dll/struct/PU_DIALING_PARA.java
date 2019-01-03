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
public class PU_DIALING_PARA extends Structure {
	/**
	 * \u9274\u6743\u7c7b\u578b\uff0c\u4e3a\u4e0d\u9274\u6743\u65f6\u7528\u6237\u540d\u5bc6\u7801\u53ef\u4ee5\u4e3a\u7a7a<br>
	 * C type : DIAL_AUTH_TYPE_E
	 */
	public int enAuthType;
	/** C type : CHAR[(32 + 1)] */
	public byte[] szApn = new byte[32 + 1];
	/** C type : CHAR[(32 + 1)] */
	public byte[] szUserName = new byte[32 + 1];
	/** C type : CHAR[(32 + 1)] */
	public byte[] szPassWd = new byte[32 + 1];
	public PU_DIALING_PARA() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("enAuthType", "szApn", "szUserName", "szPassWd");
	}
	/**
	 * @param enAuthType \u9274\u6743\u7c7b\u578b\uff0c\u4e3a\u4e0d\u9274\u6743\u65f6\u7528\u6237\u540d\u5bc6\u7801\u53ef\u4ee5\u4e3a\u7a7a<br>
	 * C type : DIAL_AUTH_TYPE_E<br>
	 * @param szApn C type : CHAR[(32 + 1)]<br>
	 * @param szUserName C type : CHAR[(32 + 1)]<br>
	 * @param szPassWd C type : CHAR[(32 + 1)]
	 */
	public PU_DIALING_PARA(int enAuthType, byte szApn[], byte szUserName[], byte szPassWd[]) {
		super();
		this.enAuthType = enAuthType;
		if ((szApn.length != this.szApn.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szApn = szApn;
		if ((szUserName.length != this.szUserName.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szUserName = szUserName;
		if ((szPassWd.length != this.szPassWd.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szPassWd = szPassWd;
	}
	public PU_DIALING_PARA(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends PU_DIALING_PARA implements Structure.ByReference {
		
	};
	public static class ByValue extends PU_DIALING_PARA implements Structure.ByValue {
		
	};
}
