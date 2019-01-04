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
public class PU_ITGT_ALTHM_INFO extends Structure {
	/** \u901a\u9053\u53f7 */
	public int ulChannelID;
	/** \u6709\u6548\u7684\u7b97\u6cd5\u4e2a\u6570 */
	public int uiValidCount;
	/**
	 * \u5177\u4f53\u7684\u7b97\u6cd5\u4fe1\u606f<br>
	 * C type : PU_ITGT_ALTHM_BASIC_INFO_S[16]
	 */
	public PU_ITGT_ALTHM_BASIC_INFO[] astItgtAlthmBasInfo = new PU_ITGT_ALTHM_BASIC_INFO[16];
	/** C type : CHAR[32] */
	public byte[] szReserved = new byte[32];
	public PU_ITGT_ALTHM_INFO() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("ulChannelID", "uiValidCount", "astItgtAlthmBasInfo", "szReserved");
	}
	/**
	 * @param ulChannelID \u901a\u9053\u53f7<br>
	 * @param uiValidCount \u6709\u6548\u7684\u7b97\u6cd5\u4e2a\u6570<br>
	 * @param astItgtAlthmBasInfo \u5177\u4f53\u7684\u7b97\u6cd5\u4fe1\u606f<br>
	 * C type : PU_ITGT_ALTHM_BASIC_INFO_S[16]<br>
	 * @param szReserved C type : CHAR[32]
	 */
	public PU_ITGT_ALTHM_INFO(int ulChannelID, int uiValidCount, PU_ITGT_ALTHM_BASIC_INFO astItgtAlthmBasInfo[], byte szReserved[]) {
		super();
		this.ulChannelID = ulChannelID;
		this.uiValidCount = uiValidCount;
		if ((astItgtAlthmBasInfo.length != this.astItgtAlthmBasInfo.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.astItgtAlthmBasInfo = astItgtAlthmBasInfo;
		if ((szReserved.length != this.szReserved.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szReserved = szReserved;
	}
	public PU_ITGT_ALTHM_INFO(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends PU_ITGT_ALTHM_INFO implements Structure.ByReference {
		
	};
	public static class ByValue extends PU_ITGT_ALTHM_INFO implements Structure.ByValue {
		
	};
}