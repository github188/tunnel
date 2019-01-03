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
public class PU_IGT_AREA_ITEM extends Structure {
	public NativeLong ulChannelId;
	/** C type : PU_IGT_AREA_ALARM_TYPE_E */
	public int enAlarmAeraType;
	/** C type : PU_IGT_OPT_TYPE_E */
	public int enOptType;
	/** C type : PU_IGT_AREA_S */
	public PU_IGT_AREA stIgtArea;
	/** C type : CHAR[32] */
	public byte[] szReserved = new byte[32];
	public PU_IGT_AREA_ITEM() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("ulChannelId", "enAlarmAeraType", "enOptType", "stIgtArea", "szReserved");
	}
	/**
	 * @param enAlarmAeraType C type : PU_IGT_AREA_ALARM_TYPE_E<br>
	 * @param enOptType C type : PU_IGT_OPT_TYPE_E<br>
	 * @param stIgtArea C type : PU_IGT_AREA_S<br>
	 * @param szReserved C type : CHAR[32]
	 */
	public PU_IGT_AREA_ITEM(NativeLong ulChannelId, int enAlarmAeraType, int enOptType, PU_IGT_AREA stIgtArea, byte szReserved[]) {
		super();
		this.ulChannelId = ulChannelId;
		this.enAlarmAeraType = enAlarmAeraType;
		this.enOptType = enOptType;
		this.stIgtArea = stIgtArea;
		if ((szReserved.length != this.szReserved.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szReserved = szReserved;
	}
	public PU_IGT_AREA_ITEM(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends PU_IGT_AREA_ITEM implements Structure.ByReference {
		
	};
	public static class ByValue extends PU_IGT_AREA_ITEM implements Structure.ByValue {
		
	};
}
