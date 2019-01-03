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
public class PU_NOISE_REDUCTION extends Structure {
	/** \u901a\u9053\u53f7 */
	public NativeLong ulChannelId;
	/**
	 * \u964d\u566a\u6a21\u5f0f<br>
	 * C type : PU_NOISE_REDUCTION_MODE_E
	 */
	public int enNoiseReductionMode;
	/** \u666e\u901a\u6a21\u5f0f\u964d\u566a\u7cfb\u6570 */
	public NativeLong ulNRLevel;
	/** \u4e13\u5bb6\u6a21\u5f0f\u7a7a\u57df\u964d\u566a\u7cfb\u6570 */
	public NativeLong ulSfcLevel;
	/** \u4e13\u5bb6\u6a21\u5f0f\u65f6\u57df\u964d\u566a\u7cfb\u6570 */
	public NativeLong ulTfcLevel;
	/**
	 * \u9884\u7559\u5b57\u6bb5<br>
	 * C type : CHAR[32]
	 */
	public byte[] szReserved = new byte[32];
	public PU_NOISE_REDUCTION() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("ulChannelId", "enNoiseReductionMode", "ulNRLevel", "ulSfcLevel", "ulTfcLevel", "szReserved");
	}
	/**
	 * @param ulChannelId \u901a\u9053\u53f7<br>
	 * @param enNoiseReductionMode \u964d\u566a\u6a21\u5f0f<br>
	 * C type : PU_NOISE_REDUCTION_MODE_E<br>
	 * @param ulNRLevel \u666e\u901a\u6a21\u5f0f\u964d\u566a\u7cfb\u6570<br>
	 * @param ulSfcLevel \u4e13\u5bb6\u6a21\u5f0f\u7a7a\u57df\u964d\u566a\u7cfb\u6570<br>
	 * @param ulTfcLevel \u4e13\u5bb6\u6a21\u5f0f\u65f6\u57df\u964d\u566a\u7cfb\u6570<br>
	 * @param szReserved \u9884\u7559\u5b57\u6bb5<br>
	 * C type : CHAR[32]
	 */
	public PU_NOISE_REDUCTION(NativeLong ulChannelId, int enNoiseReductionMode, NativeLong ulNRLevel, NativeLong ulSfcLevel, NativeLong ulTfcLevel, byte szReserved[]) {
		super();
		this.ulChannelId = ulChannelId;
		this.enNoiseReductionMode = enNoiseReductionMode;
		this.ulNRLevel = ulNRLevel;
		this.ulSfcLevel = ulSfcLevel;
		this.ulTfcLevel = ulTfcLevel;
		if ((szReserved.length != this.szReserved.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szReserved = szReserved;
	}
	public PU_NOISE_REDUCTION(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends PU_NOISE_REDUCTION implements Structure.ByReference {
		
	};
	public static class ByValue extends PU_NOISE_REDUCTION implements Structure.ByValue {
		
	};
}
