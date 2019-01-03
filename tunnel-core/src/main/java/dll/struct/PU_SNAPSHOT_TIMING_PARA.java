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
public class PU_SNAPSHOT_TIMING_PARA extends Structure {
	/** \u662f\u5426\u542f\u7528\u5b9a\u65f6\u6293\u62cd\u529f\u80fd */
	public boolean bEnable;
	/** \u901a\u9053ID */
	public NativeLong ulChannelID;
	/** \u7801\u6d41ID */
	public NativeLong ulStreamID;
	/** \u6293\u62cd\u95f4\u9694(\u79d2) */
	public NativeLong ulSnapCount;
	/**
	 * \u56fe\u7247\u683c\u5f0f<br>
	 * C type : PU_SNAPSHOT_FORMAT_E
	 */
	public int enPictureFormat;
	/**
	 * \u9884\u7559\u5b57\u6bb5<br>
	 * C type : CHAR[32]
	 */
	public byte[] szReserved = new byte[32];
	public PU_SNAPSHOT_TIMING_PARA() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("bEnable", "ulChannelID", "ulStreamID", "ulSnapCount", "enPictureFormat", "szReserved");
	}
	/**
	 * @param bEnable \u662f\u5426\u542f\u7528\u5b9a\u65f6\u6293\u62cd\u529f\u80fd<br>
	 * @param ulChannelID \u901a\u9053ID<br>
	 * @param ulStreamID \u7801\u6d41ID<br>
	 * @param ulSnapCount \u6293\u62cd\u95f4\u9694(\u79d2)<br>
	 * @param enPictureFormat \u56fe\u7247\u683c\u5f0f<br>
	 * C type : PU_SNAPSHOT_FORMAT_E<br>
	 * @param szReserved \u9884\u7559\u5b57\u6bb5<br>
	 * C type : CHAR[32]
	 */
	public PU_SNAPSHOT_TIMING_PARA(boolean bEnable, NativeLong ulChannelID, NativeLong ulStreamID, NativeLong ulSnapCount, int enPictureFormat, byte szReserved[]) {
		super();
		this.bEnable = bEnable;
		this.ulChannelID = ulChannelID;
		this.ulStreamID = ulStreamID;
		this.ulSnapCount = ulSnapCount;
		this.enPictureFormat = enPictureFormat;
		if ((szReserved.length != this.szReserved.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szReserved = szReserved;
	}
	public PU_SNAPSHOT_TIMING_PARA(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends PU_SNAPSHOT_TIMING_PARA implements Structure.ByReference {
		
	};
	public static class ByValue extends PU_SNAPSHOT_TIMING_PARA implements Structure.ByValue {
		
	};
}
