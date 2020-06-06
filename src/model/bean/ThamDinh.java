package model.bean;

public class ThamDinh {
	
	String idHoSo ;
	int SDT ;
	int DC ;
	int DCSHK ;
	int SDTTT ;
	int MST ;
	int L ;
	int HTNL ;
	int HDLD ;
	int BHYT ;
	int NVLV ;
	int STV ;
	String callhistory ;
	String status ;
	
	public ThamDinh() {
		
	}
	public ThamDinh(String idHoSo, int sDT, int dC, int dCSHK, int sDTTT, int mST, int l, int hTNL, int hDLD, int bHYT,
			int nVLV, int sTV, String callhistory, String status) {
		super();
		this.idHoSo = idHoSo;
		SDT = sDT;
		DC = dC;
		DCSHK = dCSHK;
		SDTTT = sDTTT;
		MST = mST;
		L = l;
		HTNL = hTNL;
		HDLD = hDLD;
		BHYT = bHYT;
		NVLV = nVLV;
		STV = sTV;
		this.callhistory = callhistory;
		this.status = status;
	}
	public String getIdHoSo() {
		return idHoSo;
	}
	public void setIdHoSo(String idHoSo) {
		this.idHoSo = idHoSo;
	}
	public int getSDT() {
		return SDT;
	}
	public void setSDT(int sDT) {
		SDT = sDT;
	}
	public int getDC() {
		return DC;
	}
	public void setDC(int dC) {
		DC = dC;
	}
	public int getDCSHK() {
		return DCSHK;
	}
	public void setDCSHK(int dCSHK) {
		DCSHK = dCSHK;
	}
	public int getSDTTT() {
		return SDTTT;
	}
	public void setSDTTT(int sDTTT) {
		SDTTT = sDTTT;
	}
	public int getMST() {
		return MST;
	}
	public void setMST(int mST) {
		MST = mST;
	}
	public int getL() {
		return L;
	}
	public void setL(int l) {
		L = l;
	}
	public int getHTNL() {
		return HTNL;
	}
	public void setHTNL(int hTNL) {
		HTNL = hTNL;
	}
	public int getHDLD() {
		return HDLD;
	}
	public void setHDLD(int hDLD) {
		HDLD = hDLD;
	}
	public int getBHYT() {
		return BHYT;
	}
	public void setBHYT(int bHYT) {
		BHYT = bHYT;
	}
	public int getNVLV() {
		return NVLV;
	}
	public void setNVLV(int nVLV) {
		NVLV = nVLV;
	}
	public int getSTV() {
		return STV;
	}
	public void setSTV(int sTV) {
		STV = sTV;
	}
	public String getCallhistory() {
		return callhistory;
	}
	public void setCallhistory(String callhistory) {
		this.callhistory = callhistory;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	

}
