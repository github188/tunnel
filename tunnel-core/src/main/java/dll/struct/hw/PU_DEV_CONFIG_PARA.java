package dll.struct;
import com.sun.jna.Pointer;
import com.sun.jna.Union;
/**
 * <i>native declaration : D:\HWPuSDK.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class PU_DEV_CONFIG_PARA extends Union {
	/**
	 * IP \u8fc7\u6ee4<br>
	 * C type : PU_IPFILTER_RULES_INFOV2_S
	 */
	public PU_IPFILTER_RULES_INFOV2 stIPFilterPara;
	/**
	 * \u7f51\u7edc\u667a\u80fd\u52a0\u901f<br>
	 * C type : PU_TCP_ACCELERATE_PARA_S
	 */
	public PU_TCP_ACCELERATE_PARA stTcpAcceleratePara;
	/**
	 * \u8bbe\u5907\u7aef\u53e3<br>
	 * C type : PU_DEVICE_PORT_CONFIG_S
	 */
	public PU_DEVICE_PORT_CONFIG stDevPortConfig;
	/**
	 * DDNS<br>
	 * C type : PU_DDNS_CONF_INFO_S
	 */
	public PU_DDNS_CONF_INFO stDDNSpara;
	/**
	 * 802.1x<br>
	 * C type : PU_DOT1X_CONFIG_INFO_S
	 */
	public PU_DOT1X_CONFIG_INFO stDot1xInfo;
	/**
	 * SSH<br>
	 * C type : PU_SSH_ENABLE_PARA_S
	 */
	public PU_SSH_ENABLE_PARA stSshPara;
	/**
	 * SFTP<br>
	 * C type : PU_SFTP_ENABLE_PARA_S
	 */
	public PU_SFTP_ENABLE_PARA stSftpPara;
	/**
	 * SNMPv1v2c\u793e\u56e2\u5217\u8868<br>
	 * C type : PU_SNMP_COMMUNITY_LIST_S_EX
	 */
	public PU_SNMP_COMMUNITY_LIST_EX stCommunityList;
	/**
	 * SNMP v3\u7528\u6237\u7ba1\u7406\u4fe1\u606f<br>
	 * C type : PU_SNMPV3_USER_MGMT_S
	 */
	public PU_SNMPV3_USER_MGMT stUserMgmtInfo;
	/**
	 * SNMP v3\u7528\u6237\u5217\u8868<br>
	 * C type : PU_SNMPV3_USER_LIST_S
	 */
	public PU_SNMPV3_USER_LIST stUserList;
	/**
	 * SNMP Trap\u63a5\u6536\u65b9\u5217\u8868<br>
	 * C type : PU_SNMP_TRAP_LIST_S
	 */
	public PU_SNMP_TRAP_LIST stTrapList;
	/** C type : CHAR[32] */
	public byte[] szReserved = new byte[32];
	public PU_DEV_CONFIG_PARA() {
		super();
	}
	/**
	 * @param stIPFilterPara IP \u8fc7\u6ee4<br>
	 * C type : PU_IPFILTER_RULES_INFOV2_S
	 */
	public PU_DEV_CONFIG_PARA(PU_IPFILTER_RULES_INFOV2 stIPFilterPara) {
		super();
		this.stIPFilterPara = stIPFilterPara;
		setType(PU_IPFILTER_RULES_INFOV2.class);
	}
	/**
	 * @param stTcpAcceleratePara \u7f51\u7edc\u667a\u80fd\u52a0\u901f<br>
	 * C type : PU_TCP_ACCELERATE_PARA_S
	 */
	public PU_DEV_CONFIG_PARA(PU_TCP_ACCELERATE_PARA stTcpAcceleratePara) {
		super();
		this.stTcpAcceleratePara = stTcpAcceleratePara;
		setType(PU_TCP_ACCELERATE_PARA.class);
	}
	/**
	 * @param stDevPortConfig \u8bbe\u5907\u7aef\u53e3<br>
	 * C type : PU_DEVICE_PORT_CONFIG_S
	 */
	public PU_DEV_CONFIG_PARA(PU_DEVICE_PORT_CONFIG stDevPortConfig) {
		super();
		this.stDevPortConfig = stDevPortConfig;
		setType(PU_DEVICE_PORT_CONFIG.class);
	}
	/**
	 * @param stDDNSpara DDNS<br>
	 * C type : PU_DDNS_CONF_INFO_S
	 */
	public PU_DEV_CONFIG_PARA(PU_DDNS_CONF_INFO stDDNSpara) {
		super();
		this.stDDNSpara = stDDNSpara;
		setType(PU_DDNS_CONF_INFO.class);
	}
	/**
	 * @param stDot1xInfo 802.1x<br>
	 * C type : PU_DOT1X_CONFIG_INFO_S
	 */
	public PU_DEV_CONFIG_PARA(PU_DOT1X_CONFIG_INFO stDot1xInfo) {
		super();
		this.stDot1xInfo = stDot1xInfo;
		setType(PU_DOT1X_CONFIG_INFO.class);
	}
	/**
	 * @param stSshPara SSH<br>
	 * C type : PU_SSH_ENABLE_PARA_S
	 */
	public PU_DEV_CONFIG_PARA(PU_SSH_ENABLE_PARA stSshPara) {
		super();
		this.stSshPara = stSshPara;
		setType(PU_SSH_ENABLE_PARA.class);
	}
	/**
	 * @param stSftpPara SFTP<br>
	 * C type : PU_SFTP_ENABLE_PARA_S
	 */
	public PU_DEV_CONFIG_PARA(PU_SFTP_ENABLE_PARA stSftpPara) {
		super();
		this.stSftpPara = stSftpPara;
		setType(PU_SFTP_ENABLE_PARA.class);
	}
	/**
	 * @param stCommunityList SNMPv1v2c\u793e\u56e2\u5217\u8868<br>
	 * C type : PU_SNMP_COMMUNITY_LIST_S_EX
	 */
	public PU_DEV_CONFIG_PARA(PU_SNMP_COMMUNITY_LIST_EX stCommunityList) {
		super();
		this.stCommunityList = stCommunityList;
		setType(PU_SNMP_COMMUNITY_LIST_EX.class);
	}
	/**
	 * @param stUserMgmtInfo SNMP v3\u7528\u6237\u7ba1\u7406\u4fe1\u606f<br>
	 * C type : PU_SNMPV3_USER_MGMT_S
	 */
	public PU_DEV_CONFIG_PARA(PU_SNMPV3_USER_MGMT stUserMgmtInfo) {
		super();
		this.stUserMgmtInfo = stUserMgmtInfo;
		setType(PU_SNMPV3_USER_MGMT.class);
	}
	/**
	 * @param stUserList SNMP v3\u7528\u6237\u5217\u8868<br>
	 * C type : PU_SNMPV3_USER_LIST_S
	 */
	public PU_DEV_CONFIG_PARA(PU_SNMPV3_USER_LIST stUserList) {
		super();
		this.stUserList = stUserList;
		setType(PU_SNMPV3_USER_LIST.class);
	}
	/**
	 * @param stTrapList SNMP Trap\u63a5\u6536\u65b9\u5217\u8868<br>
	 * C type : PU_SNMP_TRAP_LIST_S
	 */
	public PU_DEV_CONFIG_PARA(PU_SNMP_TRAP_LIST stTrapList) {
		super();
		this.stTrapList = stTrapList;
		setType(PU_SNMP_TRAP_LIST.class);
	}
	/** @param szReserved C type : CHAR[32] */
	public PU_DEV_CONFIG_PARA(byte szReserved[]) {
		super();
		if ((szReserved.length != this.szReserved.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szReserved = szReserved;
		setType(byte[].class);
	}
	public PU_DEV_CONFIG_PARA(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends PU_DEV_CONFIG_PARA implements com.sun.jna.Structure.ByReference {
		
	};
	public static class ByValue extends PU_DEV_CONFIG_PARA implements com.sun.jna.Structure.ByValue {
		
	};
}