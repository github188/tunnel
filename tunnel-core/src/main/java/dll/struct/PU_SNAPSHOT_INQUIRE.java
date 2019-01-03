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
public class PU_SNAPSHOT_INQUIRE extends Structure {
	public NativeLong ulChnID;
	/** \u5f53\u524d\u5f00\u59cb\u8bb0\u5f55\u7d22\u5f15(>=1) */
	public NativeLong ulBeginIndex;
	/** \u5f00\u59cb\u65f6\u95f4(time_t/localTime=GMT+\u65f6\u533a) */
	public NativeLong ulBeginTime;
	/** \u7ed3\u675f\u65f6\u95f4 */
	public NativeLong ulEndTime;
	/**
	 * \u6293\u62cd\u7c7b\u578b<br>
	 * C type : PU_SNAPSHOT_TYPE_E
	 */
	public int enSnapShotType;
	/**
	 * szReserved[0]\u5355\u9875\u67e5\u8be2flag<br>
	 * C type : CHAR[32]
	 */
	public byte[] szReserved = new byte[32];
	public PU_SNAPSHOT_INQUIRE() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("ulChnID", "ulBeginIndex", "ulBeginTime", "ulEndTime", "enSnapShotType", "szReserved");
	}
	/**
	 * @param ulBeginIndex \u5f53\u524d\u5f00\u59cb\u8bb0\u5f55\u7d22\u5f15(>=1)<br>
	 * @param ulBeginTime \u5f00\u59cb\u65f6\u95f4(time_t/localTime=GMT+\u65f6\u533a)<br>
	 * @param ulEndTime \u7ed3\u675f\u65f6\u95f4<br>
	 * @param enSnapShotType \u6293\u62cd\u7c7b\u578b<br>
	 * C type : PU_SNAPSHOT_TYPE_E<br>
	 * @param szReserved szReserved[0]\u5355\u9875\u67e5\u8be2flag<br>
	 * C type : CHAR[32]
	 */
	public PU_SNAPSHOT_INQUIRE(NativeLong ulChnID, NativeLong ulBeginIndex, NativeLong ulBeginTime, NativeLong ulEndTime, int enSnapShotType, byte szReserved[]) {
		super();
		this.ulChnID = ulChnID;
		this.ulBeginIndex = ulBeginIndex;
		this.ulBeginTime = ulBeginTime;
		this.ulEndTime = ulEndTime;
		this.enSnapShotType = enSnapShotType;
		if ((szReserved.length != this.szReserved.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szReserved = szReserved;
	}
	public PU_SNAPSHOT_INQUIRE(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends PU_SNAPSHOT_INQUIRE implements Structure.ByReference {
		
	};
	public static class ByValue extends PU_SNAPSHOT_INQUIRE implements Structure.ByValue {
		
	};
}
