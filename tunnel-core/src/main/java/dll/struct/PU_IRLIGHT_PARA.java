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
public class PU_IRLIGHT_PARA extends Structure {
	/** \u4f7f\u80fd */
	public boolean bEnable;
	/** \u4eae\u5ea6 */
	public NativeLong ulIRLightLum;
	/** C type : CHAR[32] */
	public byte[] szReserved = new byte[32];
	public PU_IRLIGHT_PARA() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("bEnable", "ulIRLightLum", "szReserved");
	}
	/**
	 * @param bEnable \u4f7f\u80fd<br>
	 * @param ulIRLightLum \u4eae\u5ea6<br>
	 * @param szReserved C type : CHAR[32]
	 */
	public PU_IRLIGHT_PARA(boolean bEnable, NativeLong ulIRLightLum, byte szReserved[]) {
		super();
		this.bEnable = bEnable;
		this.ulIRLightLum = ulIRLightLum;
		if ((szReserved.length != this.szReserved.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szReserved = szReserved;
	}
	public PU_IRLIGHT_PARA(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends PU_IRLIGHT_PARA implements Structure.ByReference {
		
	};
	public static class ByValue extends PU_IRLIGHT_PARA implements Structure.ByValue {
		
	};
}
