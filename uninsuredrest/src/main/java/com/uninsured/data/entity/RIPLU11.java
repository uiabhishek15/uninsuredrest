package com.uninsured.data.entity;

import java.io.Serializable;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class RIPLU11 implements Serializable{

	private static final long serialVersionUID = -2456023060146109468L;

	@Field("99 of poverty")
	private String _99_of_poverty;
	
	@Field("99 of poverty MOE")
	private String _99_of_poverty_MOE;

	@Field("99 of poverty - Uninsured")
	private String _99_of_poverty_Uninsured;
	
	@Field("99 of poverty - Uninsured MOE")
	private String _99_of_poverty_Uninsured_MOE;
	
	@Field("99 of poverty - Uninsured Pct")
	private String _99_of_poverty_Uninsured_Pct;
	
	@Field("99 of poverty - Uninsured Pct MOE")
	private String _99_of_poverty_Pct_MOE;

	public String get_99_of_poverty() {
		return _99_of_poverty;
	}

	public void set_99_of_poverty(String _99_of_poverty) {
		this._99_of_poverty = _99_of_poverty;
	}

	public String get_99_of_poverty_MOE() {
		return _99_of_poverty_MOE;
	}

	public void set_99_of_poverty_MOE(String _99_of_poverty_MOE) {
		this._99_of_poverty_MOE = _99_of_poverty_MOE;
	}

	public String get_99_of_poverty_Uninsured() {
		return _99_of_poverty_Uninsured;
	}

	public void set_99_of_poverty_Uninsured(String _99_of_poverty_Uninsured) {
		this._99_of_poverty_Uninsured = _99_of_poverty_Uninsured;
	}

	public String get_99_of_poverty_Uninsured_MOE() {
		return _99_of_poverty_Uninsured_MOE;
	}

	public void set_99_of_poverty_Uninsured_MOE(String _99_of_poverty_Uninsured_MOE) {
		this._99_of_poverty_Uninsured_MOE = _99_of_poverty_Uninsured_MOE;
	}

	public String get_99_of_poverty_Uninsured_Pct() {
		return _99_of_poverty_Uninsured_Pct;
	}

	public void set_99_of_poverty_Uninsured_Pct(String _99_of_poverty_Uninsured_Pct) {
		this._99_of_poverty_Uninsured_Pct = _99_of_poverty_Uninsured_Pct;
	}

	public String get_99_of_poverty_Pct_MOE() {
		return _99_of_poverty_Pct_MOE;
	}

	public void set_99_of_poverty_Pct_MOE(String _99_of_poverty_Pct_MOE) {
		this._99_of_poverty_Pct_MOE = _99_of_poverty_Pct_MOE;
	}
	
	
}
