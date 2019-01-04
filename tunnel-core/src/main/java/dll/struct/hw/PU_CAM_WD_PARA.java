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
public class PU_CAM_WD_PARA extends Structure {
	/**
	 * \u5f00\u5173(\u5173\u95ed\u3001\u6253\u5f00\u3001\u81ea\u52a8)<br>
	 * C type : PU_COMMONMODE_SWITCH_E
	 */
	public int enSwitchMode;
	/**
	 * \u5bbd\u52a8\u6001\u6a21\u5f0f  \u4e3aWD_MODE_RATIOFIX\u503c\u9700\u8981\u8bbe\u7f6elExpRatio<br>
	 * C type : PU_VIDEO_WD_MODE_E
	 */
	public int enWDMode;
	/** \u7d22\u5c3c\uff1ax1~x64,\u65e5\u7acb\uff1a127 */
	public NativeLong lExpRatio;
	/** \u5728\u81ea\u52a8\u5bbd\u52a8\u6001\u6a21\u5f0f\u4e0b\u6700\u5927\u7684\u66dd\u5149\u6bd4\u4f8b\u503c TI:1~16\uff0c\u9ed8\u8ba48 */
	public NativeLong ulAutoModeMaxExpRatio;
	/** C type : CHAR[32] */
	public byte[] szReserve = new byte[32];
	public PU_CAM_WD_PARA() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("enSwitchMode", "enWDMode", "lExpRatio", "ulAutoModeMaxExpRatio", "szReserve");
	}
	/**
	 * @param enSwitchMode \u5f00\u5173(\u5173\u95ed\u3001\u6253\u5f00\u3001\u81ea\u52a8)<br>
	 * C type : PU_COMMONMODE_SWITCH_E<br>
	 * @param enWDMode \u5bbd\u52a8\u6001\u6a21\u5f0f  \u4e3aWD_MODE_RATIOFIX\u503c\u9700\u8981\u8bbe\u7f6elExpRatio<br>
	 * C type : PU_VIDEO_WD_MODE_E<br>
	 * @param lExpRatio \u7d22\u5c3c\uff1ax1~x64,\u65e5\u7acb\uff1a127<br>
	 * @param ulAutoModeMaxExpRatio \u5728\u81ea\u52a8\u5bbd\u52a8\u6001\u6a21\u5f0f\u4e0b\u6700\u5927\u7684\u66dd\u5149\u6bd4\u4f8b\u503c TI:1~16\uff0c\u9ed8\u8ba48<br>
	 * @param szReserve C type : CHAR[32]
	 */
	public PU_CAM_WD_PARA(int enSwitchMode, int enWDMode, NativeLong lExpRatio, NativeLong ulAutoModeMaxExpRatio, byte szReserve[]) {
		super();
		this.enSwitchMode = enSwitchMode;
		this.enWDMode = enWDMode;
		this.lExpRatio = lExpRatio;
		this.ulAutoModeMaxExpRatio = ulAutoModeMaxExpRatio;
		if ((szReserve.length != this.szReserve.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szReserve = szReserve;
	}
	public PU_CAM_WD_PARA(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends PU_CAM_WD_PARA implements Structure.ByReference {
		
	};
	public static class ByValue extends PU_CAM_WD_PARA implements Structure.ByValue {
		
	};
}