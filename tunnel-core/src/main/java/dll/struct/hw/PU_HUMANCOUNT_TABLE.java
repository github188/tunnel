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
public class PU_HUMANCOUNT_TABLE extends Structure {
	/** \u901a\u9053ID */
	public NativeLong ulChannelId;
	/**
	 * \u62a5\u544a\u7c7b\u578b<br>
	 * C type : PU_TABLE_TYPE_E
	 */
	public int enTableType;
	/**
	 * \u8fdb\u5165\u65b9\u5411(\u82e5\u987a\u65f6\u9488\u8d8a\u7ebf\u4e3a\u8fdb,\u82e5\u9006\u65f6\u9488\u8d8a\u7ebf\u4e3a\u51fa)<br>
	 * C type : PU_TRIPWIRE_DIR_E
	 */
	public int enInDir;
	/** \u67e5\u8be2\u8bb0\u5f55\u7684\u6761\u6570 */
	public NativeLong ulRecordNum;
	/**
	 * \u5404\u65f6\u95f4\u6bb5\u8fc7\u7ebf\u4eba\u6570\u8868<br>
	 * C type : PU_HUMANCOUT_RECORD[32]
	 */
	public PU_HUMANCOUT_RECORD[] astTable = new PU_HUMANCOUT_RECORD[32];
	/** C type : CHAR[32] */
	public byte[] szReserved = new byte[32];
	public PU_HUMANCOUNT_TABLE() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("ulChannelId", "enTableType", "enInDir", "ulRecordNum", "astTable", "szReserved");
	}
	/**
	 * @param ulChannelId \u901a\u9053ID<br>
	 * @param enTableType \u62a5\u544a\u7c7b\u578b<br>
	 * C type : PU_TABLE_TYPE_E<br>
	 * @param enInDir \u8fdb\u5165\u65b9\u5411(\u82e5\u987a\u65f6\u9488\u8d8a\u7ebf\u4e3a\u8fdb,\u82e5\u9006\u65f6\u9488\u8d8a\u7ebf\u4e3a\u51fa)<br>
	 * C type : PU_TRIPWIRE_DIR_E<br>
	 * @param ulRecordNum \u67e5\u8be2\u8bb0\u5f55\u7684\u6761\u6570<br>
	 * @param astTable \u5404\u65f6\u95f4\u6bb5\u8fc7\u7ebf\u4eba\u6570\u8868<br>
	 * C type : PU_HUMANCOUT_RECORD[32]<br>
	 * @param szReserved C type : CHAR[32]
	 */
	public PU_HUMANCOUNT_TABLE(NativeLong ulChannelId, int enTableType, int enInDir, NativeLong ulRecordNum, PU_HUMANCOUT_RECORD astTable[], byte szReserved[]) {
		super();
		this.ulChannelId = ulChannelId;
		this.enTableType = enTableType;
		this.enInDir = enInDir;
		this.ulRecordNum = ulRecordNum;
		if ((astTable.length != this.astTable.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.astTable = astTable;
		if ((szReserved.length != this.szReserved.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szReserved = szReserved;
	}
	public PU_HUMANCOUNT_TABLE(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends PU_HUMANCOUNT_TABLE implements Structure.ByReference {
		
	};
	public static class ByValue extends PU_HUMANCOUNT_TABLE implements Structure.ByValue {
		
	};
}
