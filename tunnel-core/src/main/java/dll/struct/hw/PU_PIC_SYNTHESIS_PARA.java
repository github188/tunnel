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
public class PU_PIC_SYNTHESIS_PARA extends Structure {
	/** \u901a\u9053ID */
	public NativeLong ulChnID;
	/** \u662f\u5426\u542f\u7528\u5408\u6210 */
	public boolean bEnable;
	/** C type : PU_ONE_PIC_SYNTHESIS_TYPE_E */
	public int enOnePicSynthesisType;
	/** C type : PU_TWO_PIC_SYNTHESIS_TYPE_E */
	public int enTwoPicSynthesisType;
	/** C type : PU_THREE_PIC_SYNTHESIS_TYPE_E */
	public int enThreePicSynthesisType;
	public PU_PIC_SYNTHESIS_PARA() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("ulChnID", "bEnable", "enOnePicSynthesisType", "enTwoPicSynthesisType", "enThreePicSynthesisType");
	}
	/**
	 * @param ulChnID \u901a\u9053ID<br>
	 * @param bEnable \u662f\u5426\u542f\u7528\u5408\u6210<br>
	 * @param enOnePicSynthesisType C type : PU_ONE_PIC_SYNTHESIS_TYPE_E<br>
	 * @param enTwoPicSynthesisType C type : PU_TWO_PIC_SYNTHESIS_TYPE_E<br>
	 * @param enThreePicSynthesisType C type : PU_THREE_PIC_SYNTHESIS_TYPE_E
	 */
	public PU_PIC_SYNTHESIS_PARA(NativeLong ulChnID, boolean bEnable, int enOnePicSynthesisType, int enTwoPicSynthesisType, int enThreePicSynthesisType) {
		super();
		this.ulChnID = ulChnID;
		this.bEnable = bEnable;
		this.enOnePicSynthesisType = enOnePicSynthesisType;
		this.enTwoPicSynthesisType = enTwoPicSynthesisType;
		this.enThreePicSynthesisType = enThreePicSynthesisType;
	}
	public PU_PIC_SYNTHESIS_PARA(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends PU_PIC_SYNTHESIS_PARA implements Structure.ByReference {
		
	};
	public static class ByValue extends PU_PIC_SYNTHESIS_PARA implements Structure.ByValue {
		
	};
}