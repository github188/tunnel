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
public class PU_DEC_AUDIO_INFO extends Structure {
	/**
	 * \u97f3\u9891\u7aef\u53e3\u7c7b\u578b<br>
	 * C type : PU_AUDIO_PORT_TYPE_E
	 */
	public int enAudioPortType;
	/** \u97f3\u9891\u7aef\u53e3\u4f7f\u80fd\u4e0e\u5426 */
	public boolean bEnable;
	/** \u97f3\u9891\u89e3\u7801\u7684\u901a\u9053\u53f7 */
	public NativeLong ulChannelId;
	/**
	 * \u97f3\u9891\u89e3\u7801\u7c7b\u578b<br>
	 * C type : PU_ENCODE_TYPE_E
	 */
	public int enAudioDecodeType;
	/** \u97f3\u91cf */
	public NativeLong ulAudioVolume;
	/**
	 * \u97f3\u9891\u91c7\u6837\u7387<br>
	 * C type : PU_AUDIO_SAMPLERATE_E
	 */
	public int enAudioSampleRate;
	public PU_DEC_AUDIO_INFO() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("enAudioPortType", "bEnable", "ulChannelId", "enAudioDecodeType", "ulAudioVolume", "enAudioSampleRate");
	}
	/**
	 * @param enAudioPortType \u97f3\u9891\u7aef\u53e3\u7c7b\u578b<br>
	 * C type : PU_AUDIO_PORT_TYPE_E<br>
	 * @param bEnable \u97f3\u9891\u7aef\u53e3\u4f7f\u80fd\u4e0e\u5426<br>
	 * @param ulChannelId \u97f3\u9891\u89e3\u7801\u7684\u901a\u9053\u53f7<br>
	 * @param enAudioDecodeType \u97f3\u9891\u89e3\u7801\u7c7b\u578b<br>
	 * C type : PU_ENCODE_TYPE_E<br>
	 * @param ulAudioVolume \u97f3\u91cf<br>
	 * @param enAudioSampleRate \u97f3\u9891\u91c7\u6837\u7387<br>
	 * C type : PU_AUDIO_SAMPLERATE_E
	 */
	public PU_DEC_AUDIO_INFO(int enAudioPortType, boolean bEnable, NativeLong ulChannelId, int enAudioDecodeType, NativeLong ulAudioVolume, int enAudioSampleRate) {
		super();
		this.enAudioPortType = enAudioPortType;
		this.bEnable = bEnable;
		this.ulChannelId = ulChannelId;
		this.enAudioDecodeType = enAudioDecodeType;
		this.ulAudioVolume = ulAudioVolume;
		this.enAudioSampleRate = enAudioSampleRate;
	}
	public PU_DEC_AUDIO_INFO(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends PU_DEC_AUDIO_INFO implements Structure.ByReference {
		
	};
	public static class ByValue extends PU_DEC_AUDIO_INFO implements Structure.ByValue {
		
	};
}
