package dll.struct;
import com.sun.jna.Pointer;
import com.sun.jna.Union;
/**
 * <i>native declaration : D:\HWPuSDK.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class PU_GUARD_POINT_PARA extends Union {
	/**
	 * \u9884\u7f6e\u4f4d<br>
	 * C type : PU_PRESET_SCAN_PARA_S
	 */
	public PU_PRESET_SCAN_PARA stPresetPara;
	/**
	 * \u5de1\u822a\u8f68\u8ff9<br>
	 * C type : PU_CRUISE_SCAN_PARA_S
	 */
	public PU_CRUISE_SCAN_PARA stCruisePara;
	/**
	 * \u82b1\u6837\u626b\u63cf<br>
	 * C type : PU_USER_DEFINED_SCAN_PARA_S
	 */
	public PU_USER_DEFINED_SCAN_PARA stUserDefinedPara;
	/**
	 * \u6c34\u5e73\u626b\u63cf<br>
	 * C type : PU_HORIZONTAL_SCAN_PARA_S
	 */
	public PU_HORIZONTAL_SCAN_PARA stHorPara;
	/**
	 * \u5e27\u626b\u63cf<br>
	 * C type : PU_FRAME_SCAN_PARA_S
	 */
	public PU_FRAME_SCAN_PARA stFramePara;
	/**
	 * \u968f\u673a\u626b\u63cf<br>
	 * C type : PU_RANDOM_SCAN_PARA_S
	 */
	public PU_RANDOM_SCAN_PARA stRandomPara;
	/**
	 * \u5168\u666f\u626b\u63cf<br>
	 * C type : PU_PANORAMA_SCAN_PARA_S
	 */
	public PU_PANORAMA_SCAN_PARA stPanoramePara;
	/**
	 * \u5782\u76f4\u626b\u63cf<br>
	 * C type : PU_VERTICAL_SCAN_PARA_S
	 */
	public PU_VERTICAL_SCAN_PARA stVerticalPara;
	public PU_GUARD_POINT_PARA() {
		super();
	}
	/**
	 * @param stPresetPara \u9884\u7f6e\u4f4d<br>
	 * C type : PU_PRESET_SCAN_PARA_S
	 */
	public PU_GUARD_POINT_PARA(PU_PRESET_SCAN_PARA stPresetPara) {
		super();
		this.stPresetPara = stPresetPara;
		setType(PU_PRESET_SCAN_PARA.class);
	}
	/**
	 * @param stCruisePara \u5de1\u822a\u8f68\u8ff9<br>
	 * C type : PU_CRUISE_SCAN_PARA_S
	 */
	public PU_GUARD_POINT_PARA(PU_CRUISE_SCAN_PARA stCruisePara) {
		super();
		this.stCruisePara = stCruisePara;
		setType(PU_CRUISE_SCAN_PARA.class);
	}
	/**
	 * @param stUserDefinedPara \u82b1\u6837\u626b\u63cf<br>
	 * C type : PU_USER_DEFINED_SCAN_PARA_S
	 */
	public PU_GUARD_POINT_PARA(PU_USER_DEFINED_SCAN_PARA stUserDefinedPara) {
		super();
		this.stUserDefinedPara = stUserDefinedPara;
		setType(PU_USER_DEFINED_SCAN_PARA.class);
	}
	/**
	 * @param stHorPara \u6c34\u5e73\u626b\u63cf<br>
	 * C type : PU_HORIZONTAL_SCAN_PARA_S
	 */
	public PU_GUARD_POINT_PARA(PU_HORIZONTAL_SCAN_PARA stHorPara) {
		super();
		this.stHorPara = stHorPara;
		setType(PU_HORIZONTAL_SCAN_PARA.class);
	}
	/**
	 * @param stFramePara \u5e27\u626b\u63cf<br>
	 * C type : PU_FRAME_SCAN_PARA_S
	 */
	public PU_GUARD_POINT_PARA(PU_FRAME_SCAN_PARA stFramePara) {
		super();
		this.stFramePara = stFramePara;
		setType(PU_FRAME_SCAN_PARA.class);
	}
	/**
	 * @param stRandomPara \u968f\u673a\u626b\u63cf<br>
	 * C type : PU_RANDOM_SCAN_PARA_S
	 */
	public PU_GUARD_POINT_PARA(PU_RANDOM_SCAN_PARA stRandomPara) {
		super();
		this.stRandomPara = stRandomPara;
		setType(PU_RANDOM_SCAN_PARA.class);
	}
	/**
	 * @param stPanoramePara \u5168\u666f\u626b\u63cf<br>
	 * C type : PU_PANORAMA_SCAN_PARA_S
	 */
	public PU_GUARD_POINT_PARA(PU_PANORAMA_SCAN_PARA stPanoramePara) {
		super();
		this.stPanoramePara = stPanoramePara;
		setType(PU_PANORAMA_SCAN_PARA.class);
	}
	/**
	 * @param stVerticalPara \u5782\u76f4\u626b\u63cf<br>
	 * C type : PU_VERTICAL_SCAN_PARA_S
	 */
	public PU_GUARD_POINT_PARA(PU_VERTICAL_SCAN_PARA stVerticalPara) {
		super();
		this.stVerticalPara = stVerticalPara;
		setType(PU_VERTICAL_SCAN_PARA.class);
	}
	public PU_GUARD_POINT_PARA(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends PU_GUARD_POINT_PARA implements com.sun.jna.Structure.ByReference {
		
	};
	public static class ByValue extends PU_GUARD_POINT_PARA implements com.sun.jna.Structure.ByValue {
		
	};
}
