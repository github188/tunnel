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
public class PU_DISTURB_ALARM_PARA extends Structure {
	/** \u89c6\u9891\u901a\u9053ID */
	public NativeLong ulChannelId;
	/**
	 * \u5e72\u6270\u68c0\u6d4b\u53c2\u6570<br>
	 * C type : PU_DISTURB_PARA_S
	 */
	public PU_DISTURB_PARA stDisturbPara;
	/**
	 * \u5e03\u9632\u65f6\u95f4\u5217\u8868<br>
	 * C type : PU_ALARM_TIME_LIST_S
	 */
	public PU_ALARM_TIME_PARA_LIST stAlarmTimeList;
	public PU_DISTURB_ALARM_PARA() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("ulChannelId", "stDisturbPara", "stAlarmTimeList");
	}
	/**
	 * @param ulChannelId \u89c6\u9891\u901a\u9053ID<br>
	 * @param stDisturbPara \u5e72\u6270\u68c0\u6d4b\u53c2\u6570<br>
	 * C type : PU_DISTURB_PARA_S<br>
	 * @param stAlarmTimeList \u5e03\u9632\u65f6\u95f4\u5217\u8868<br>
	 * C type : PU_ALARM_TIME_LIST_S
	 */
	public PU_DISTURB_ALARM_PARA(NativeLong ulChannelId, PU_DISTURB_PARA stDisturbPara, PU_ALARM_TIME_PARA_LIST stAlarmTimeList) {
		super();
		this.ulChannelId = ulChannelId;
		this.stDisturbPara = stDisturbPara;
		this.stAlarmTimeList = stAlarmTimeList;
	}
	public PU_DISTURB_ALARM_PARA(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends PU_DISTURB_ALARM_PARA implements Structure.ByReference {
		
	};
	public static class ByValue extends PU_DISTURB_ALARM_PARA implements Structure.ByValue {
		
	};
}
