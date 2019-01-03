package dll.struct;
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
public class PU_PLATE_INFO extends Structure {
	/** \u662f\u5426\u6293\u62cd\u5230\u8f66\u724c */
	public boolean bHavePlate;
	/** \u8f66\u724c\u7f6e\u4fe1\u5ea6 */
	public int iConfidence;
	/** \u8f66\u724c\u5b57\u7b26\u6570 */
	public int iPlateCharNum;
	/**
	 * \u8f66\u724c\u5b57\u7b26<br>
	 * C type : CHAR[24]
	 */
	public byte[] szPlateChar = new byte[24];
	/**
	 * \u8f66\u724c\u4f4d\u7f6e<br>
	 * C type : PU_AREA_INFO_S
	 */
	public PU_AREA_INFO stPlateLoc;
	/**
	 * \u8f66\u724c\u7c7b\u578b<br>
	 * C type : PU_PLATE_TYPE_E
	 */
	public int enPlateType;
	/**
	 * \u8f66\u724c\u989c\u8272<br>
	 * C type : PU_PLATE_COLOR_E
	 */
	public int enPlateColor;
	/**
	 * \u8f66\u724c\u79fb\u52a8\u65b9\u5411<br>
	 * C type : PU_PLATE_DIR_E
	 */
	public int enMoveDir;
	/**
	 * \u9884\u7559\u5b57\u6bb5<br>
	 * C type : CHAR[64]
	 */
	public byte[] szReserved = new byte[64];
	public PU_PLATE_INFO() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("bHavePlate", "iConfidence", "iPlateCharNum", "szPlateChar", "stPlateLoc", "enPlateType", "enPlateColor", "enMoveDir", "szReserved");
	}
	/**
	 * @param bHavePlate \u662f\u5426\u6293\u62cd\u5230\u8f66\u724c<br>
	 * @param iConfidence \u8f66\u724c\u7f6e\u4fe1\u5ea6<br>
	 * @param iPlateCharNum \u8f66\u724c\u5b57\u7b26\u6570<br>
	 * @param szPlateChar \u8f66\u724c\u5b57\u7b26<br>
	 * C type : CHAR[24]<br>
	 * @param stPlateLoc \u8f66\u724c\u4f4d\u7f6e<br>
	 * C type : PU_AREA_INFO_S<br>
	 * @param enPlateType \u8f66\u724c\u7c7b\u578b<br>
	 * C type : PU_PLATE_TYPE_E<br>
	 * @param enPlateColor \u8f66\u724c\u989c\u8272<br>
	 * C type : PU_PLATE_COLOR_E<br>
	 * @param enMoveDir \u8f66\u724c\u79fb\u52a8\u65b9\u5411<br>
	 * C type : PU_PLATE_DIR_E<br>
	 * @param szReserved \u9884\u7559\u5b57\u6bb5<br>
	 * C type : CHAR[64]
	 */
	public PU_PLATE_INFO(boolean bHavePlate, int iConfidence, int iPlateCharNum, byte szPlateChar[], PU_AREA_INFO stPlateLoc, int enPlateType, int enPlateColor, int enMoveDir, byte szReserved[]) {
		super();
		this.bHavePlate = bHavePlate;
		this.iConfidence = iConfidence;
		this.iPlateCharNum = iPlateCharNum;
		if ((szPlateChar.length != this.szPlateChar.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szPlateChar = szPlateChar;
		this.stPlateLoc = stPlateLoc;
		this.enPlateType = enPlateType;
		this.enPlateColor = enPlateColor;
		this.enMoveDir = enMoveDir;
		if ((szReserved.length != this.szReserved.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szReserved = szReserved;
	}
	public PU_PLATE_INFO(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends PU_PLATE_INFO implements Structure.ByReference {
		
	};
	public static class ByValue extends PU_PLATE_INFO implements Structure.ByValue {
		
	};
}
