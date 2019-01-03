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
public class tagItsEPoliceDtLineParam extends Structure {
	/**
	 * \u7ebf\u53c2\u6570\u4f7f\u80fd\u8868<br>
	 * C type : PU_ITS_EPOLICE_DT_LINE_ENABLE_S
	 */
	public tagItsEPoliceDtLineEnable stEnableList;
	/** \u8f66\u9053\u7ebf\u6570\u91cf */
	public int iLaneNum;
	/**
	 * \u8f66\u9053\u7ebf = \u8f66\u9053\u6570+1<br>
	 * C type : ROAD_PROPERTY_UNIT_S[(4)]
	 */
	public tagRoadPropertyUnit[] stLane = new tagRoadPropertyUnit[4];
	/**
	 * \u8f66\u9053\u53f3\u8fb9\u754c\u9650<br>
	 * C type : ROAD_PROPERTY_UNIT_S
	 */
	public tagRoadPropertyUnit stLaneRhtBorderLine;
	/** \u505c\u6b62\u7ebf\u6570\u91cf */
	public int iStopNum;
	/**
	 * \u505c\u6b62\u7ebf<br>
	 * C type : PU_IMRS_LINE_S[(4)]
	 */
	public PU_IMRS_LINE[] stStopLine = new PU_IMRS_LINE[4];
	/**
	 * \u68c0\u6d4b\u7ebf\uff08\u865a\u62df\u7eca\u7ebf\uff0c\u5361\u53e3\u6a21\u5f0f\u8fc7\u7ebf\u6293\u62cd\uff09<br>
	 * C type : PU_IMRS_LINE_S[(4)]
	 */
	public PU_IMRS_LINE[] stTripLine = new PU_IMRS_LINE[4];
	/**
	 * \u5de6\u8f6c\u8fb9\u754c\u7ebf<br>
	 * C type : PU_IMRS_LINE_S
	 */
	public PU_IMRS_LINE stLftBorderLine;
	/**
	 * \u53f3\u8f6c\u8fb9\u754c\u7ebf<br>
	 * C type : PU_IMRS_LINE_S
	 */
	public PU_IMRS_LINE stRhtBorderLine;
	/**
	 * \u76f4\u884c\u89e6\u53d1\u7ebf<br>
	 * C type : PU_IMRS_LINE_S
	 */
	public PU_IMRS_LINE stStrightTrigger;
	/**
	 * \u95ef\u7ea2\u706f\u89e6\u53d1\u7ebf<br>
	 * C type : PU_IMRS_LINE_S
	 */
	public PU_IMRS_LINE stRunningRedTrigger;
	/**
	 * \u5b9a\u4f4d\u6846<br>
	 * C type : PU_ITS_POS_BOX_TYPE_E
	 */
	public int enPosBoxType;
	/**
	 * \u6700\u4f73\u8f66\u724c\u8bc6\u522b\u533a\u57df<br>
	 * C type : AERADTC_LIST_S
	 */
	public AERADTC_LIST stVLPRAreaList;
	/**
	 * \u9ec4\u7f51\u683c\u533a\u57df<br>
	 * C type : AERADTC_LIST_S
	 */
	public AERADTC_LIST stIllegalParkAreaList;
	public tagItsEPoliceDtLineParam() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("stEnableList", "iLaneNum", "stLane", "stLaneRhtBorderLine", "iStopNum", "stStopLine", "stTripLine", "stLftBorderLine", "stRhtBorderLine", "stStrightTrigger", "stRunningRedTrigger", "enPosBoxType", "stVLPRAreaList", "stIllegalParkAreaList");
	}
	public tagItsEPoliceDtLineParam(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends tagItsEPoliceDtLineParam implements Structure.ByReference {
		
	};
	public static class ByValue extends tagItsEPoliceDtLineParam implements Structure.ByValue {
		
	};
}
