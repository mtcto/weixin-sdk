package com.riversoft.weixin.pay.payment.bean;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.riversoft.weixin.pay.base.BaseResponse;

/**
 * @author borball on 5/15/2016.
 */
public class UnifiedOrderResponse extends BaseResponse {
	
	@JsonProperty("device_info")
	private String deviceInfo;
	
	@JsonProperty("trade_type")
	private String tradeType;
	
	@JsonProperty("prepay_id")
	private String prepayId;
	
	/**
	 * trade_type为NATIVE时有返回，用于生成二维码，展示给用户进行扫码支付
	 */
	@JsonProperty("code_url")
	private String codeUrl;
	
	/***
	 * trade_type为MWEB时候返回 <br/>
	 * mweb_url为拉起微信支付收银台的中间页面，可通过访问该url来拉起微信客户端，完成支付,mweb_url的有效期为5分钟。
	 */
	@JsonProperty("mweb_url")
	private String mwebUrl;
	
	public String getDeviceInfo() {
		return deviceInfo;
	}
	
	public void setDeviceInfo(String deviceInfo) {
		this.deviceInfo = deviceInfo;
	}
	
	public String getTradeType() {
		return tradeType;
	}
	
	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}
	
	public String getPrepayId() {
		return prepayId;
	}
	
	public void setPrepayId(String prepayId) {
		this.prepayId = prepayId;
	}
	
	public String getCodeUrl() {
		return codeUrl;
	}
	
	public void setCodeUrl(String codeUrl) {
		this.codeUrl = codeUrl;
	}

	public String getMwebUrl() {
		return mwebUrl;
	}

	public void setMwebUrl(String mwebUrl) {
		this.mwebUrl = mwebUrl;
	}
}
