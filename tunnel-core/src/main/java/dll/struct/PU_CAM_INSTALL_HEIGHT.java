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
public class PU_CAM_INSTALL_HEIGHT extends Structure {
	public NativeLong ulChnID;
	public NativeLong ulCentimeter;
	/** C type : CHAR[32] */
	public byte[] szReserved = new byte[32];
	public PU_CAM_INSTALL_HEIGHT() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("ulChnID", "ulCentimeter", "szReserved");
	}
	/** @param szReserved C type : CHAR[32] */
	public PU_CAM_INSTALL_HEIGHT(NativeLong ulChnID, NativeLong ulCentimeter, byte szReserved[]) {
		super();
		this.ulChnID = ulChnID;
		this.ulCentimeter = ulCentimeter;
		if ((szReserved.length != this.szReserved.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szReserved = szReserved;
	}
	public PU_CAM_INSTALL_HEIGHT(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends PU_CAM_INSTALL_HEIGHT implements Structure.ByReference {
		
	};
	public static class ByValue extends PU_CAM_INSTALL_HEIGHT implements Structure.ByValue {
		
	};
}
