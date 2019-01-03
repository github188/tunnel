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
public class tagItsEPoliceSnapType extends Structure {
	/** \u901a\u9053ID */
	public NativeLong ulChannelId;
	/**
	 * ITS\u4e1a\u52a1\u7c7b\u578b<br>
	 * C type : EN_ITS_TYPE
	 */
	public int enITSType;
	/**
	 * \u8fdd\u7ae0\u7c7b\u578b\u68c0\u6d4b\u65b9\u5f0f<br>
	 * C type : EN_ITS_REGULA_DT_TYPE
	 */
	public int enRegulaDtType;
	/**
	 * \u8fde\u62cd\u95f4\u9694, \u5355\u4f4d\u65f6\u95f4 ms<br>
	 * C type : INT[4]
	 */
	public int[] aiMultiSnapInterval = new int[4];
	/** \u8fdd\u7ae0\u6293\u62cd\u9879\u6570\uff08\u7535\u8b6614\uff0c\u5361\u53e315\uff09 */
	public int iRegulationNum;
	/**
	 * \u8fdd\u7ae0\u6293\u62cd\u7c7b\u578b<br>
	 * C type : PU_ITS_REGULATION_SNAP_CONFIG_UNIT_S[32]
	 */
	public tagRegulationSnapConfigUnit[] astRegulationSnapCfgU = new tagRegulationSnapConfigUnit[32];
	/** C type : CHAR[32] */
	public byte[] szReserve = new byte[32];
	public tagItsEPoliceSnapType() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("ulChannelId", "enITSType", "enRegulaDtType", "aiMultiSnapInterval", "iRegulationNum", "astRegulationSnapCfgU", "szReserve");
	}
	/**
	 * @param ulChannelId \u901a\u9053ID<br>
	 * @param enITSType ITS\u4e1a\u52a1\u7c7b\u578b<br>
	 * C type : EN_ITS_TYPE<br>
	 * @param enRegulaDtType \u8fdd\u7ae0\u7c7b\u578b\u68c0\u6d4b\u65b9\u5f0f<br>
	 * C type : EN_ITS_REGULA_DT_TYPE<br>
	 * @param aiMultiSnapInterval \u8fde\u62cd\u95f4\u9694, \u5355\u4f4d\u65f6\u95f4 ms<br>
	 * C type : INT[4]<br>
	 * @param iRegulationNum \u8fdd\u7ae0\u6293\u62cd\u9879\u6570\uff08\u7535\u8b6614\uff0c\u5361\u53e315\uff09<br>
	 * @param astRegulationSnapCfgU \u8fdd\u7ae0\u6293\u62cd\u7c7b\u578b<br>
	 * C type : PU_ITS_REGULATION_SNAP_CONFIG_UNIT_S[32]<br>
	 * @param szReserve C type : CHAR[32]
	 */
	public tagItsEPoliceSnapType(NativeLong ulChannelId, int enITSType, int enRegulaDtType, int aiMultiSnapInterval[], int iRegulationNum, tagRegulationSnapConfigUnit astRegulationSnapCfgU[], byte szReserve[]) {
		super();
		this.ulChannelId = ulChannelId;
		this.enITSType = enITSType;
		this.enRegulaDtType = enRegulaDtType;
		if ((aiMultiSnapInterval.length != this.aiMultiSnapInterval.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.aiMultiSnapInterval = aiMultiSnapInterval;
		this.iRegulationNum = iRegulationNum;
		if ((astRegulationSnapCfgU.length != this.astRegulationSnapCfgU.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.astRegulationSnapCfgU = astRegulationSnapCfgU;
		if ((szReserve.length != this.szReserve.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szReserve = szReserve;
	}
	public tagItsEPoliceSnapType(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends tagItsEPoliceSnapType implements Structure.ByReference {
		
	};
	public static class ByValue extends tagItsEPoliceSnapType implements Structure.ByValue {
		
	};
}
