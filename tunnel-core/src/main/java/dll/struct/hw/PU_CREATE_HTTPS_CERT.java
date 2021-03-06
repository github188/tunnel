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
public class PU_CREATE_HTTPS_CERT extends Structure {
	/**
	 * \u8bc1\u4e66CN<br>
	 * C type : CHAR[(128 + 4)]
	 */
	public byte[] szCommonName = new byte[128 + 4];
	/**
	 * \u56fd\u5bb6<br>
	 * C type : CHAR[(128 + 4)]
	 */
	public byte[] szCountry = new byte[128 + 4];
	/**
	 * \u7701/\u5dde<br>
	 * C type : CHAR[(128 + 4)]
	 */
	public byte[] szState = new byte[128 + 4];
	/**
	 * \u5730\u533a<br>
	 * C type : CHAR[(128 + 4)]
	 */
	public byte[] szLocation = new byte[128 + 4];
	/**
	 * \u7ec4\u7ec7<br>
	 * C type : CHAR[(128 + 4)]
	 */
	public byte[] szOrganization = new byte[128 + 4];
	/**
	 * \u5355\u4f4d<br>
	 * C type : CHAR[(128 + 4)]
	 */
	public byte[] szUnit = new byte[128 + 4];
	/**
	 * \u90ae\u4ef6\u5730\u5740<br>
	 * C type : CHAR[(128 + 4)]
	 */
	public byte[] szEmail = new byte[128 + 4];
	/** \u6709\u6548\u5929\u6570 */
	public NativeLong ulExpiredDays;
	/**
	 * \u521b\u5efa\u8bc1\u4e66\u7684Pwd<br>
	 * C type : CHAR[(64 + 4)]
	 */
	public byte[] szCreateCertPsw = new byte[64 + 4];
	/** C type : CHAR[32] */
	public byte[] szReserve = new byte[32];
	public PU_CREATE_HTTPS_CERT() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("szCommonName", "szCountry", "szState", "szLocation", "szOrganization", "szUnit", "szEmail", "ulExpiredDays", "szCreateCertPsw", "szReserve");
	}
	public PU_CREATE_HTTPS_CERT(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends PU_CREATE_HTTPS_CERT implements Structure.ByReference {
		
	};
	public static class ByValue extends PU_CREATE_HTTPS_CERT implements Structure.ByValue {
		
	};
}
