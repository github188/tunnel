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
public class PU_CARDETECT_PARAM extends Structure {
	/** \u901a\u9053ID */
	public NativeLong ulChannelId;
	/** \u7b97\u6cd5\u4f7f\u80fd */
	public boolean bEnable;
	/** \u7b97\u6cd5\u68c0\u6d4b\u7075\u654f\u5ea6 */
	public NativeLong ulSensitivity;
	/** \u544a\u8b66\u4e0a\u62a5\u95f4\u9694 */
	public NativeLong ulAlarmTime;
	/** \u505c\u8f66\u9608\u503c */
	public NativeLong ulParkTimeThr;
	/**
	 * \u505c\u8f66\u4fa6\u6d4b\u68c0\u6d4b\u533a\u57df<br>
	 * C type : PU_IGT_AERADTC_LIST_S
	 */
	public PU_IGT_AERADTC_LIST stAreaList;
	/**
	 * \u505c\u8f66\u4fa6\u6d4b\u5e03\u9632\u8ba1\u5212<br>
	 * C type : PU_ALARM_TIME_LIST_S
	 */
	public PU_ALARM_TIME_PARA_LIST stAlarmTimeList;
	/** C type : CHAR[32] */
	public byte[] szReserved = new byte[32];
	public PU_CARDETECT_PARAM() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("ulChannelId", "bEnable", "ulSensitivity", "ulAlarmTime", "ulParkTimeThr", "stAreaList", "stAlarmTimeList", "szReserved");
	}
	/**
	 * @param ulChannelId \u901a\u9053ID<br>
	 * @param bEnable \u7b97\u6cd5\u4f7f\u80fd<br>
	 * @param ulSensitivity \u7b97\u6cd5\u68c0\u6d4b\u7075\u654f\u5ea6<br>
	 * @param ulAlarmTime \u544a\u8b66\u4e0a\u62a5\u95f4\u9694<br>
	 * @param ulParkTimeThr \u505c\u8f66\u9608\u503c<br>
	 * @param stAreaList \u505c\u8f66\u4fa6\u6d4b\u68c0\u6d4b\u533a\u57df<br>
	 * C type : PU_IGT_AERADTC_LIST_S<br>
	 * @param stAlarmTimeList \u505c\u8f66\u4fa6\u6d4b\u5e03\u9632\u8ba1\u5212<br>
	 * C type : PU_ALARM_TIME_LIST_S<br>
	 * @param szReserved C type : CHAR[32]
	 */
	public PU_CARDETECT_PARAM(NativeLong ulChannelId, boolean bEnable, NativeLong ulSensitivity, NativeLong ulAlarmTime, NativeLong ulParkTimeThr, PU_IGT_AERADTC_LIST stAreaList, PU_ALARM_TIME_PARA_LIST stAlarmTimeList, byte szReserved[]) {
		super();
		this.ulChannelId = ulChannelId;
		this.bEnable = bEnable;
		this.ulSensitivity = ulSensitivity;
		this.ulAlarmTime = ulAlarmTime;
		this.ulParkTimeThr = ulParkTimeThr;
		this.stAreaList = stAreaList;
		this.stAlarmTimeList = stAlarmTimeList;
		if ((szReserved.length != this.szReserved.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szReserved = szReserved;
	}
	public PU_CARDETECT_PARAM(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends PU_CARDETECT_PARAM implements Structure.ByReference {
		
	};
	public static class ByValue extends PU_CARDETECT_PARAM implements Structure.ByValue {
		
	};
}
