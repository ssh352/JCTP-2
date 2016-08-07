package com.ctp.thostftdcuserapistruct;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \u8054\u7cfb\u4eba<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:4899</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
 
public class CThostFtdcLinkManField extends StructObject {
	/**
	 * \u7ecf\u7eaa\u516c\u53f8\u4ee3\u7801<br>
	 * C type : TThostFtdcBrokerIDType
	 */
	@Array({11}) 
	@Field(0) 
	public Pointer<Byte > BrokerID() {
		return this.io.getPointerField(this, 0);
	}
	/**
	 * \u6295\u8d44\u8005\u4ee3\u7801<br>
	 * C type : TThostFtdcInvestorIDType
	 */
	@Array({13}) 
	@Field(1) 
	public Pointer<Byte > InvestorID() {
		return this.io.getPointerField(this, 1);
	}
	/**
	 * \u8054\u7cfb\u4eba\u7c7b\u578b<br>
	 * C type : TThostFtdcPersonTypeType
	 */
	@Field(2) 
	public byte PersonType() {
		return this.io.getByteField(this, 2);
	}
	/**
	 * \u8054\u7cfb\u4eba\u7c7b\u578b<br>
	 * C type : TThostFtdcPersonTypeType
	 */
	@Field(2) 
	public CThostFtdcLinkManField PersonType(byte PersonType) {
		this.io.setByteField(this, 2, PersonType);
		return this;
	}
	/**
	 * \u8bc1\u4ef6\u7c7b\u578b<br>
	 * C type : TThostFtdcIdCardTypeType
	 */
	@Field(3) 
	public byte IdentifiedCardType() {
		return this.io.getByteField(this, 3);
	}
	/**
	 * \u8bc1\u4ef6\u7c7b\u578b<br>
	 * C type : TThostFtdcIdCardTypeType
	 */
	@Field(3) 
	public CThostFtdcLinkManField IdentifiedCardType(byte IdentifiedCardType) {
		this.io.setByteField(this, 3, IdentifiedCardType);
		return this;
	}
	/**
	 * \u8bc1\u4ef6\u53f7\u7801<br>
	 * C type : TThostFtdcIdentifiedCardNoType
	 */
	@Array({51}) 
	@Field(4) 
	public Pointer<Byte > IdentifiedCardNo() {
		return this.io.getPointerField(this, 4);
	}
	/**
	 * \u540d\u79f0<br>
	 * C type : TThostFtdcPartyNameType
	 */
	@Array({81}) 
	@Field(5) 
	public Pointer<Byte > PersonName() {
		return this.io.getPointerField(this, 5);
	}
	/**
	 * \u8054\u7cfb\u7535\u8bdd<br>
	 * C type : TThostFtdcTelephoneType
	 */
	@Array({41}) 
	@Field(6) 
	public Pointer<Byte > Telephone() {
		return this.io.getPointerField(this, 6);
	}
	/**
	 * \u901a\u8baf\u5730\u5740<br>
	 * C type : TThostFtdcAddressType
	 */
	@Array({101}) 
	@Field(7) 
	public Pointer<Byte > Address() {
		return this.io.getPointerField(this, 7);
	}
	/**
	 * \u90ae\u653f\u7f16\u7801<br>
	 * C type : TThostFtdcZipCodeType
	 */
	@Array({7}) 
	@Field(8) 
	public Pointer<Byte > ZipCode() {
		return this.io.getPointerField(this, 8);
	}
	/**
	 * \u4f18\u5148\u7ea7<br>
	 * C type : TThostFtdcPriorityType
	 */
	@Field(9) 
	public int Priority() {
		return this.io.getIntField(this, 9);
	}
	/**
	 * \u4f18\u5148\u7ea7<br>
	 * C type : TThostFtdcPriorityType
	 */
	@Field(9) 
	public CThostFtdcLinkManField Priority(int Priority) {
		this.io.setIntField(this, 9, Priority);
		return this;
	}
	/**
	 * \u5f00\u6237\u90ae\u653f\u7f16\u7801<br>
	 * C type : TThostFtdcUOAZipCodeType
	 */
	@Array({11}) 
	@Field(10) 
	public Pointer<Byte > UOAZipCode() {
		return this.io.getPointerField(this, 10);
	}
	/**
	 * \u5168\u79f0<br>
	 * C type : TThostFtdcInvestorFullNameType
	 */
	@Array({101}) 
	@Field(11) 
	public Pointer<Byte > PersonFullName() {
		return this.io.getPointerField(this, 11);
	}
	public CThostFtdcLinkManField() {
		super();
	}
	public CThostFtdcLinkManField(Pointer pointer) {
		super(pointer);
	}
}