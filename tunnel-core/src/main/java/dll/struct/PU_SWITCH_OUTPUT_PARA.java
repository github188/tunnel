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
public class PU_SWITCH_OUTPUT_PARA extends Structure {
	public NativeLong ulOutputId;
	/**
	 * \u540d\u79f0\uff0c\u6700\u5927\u652f\u630132\u5b57\u8282<br>
	 * C type : CHAR[(32 + 4)]
	 */
	public byte[] szOutputName = new byte[32 + 4];
	/** \u4fdd\u6301\u65f6\u95f4 1-600  \u9ed8\u8ba410\u79d2 */
	public NativeLong ulHoldTime;
	/** C type : CHAR[32] */
	public byte[] szReserved = new byte[32];
	public PU_SWITCH_OUTPUT_PARA() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("ulOutputId", "szOutputName", "ulHoldTime", "szReserved");
	}
	/**
	 * @param szOutputName \u540d\u79f0\uff0c\u6700\u5927\u652f\u630132\u5b57\u8282<br>
	 * C type : CHAR[(32 + 4)]<br>
	 * @param ulHoldTime \u4fdd\u6301\u65f6\u95f4 1-600  \u9ed8\u8ba410\u79d2<br>
	 * @param szReserved C type : CHAR[32]
	 */
	public PU_SWITCH_OUTPUT_PARA(NativeLong ulOutputId, byte szOutputName[], NativeLong ulHoldTime, byte szReserved[]) {
		super();
		this.ulOutputId = ulOutputId;
		if ((szOutputName.length != this.szOutputName.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szOutputName = szOutputName;
		this.ulHoldTime = ulHoldTime;
		if ((szReserved.length != this.szReserved.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szReserved = szReserved;
	}
	public PU_SWITCH_OUTPUT_PARA(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends PU_SWITCH_OUTPUT_PARA implements Structure.ByReference {
		
	};
	public static class ByValue extends PU_SWITCH_OUTPUT_PARA implements Structure.ByValue {
		
	};
}
