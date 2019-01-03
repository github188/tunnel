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
public class PU_FACE_INFO_DELETE_S extends Structure {
	/** \u901a\u9053ID */
	public NativeLong ulChannelId;
	/**
	 * \u540d\u5355\u5e93<br>
	 * C type : PU_FACE_LIB_S
	 */
	public PU_FACE_LIB_S stFacelib;
	/** \u9700\u8981\u5220\u9664\u7684\u6570\u76ee */
	public int uFaceNum;
	/**
	 * \u9700\u8981\u5220\u9664\u7684\u4eba\u8138id<br>
	 * C type : UINT[(100)]
	 */
	public int[] uFaceID = new int[100];
	/** C type : CHAR[32] */
	public byte[] szReserve = new byte[32];
	public PU_FACE_INFO_DELETE_S() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("ulChannelId", "stFacelib", "uFaceNum", "uFaceID", "szReserve");
	}
	/**
	 * @param ulChannelId \u901a\u9053ID<br>
	 * @param stFacelib \u540d\u5355\u5e93<br>
	 * C type : PU_FACE_LIB_S<br>
	 * @param uFaceNum \u9700\u8981\u5220\u9664\u7684\u6570\u76ee<br>
	 * @param uFaceID \u9700\u8981\u5220\u9664\u7684\u4eba\u8138id<br>
	 * C type : UINT[(100)]<br>
	 * @param szReserve C type : CHAR[32]
	 */
	public PU_FACE_INFO_DELETE_S(NativeLong ulChannelId, PU_FACE_LIB_S stFacelib, int uFaceNum, int uFaceID[], byte szReserve[]) {
		super();
		this.ulChannelId = ulChannelId;
		this.stFacelib = stFacelib;
		this.uFaceNum = uFaceNum;
		if ((uFaceID.length != this.uFaceID.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.uFaceID = uFaceID;
		if ((szReserve.length != this.szReserve.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szReserve = szReserve;
	}
	public PU_FACE_INFO_DELETE_S(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends PU_FACE_INFO_DELETE_S implements Structure.ByReference {
		
	};
	public static class ByValue extends PU_FACE_INFO_DELETE_S implements Structure.ByValue {
		
	};
}
