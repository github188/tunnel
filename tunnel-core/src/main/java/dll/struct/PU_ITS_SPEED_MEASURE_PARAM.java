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
public class PU_ITS_SPEED_MEASURE_PARAM extends Structure {
	/** \u901a\u9053ID */
	public NativeLong ulChannelId;
	/** \u6444\u50cf\u673a\u8ddd\u79bb\u5730\u9762\u4eae\u5ea6H */
	public int iCameraHeightH;
	/** \u89c6\u91ce\u56fe\u50cf\u4e0b\u6cbf\u5230\u6444\u50cf\u673a\u6240\u5728\u5730\u9762\u8fb9\u7ebfL1 */
	public int iImageBottom2CameraL1;
	/** \u89c6\u91ce\u56fe\u50cf\u4e2d\u95f4\u5230\u6444\u50cf\u673a\u6240\u5728\u5730\u9762\u8fb9\u7ebfL2 */
	public int iImageCenter2CameraL2;
	/** C type : CHAR[32] */
	public byte[] szReserve = new byte[32];
	public PU_ITS_SPEED_MEASURE_PARAM() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("ulChannelId", "iCameraHeightH", "iImageBottom2CameraL1", "iImageCenter2CameraL2", "szReserve");
	}
	/**
	 * @param ulChannelId \u901a\u9053ID<br>
	 * @param iCameraHeightH \u6444\u50cf\u673a\u8ddd\u79bb\u5730\u9762\u4eae\u5ea6H<br>
	 * @param iImageBottom2CameraL1 \u89c6\u91ce\u56fe\u50cf\u4e0b\u6cbf\u5230\u6444\u50cf\u673a\u6240\u5728\u5730\u9762\u8fb9\u7ebfL1<br>
	 * @param iImageCenter2CameraL2 \u89c6\u91ce\u56fe\u50cf\u4e2d\u95f4\u5230\u6444\u50cf\u673a\u6240\u5728\u5730\u9762\u8fb9\u7ebfL2<br>
	 * @param szReserve C type : CHAR[32]
	 */
	public PU_ITS_SPEED_MEASURE_PARAM(NativeLong ulChannelId, int iCameraHeightH, int iImageBottom2CameraL1, int iImageCenter2CameraL2, byte szReserve[]) {
		super();
		this.ulChannelId = ulChannelId;
		this.iCameraHeightH = iCameraHeightH;
		this.iImageBottom2CameraL1 = iImageBottom2CameraL1;
		this.iImageCenter2CameraL2 = iImageCenter2CameraL2;
		if ((szReserve.length != this.szReserve.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szReserve = szReserve;
	}
	public PU_ITS_SPEED_MEASURE_PARAM(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends PU_ITS_SPEED_MEASURE_PARAM implements Structure.ByReference {
		
	};
	public static class ByValue extends PU_ITS_SPEED_MEASURE_PARAM implements Structure.ByValue {
		
	};
}
