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
public class PU_HV_ALARM_PARA extends Structure {
	/** \u901a\u9053ID */
	public NativeLong ulChannelId;
	/** \u4f7f\u80fd */
	public boolean bEnable;
	public PU_HV_ALARM_PARA() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("ulChannelId", "bEnable");
	}
	/**
	 * @param ulChannelId \u901a\u9053ID<br>
	 * @param bEnable \u4f7f\u80fd
	 */
	public PU_HV_ALARM_PARA(NativeLong ulChannelId, boolean bEnable) {
		super();
		this.ulChannelId = ulChannelId;
		this.bEnable = bEnable;
	}
	public PU_HV_ALARM_PARA(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends PU_HV_ALARM_PARA implements Structure.ByReference {
		
	};
	public static class ByValue extends PU_HV_ALARM_PARA implements Structure.ByValue {
		
	};
}
