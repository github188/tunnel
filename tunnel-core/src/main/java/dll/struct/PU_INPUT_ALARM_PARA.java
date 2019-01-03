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
public class PU_INPUT_ALARM_PARA extends Structure {
	/** \u544a\u8b66\u8bbe\u5907ID */
	public NativeLong ulDeviceId;
	/**
	 * \u544a\u8b66\u8bbe\u5907\u540d\u79f0<br>
	 * C type : CHAR[(32 + 4)]
	 */
	public byte[] szName = new byte[32 + 4];
	/** \u4f7f\u80fd */
	public NativeLong lEnable;
	/** \u5e38\u5f00\uff0c\u5e38\u95ed\uff0c0\uff1a\u5e38\u5f00\uff0c1\uff1a\u5e38\u95ed */
	public NativeLong ulType;
	/** \u544a\u8b66\u68c0\u6d4b\u65f6\u95f4\u95f4\u96941~256,\u6bcfx\u79d2\u68c0\u6d4b\u4e00\u6b21\u662f\u5426\u5728\u544a\u8b66\u72b6\u6001 */
	public NativeLong ulDeteInterval;
	/** C type : PU_ALARM_TIME_LIST_S */
	public PU_ALARM_TIME_PARA_LIST stAlarmTimeList;
	public PU_INPUT_ALARM_PARA() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("ulDeviceId", "szName", "lEnable", "ulType", "ulDeteInterval", "stAlarmTimeList");
	}
	/**
	 * @param ulDeviceId \u544a\u8b66\u8bbe\u5907ID<br>
	 * @param szName \u544a\u8b66\u8bbe\u5907\u540d\u79f0<br>
	 * C type : CHAR[(32 + 4)]<br>
	 * @param lEnable \u4f7f\u80fd<br>
	 * @param ulType \u5e38\u5f00\uff0c\u5e38\u95ed\uff0c0\uff1a\u5e38\u5f00\uff0c1\uff1a\u5e38\u95ed<br>
	 * @param ulDeteInterval \u544a\u8b66\u68c0\u6d4b\u65f6\u95f4\u95f4\u96941~256,\u6bcfx\u79d2\u68c0\u6d4b\u4e00\u6b21\u662f\u5426\u5728\u544a\u8b66\u72b6\u6001<br>
	 * @param stAlarmTimeList C type : PU_ALARM_TIME_LIST_S
	 */
	public PU_INPUT_ALARM_PARA(NativeLong ulDeviceId, byte szName[], NativeLong lEnable, NativeLong ulType, NativeLong ulDeteInterval, PU_ALARM_TIME_PARA_LIST stAlarmTimeList) {
		super();
		this.ulDeviceId = ulDeviceId;
		if ((szName.length != this.szName.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szName = szName;
		this.lEnable = lEnable;
		this.ulType = ulType;
		this.ulDeteInterval = ulDeteInterval;
		this.stAlarmTimeList = stAlarmTimeList;
	}
	public PU_INPUT_ALARM_PARA(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends PU_INPUT_ALARM_PARA implements Structure.ByReference {
		
	};
	public static class ByValue extends PU_INPUT_ALARM_PARA implements Structure.ByValue {
		
	};
}
