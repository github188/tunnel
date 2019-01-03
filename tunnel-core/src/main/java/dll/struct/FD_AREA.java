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
public class FD_AREA extends Structure {
	public boolean bEnable;
	public int uiPointNum;
	/** C type : PU_SQUARE_PARA_S[(12)] */
	public PU_SQUARE_PARA[] stPoint = new PU_SQUARE_PARA[12];
	/** C type : CHAR[(36)] */
	public byte[] szAreaName = new byte[36];
	public FD_AREA() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("bEnable", "uiPointNum", "stPoint", "szAreaName");
	}
	/**
	 * @param stPoint C type : PU_SQUARE_PARA_S[(12)]<br>
	 * @param szAreaName C type : CHAR[(36)]
	 */
	public FD_AREA(boolean bEnable, int uiPointNum, PU_SQUARE_PARA stPoint[], byte szAreaName[]) {
		super();
		this.bEnable = bEnable;
		this.uiPointNum = uiPointNum;
		if ((stPoint.length != this.stPoint.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.stPoint = stPoint;
		if ((szAreaName.length != this.szAreaName.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szAreaName = szAreaName;
	}
	public FD_AREA(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends FD_AREA implements Structure.ByReference {
		
	};
	public static class ByValue extends FD_AREA implements Structure.ByValue {
		
	};
}
