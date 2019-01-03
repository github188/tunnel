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
public class PU_PIC_OSD_PARA_V2 extends Structure {
	/** \u901a\u9053ID */
	public NativeLong ulChnID;
	/**
	 * \u53e0\u52a0OSD\u7684\u56fe\u7247\u7c7b\u578b<br>
	 * C type : PU_OVERLAY_PIC_TYPE_E
	 */
	public int enOverlayPicType;
	/**
	 * \u56fe\u7247\u53e0\u52a0\u4fe1\u606f<br>
	 * C type : PU_PIC_OSD_INFO_S
	 */
	public PU_PIC_OSD_INFO_S stPicOSDInfo;
	/**
	 * \u65f6\u95f4OSD\u53c2\u6570<br>
	 * C type : PU_TIME_OSD_PARA_S
	 */
	public PU_TIME_OSD_PARA stTimeOSDPara;
	/**
	 * \u8def\u53e3\u7f16\u53f7\u53c2\u6570<br>
	 * C type : PU_CUSTOM_OSD_PARA_S
	 */
	public PU_CUSTOM_OSD_PARA stRoadIdOSDPara;
	/**
	 * \u8bbe\u5907\u7f16\u53f7\u53c2\u6570<br>
	 * C type : PU_CUSTOM_OSD_PARA_S
	 */
	public PU_CUSTOM_OSD_PARA stDevIdOSDPara;
	/**
	 * \u65b9\u5411\u7f16\u53f7\u53c2\u6570<br>
	 * C type : PU_CUSTOM_OSD_PARA_S
	 */
	public PU_CUSTOM_OSD_PARA stDirIdOSDPara;
	/**
	 * \u65b9\u5411OSD\u53c2\u6570<br>
	 * C type : PU_CUSTOM_OSD_PARA_S
	 */
	public PU_CUSTOM_OSD_PARA stDirOSDPara;
	/**
	 * \u81ea\u5b9a\u4e49OSD\u53c2\u6570<br>
	 * C type : PU_CUSTOM_OSD_PARA_S
	 */
	public PU_CUSTOM_OSD_PARA stCustomOSDPara;
	/** \u884c\u9a76\u65b9\u5411\u53c2\u6570\u4f7f\u80fd\uff0c1:\u8868\u793aITS\uff0c\u4e0d\u91c7\u7528\u65b9\u5411OSD\u53c2\u6570 0:\u5176\u4ed6\uff0c\u91c7\u7528\u65b9\u5411OSD\u53c2\u6570 */
	public boolean bDirOSDParaEn;
	/** C type : CHAR[32] */
	public byte[] szReserved = new byte[32];
	public PU_PIC_OSD_PARA_V2() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("ulChnID", "enOverlayPicType", "stPicOSDInfo", "stTimeOSDPara", "stRoadIdOSDPara", "stDevIdOSDPara", "stDirIdOSDPara", "stDirOSDPara", "stCustomOSDPara", "bDirOSDParaEn", "szReserved");
	}
	public PU_PIC_OSD_PARA_V2(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends PU_PIC_OSD_PARA_V2 implements Structure.ByReference {
		
	};
	public static class ByValue extends PU_PIC_OSD_PARA_V2 implements Structure.ByValue {
		
	};
}