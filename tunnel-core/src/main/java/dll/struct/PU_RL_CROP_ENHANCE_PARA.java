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
public class PU_RL_CROP_ENHANCE_PARA extends Structure {
	/** \u901a\u9053\u53f7 */
	public NativeLong ulChannelID;
	/** \u5f3a\u5ea6(0-100) */
	public int iLevel;
	/** \u4f7f\u80fd\u5f00\u5173 */
	public int iEnable;
	/**
	 * \u5e27\u4fe1\u606f<br>
	 * C type : PU_RL_FRAME_PARA_S
	 */
	public PU_RL_FRAME_PARA stFrameInfo;
	/** C type : CHAR[32] */
	public byte[] szReserve = new byte[32];
	public PU_RL_CROP_ENHANCE_PARA() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("ulChannelID", "iLevel", "iEnable", "stFrameInfo", "szReserve");
	}
	/**
	 * @param ulChannelID \u901a\u9053\u53f7<br>
	 * @param iLevel \u5f3a\u5ea6(0-100)<br>
	 * @param iEnable \u4f7f\u80fd\u5f00\u5173<br>
	 * @param stFrameInfo \u5e27\u4fe1\u606f<br>
	 * C type : PU_RL_FRAME_PARA_S<br>
	 * @param szReserve C type : CHAR[32]
	 */
	public PU_RL_CROP_ENHANCE_PARA(NativeLong ulChannelID, int iLevel, int iEnable, PU_RL_FRAME_PARA stFrameInfo, byte szReserve[]) {
		super();
		this.ulChannelID = ulChannelID;
		this.iLevel = iLevel;
		this.iEnable = iEnable;
		this.stFrameInfo = stFrameInfo;
		if ((szReserve.length != this.szReserve.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szReserve = szReserve;
	}
	public PU_RL_CROP_ENHANCE_PARA(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends PU_RL_CROP_ENHANCE_PARA implements Structure.ByReference {
		
	};
	public static class ByValue extends PU_RL_CROP_ENHANCE_PARA implements Structure.ByValue {
		
	};
}
