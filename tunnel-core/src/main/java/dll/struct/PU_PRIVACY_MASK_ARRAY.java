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
public class PU_PRIVACY_MASK_ARRAY extends Structure {
	public NativeLong ulChannelID;
	public NativeLong ulNum;
	public boolean bEnable;
	/** C type : PU_MASK_PARA_S[10] */
	public PU_MASK_PARA[] stMaskPara = new PU_MASK_PARA[10];
	public PU_PRIVACY_MASK_ARRAY() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("ulChannelID", "ulNum", "bEnable", "stMaskPara");
	}
	/** @param stMaskPara C type : PU_MASK_PARA_S[10] */
	public PU_PRIVACY_MASK_ARRAY(NativeLong ulChannelID, NativeLong ulNum, boolean bEnable, PU_MASK_PARA stMaskPara[]) {
		super();
		this.ulChannelID = ulChannelID;
		this.ulNum = ulNum;
		this.bEnable = bEnable;
		if ((stMaskPara.length != this.stMaskPara.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.stMaskPara = stMaskPara;
	}
	public PU_PRIVACY_MASK_ARRAY(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends PU_PRIVACY_MASK_ARRAY implements Structure.ByReference {
		
	};
	public static class ByValue extends PU_PRIVACY_MASK_ARRAY implements Structure.ByValue {
		
	};
}
