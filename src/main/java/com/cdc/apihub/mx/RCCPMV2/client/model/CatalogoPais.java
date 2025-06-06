package com.cdc.apihub.mx.RCCPMV2.client.model;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

@JsonAdapter(CatalogoPais.Adapter.class)
public enum CatalogoPais {

	AD("AD"),

	AF("AF"),

	AG("AG"),

	AI("AI"),

	AN("AN"),

	AO("AO"),

	AS("AS"),

	AT("AT"),

	AU("AU"),

	AW("AW"),

	AX("AX"),

	BB("BB"),

	BD("BD"),

	BE("BE"),

	BF("BF"),

	BG("BG"),

	BH("BH"),

	BI("BI"),

	BJ("BJ"),

	BK("BK"),

	BM("BM"),

	BN("BN"),

	BO("BO"),

	BR("BR"),

	BS("BS"),

	BU("BU"),

	BW("BW"),

	BX("BX"),

	BZ("BZ"),

	CB("CB"),

	CC("CC"),

	CD("CD"),

	CF("CF"),

	CG("CG"),

	CH("CH"),

	CI("CI"),

	CJ("CJ"),

	CL("CL"),

	CM("CM"),

	CN("CN"),

	CP("CP"),

	CS("CS"),

	CU("CU"),

	CV("CV"),

	CY("CY"),

	DF("DF"),

	DJ("DJ"),

	DK("DK"),

	DM("DM"),

	DO("DO"),

	DW("DW"),

	DZ("DZ"),

	EC("EC"),

	EG("EG"),

	EM("EM"),

	ES("ES"),

	ET("ET"),

	FA("FA"),

	FE("FE"),

	FI("FI"),

	FJ("FJ"),

	FP("FP"),

	FR("FR"),

	GB("GB"),

	GD("GD"),

	GE("GE"),

	GF("GF"),

	GH("GH"),

	GI("GI"),

	GM("GM"),

	GN("GN"),

	GP("GP"),

	GQ("GQ"),

	GR("GR"),

	GT("GT"),

	GW("GW"),

	GX("GX"),

	GY("GY"),

	HA("HA"),

	HK("HK"),

	HN("HN"),

	HR("HR"),

	HU("HU"),

	HX("HX"),

	IB("IB"),

	IC("IC"),

	IE("IE"),

	IF("IF"),

	IG("IG"),

	IQ("IQ"),

	IR("IR"),

	IS("IS"),

	IT("IT"),

	JM("JM"),

	JO("JO"),

	JP("JP"),

	KA("KA"),

	KE("KE"),

	KI("KI"),

	KN("KN"),

	KR("KR"),

	KW("KW"),

	KX("KX"),

	LB("LB"),

	LC("LC"),

	LE("LE"),

	LK("LK"),

	LO("LO"),

	LR("LR"),

	LS("LS"),

	LT("LT"),

	LU("LU"),

	LV("LV"),

	LX("LX"),

	MC("MC"),

	MD("MD"),

	MG("MG"),

	MH("MH"),

	MJ("MJ"),

	MK("MK"),

	ML("ML"),

	MM("MM"),

	MP("MP"),

	MQ("MQ"),

	MR("MR"),

	MT("MT"),

	MU("MU"),

	MV("MV"),

	MW("MW"),

	MX("MX"),

	MY("MY"),

	MZ("MZ"),

	NA("NA"),

	ND("ND"),

	NI("NI"),

	NL("NL"),

	NN("NN"),

	NO("NO"),

	NP("NP"),

	NR("NR"),

	NW("NW"),

	NZ("NZ"),

	OA("OA"),

	OM("OM"),

	PG("PG"),

	PH("PH"),

	PK("PK"),

	PL("PL"),

	PM("PM"),

	PS("PS"),

	PT("PT"),

	PU("PU"),

	PY("PY"),

	RC("RC"),

	RE("RE"),

	RO("RO"),

	RU("RU"),

	RW("RW"),

	SA("SA"),

	SB("SB"),

	SE("SE"),

	SF("SF"),

	SH("SH"),

	SI("SI"),

	SN("SN"),

	SO("SO"),

	SP("SP"),

	SR("SR"),

	SS("SS"),

	ST("ST"),

	SU("SU"),

	SV("SV"),

	SW("SW"),

	SX("SX"),

	SY("SY"),

	SZ("SZ"),

	TA("TA"),

	TC("TC"),

	TD("TD"),

	TG("TG"),

	TH("TH"),

	TR("TR"),

	TT("TT"),

	TU("TU"),

	TV("TV"),

	TW("TW"),

	TZ("TZ"),

	UA("UA"),

	UG("UG"),

	UK("UK"),

	UM("UM"),

	US("US"),

	UY("UY"),

	VC("VC"),

	VE("VE"),

	VG("VG"),

	VN("VN"),

	VU("VU"),

	WS("WS"),

	WT("WT"),

	XN("XN"),

	YE("YE"),

	YS("YS"),

	ZA("ZA"),

	ZM("ZM"),

	ZR("ZR"),

	ZW("ZW");
	private String value;

	CatalogoPais(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	@Override
	public String toString() {
		return String.valueOf(value);
	}

	public static CatalogoPais fromValue(String text) {
		for (CatalogoPais b : CatalogoPais.values()) {
			if (String.valueOf(b.value).equals(text)) {
				return b;
			}
		}
		return null;
	}

	public static class Adapter extends TypeAdapter<CatalogoPais> {
		@Override
		public void write(final JsonWriter jsonWriter, final CatalogoPais enumeration) throws IOException {
			jsonWriter.value(enumeration.getValue());
		}

		@Override
		public CatalogoPais read(final JsonReader jsonReader) throws IOException {
			String value = jsonReader.nextString();
			return CatalogoPais.fromValue(String.valueOf(value));
		}
	}
}
