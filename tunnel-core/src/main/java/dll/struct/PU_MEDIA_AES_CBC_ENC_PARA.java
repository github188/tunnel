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
public class PU_MEDIA_AES_CBC_ENC_PARA extends Structure {
	/**
	 * \u52a0\u5bc6\u5bc6\u94a5<br>
	 * C type : CHAR[(65)]
	 */
	public byte[] szKey = new byte[65];
	/**
	 * IV<br>
	 * C type : CHAR[(17)]
	 */
	public byte[] szIv = new byte[17];
	public PU_MEDIA_AES_CBC_ENC_PARA() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("szKey", "szIv");
	}
	/**
	 * @param szKey \u52a0\u5bc6\u5bc6\u94a5<br>
	 * C type : CHAR[(65)]<br>
	 * @param szIv IV<br>
	 * C type : CHAR[(17)]
	 */
	public PU_MEDIA_AES_CBC_ENC_PARA(byte szKey[], byte szIv[]) {
		super();
		if ((szKey.length != this.szKey.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szKey = szKey;
		if ((szIv.length != this.szIv.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szIv = szIv;
	}
	public PU_MEDIA_AES_CBC_ENC_PARA(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends PU_MEDIA_AES_CBC_ENC_PARA implements Structure.ByReference {
		
	};
	public static class ByValue extends PU_MEDIA_AES_CBC_ENC_PARA implements Structure.ByValue {
		
	};
}
