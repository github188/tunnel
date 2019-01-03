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
public class PU_TW_ALARM_PARA extends Structure {
	public NativeLong ulChannelId;
	public boolean bEnable;
	/** \u544a\u8b66\u68c0\u6d4b\u95f4\u9694 */
	public NativeLong ulAlarmInterval;
	/**
	 * \u76ee\u6807\u8bc6\u522b\u6a21\u5f0f<br>
	 * C type : PU_IGT_TARGET_MODE_E
	 */
	public int enTargetDetecMode;
	/**
	 * \u7eca\u7ebf\u6570\u7ec4\uff1a\u83b7\u53d6\u65f6\u4f1a\u8fd4\u56de\u6240\u6709\u7eca\u7ebf\u5750\u6807\u4fe1\u606f\uff0c\u5982\u679c\u5750\u6807\u4e3a0\u8bf4\u660e\u4e0d\u518d\u5f53\u524d\u955c\u5934\u8303\u56f4\u5185\uff08\u4f1a\u8fd4\u56de\u7d22\u5f15\uff09\uff1b<br>
	 * C type : PU_IGT_TW_LINE_LIST_S
	 */
	public PU_IGT_TW_LINE_LIST stlineList;
	/**
	 * \u5e03\u9632\u8ba1\u5212<br>
	 * C type : PU_ALARM_TIME_LIST_S
	 */
	public PU_ALARM_TIME_PARA_LIST stTWGuardPlan;
	/** C type : CHAR[32] */
	public byte[] szReserved = new byte[32];
	public PU_TW_ALARM_PARA() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("ulChannelId", "bEnable", "ulAlarmInterval", "enTargetDetecMode", "stlineList", "stTWGuardPlan", "szReserved");
	}
	/**
	 * @param ulAlarmInterval \u544a\u8b66\u68c0\u6d4b\u95f4\u9694<br>
	 * @param enTargetDetecMode \u76ee\u6807\u8bc6\u522b\u6a21\u5f0f<br>
	 * C type : PU_IGT_TARGET_MODE_E<br>
	 * @param stlineList \u7eca\u7ebf\u6570\u7ec4\uff1a\u83b7\u53d6\u65f6\u4f1a\u8fd4\u56de\u6240\u6709\u7eca\u7ebf\u5750\u6807\u4fe1\u606f\uff0c\u5982\u679c\u5750\u6807\u4e3a0\u8bf4\u660e\u4e0d\u518d\u5f53\u524d\u955c\u5934\u8303\u56f4\u5185\uff08\u4f1a\u8fd4\u56de\u7d22\u5f15\uff09\uff1b<br>
	 * C type : PU_IGT_TW_LINE_LIST_S<br>
	 * @param stTWGuardPlan \u5e03\u9632\u8ba1\u5212<br>
	 * C type : PU_ALARM_TIME_LIST_S<br>
	 * @param szReserved C type : CHAR[32]
	 */
	public PU_TW_ALARM_PARA(NativeLong ulChannelId, boolean bEnable, NativeLong ulAlarmInterval, int enTargetDetecMode, PU_IGT_TW_LINE_LIST stlineList, PU_ALARM_TIME_PARA_LIST stTWGuardPlan, byte szReserved[]) {
		super();
		this.ulChannelId = ulChannelId;
		this.bEnable = bEnable;
		this.ulAlarmInterval = ulAlarmInterval;
		this.enTargetDetecMode = enTargetDetecMode;
		this.stlineList = stlineList;
		this.stTWGuardPlan = stTWGuardPlan;
		if ((szReserved.length != this.szReserved.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szReserved = szReserved;
	}
	public PU_TW_ALARM_PARA(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends PU_TW_ALARM_PARA implements Structure.ByReference {
		
	};
	public static class ByValue extends PU_TW_ALARM_PARA implements Structure.ByValue {
		
	};
}
