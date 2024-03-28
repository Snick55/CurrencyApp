package com.snick55.currencyapp.data

import com.google.gson.annotations.SerializedName

open class Stub(
    
)

data class Valute(
    val AED: AED,
    val AMD: AMD,
    val AUD: AUD,
    val AZN: AZN,
    val BGN: BGN,
    val BRL: BRL,
    val BYN: BYN,
    val CAD: CAD,
    val CHF: CHF,
    val CNY: CNY,
    val CZK: CZK,
    val DKK: DKK,
    val EGP: EGP,
    val EUR: EUR,
    val GBP: GBP,
    val GEL: GEL,
    val HKD: HKD,
    val HUF: HUF,
    val IDR: IDR,
    val INR: INR,
    val JPY: JPY,
    val KGS: KGS,
    val KRW: KRW,
    val KZT: KZT,
    val MDL: MDL,
    val NOK: NOK,
    val NZD: NZD,
    val PLN: PLN,
    val QAR: QAR,
    val RON: RON,
    val RSD: RSD,
    val SEK: SEK,
    val SGD: SGD,
    val THB: THB,
    val TJS: TJS,
    val TMT: TMT,
    val TRY: TRY,
    val UAH: UAH,
    val USD: USD,
    val UZS: UZS,
    val VND: VND,
    val XDR: XDR,
    val ZAR: ZAR
)

data class AED(
    @SerializedName("CharCode")
    val code: String,
    val ID: String,
    @SerializedName("Name")
    val currencyName: String,
    val Nominal: Int,
    val NumCode: String,
    val Previous: Double,
    @SerializedName("Value")
    val currencyValue: Double
) : Stub(){
    fun toCurrencyData() = CurrencyData(this.code,this.currencyName,this.Nominal, this.currencyValue)
}

data class AMD(
    @SerializedName("CharCode")
    val code: String,
    val ID: String,
    @SerializedName("Name")
    val currencyName: String,
    val Nominal: Int,
    val NumCode: String,
    val Previous: Double,
    @SerializedName("Value")
    val currencyValue: Double
) : Stub(){
    fun toCurrencyData() = CurrencyData(this.code,this.currencyName,this.Nominal, this.currencyValue)
}


data class AUD(
    @SerializedName("CharCode")
    val code: String,
    val ID: String,
    @SerializedName("Name")
    val currencyName: String,
    val Nominal: Int,
    val NumCode: String,
    val Previous: Double,
    @SerializedName("Value")
    val currencyValue: Double
) : Stub(){
    fun toCurrencyData() = CurrencyData(this.code,this.currencyName,this.Nominal, this.currencyValue)
}


data class AZN(
    @SerializedName("CharCode")
    val code: String,
    val ID: String,
    @SerializedName("Name")
    val currencyName: String,
    val Nominal: Int,
    val NumCode: String,
    val Previous: Double,
    @SerializedName("Value")
    val currencyValue: Double
) : Stub(){
    fun toCurrencyData() = CurrencyData(this.code,this.currencyName,this.Nominal, this.currencyValue)
}


data class BGN(
    @SerializedName("CharCode")
    val code: String,
    val ID: String,
    @SerializedName("Name")
    val currencyName: String,
    val Nominal: Int,
    val NumCode: String,
    val Previous: Double,
    @SerializedName("Value")
    val currencyValue: Double
) : Stub(){
    fun toCurrencyData() = CurrencyData(this.code,this.currencyName,this.Nominal, this.currencyValue)
}


data class BRL(
    @SerializedName("CharCode")
    val code: String,
    val ID: String,
    @SerializedName("Name")
    val currencyName: String,
    val Nominal: Int,
    val NumCode: String,
    val Previous: Double,
    @SerializedName("Value")
    val currencyValue: Double
) : Stub(){
    fun toCurrencyData() = CurrencyData(this.code,this.currencyName,this.Nominal, this.currencyValue)
}


data class BYN(
    @SerializedName("CharCode")
    val code: String,
    val ID: String,
    @SerializedName("Name")
    val currencyName: String,
    val Nominal: Int,
    val NumCode: String,
    val Previous: Double,
    @SerializedName("Value")
    val currencyValue: Double
) : Stub(){
    fun toCurrencyData() = CurrencyData(this.code,this.currencyName,this.Nominal, this.currencyValue)
}


data class CAD(
    @SerializedName("CharCode")
    val code: String,
    val ID: String,
    @SerializedName("Name")
    val currencyName: String,
    val Nominal: Int,
    val NumCode: String,
    val Previous: Double,
    @SerializedName("Value")
    val currencyValue: Double
) : Stub(){
    fun toCurrencyData() = CurrencyData(this.code,this.currencyName,this.Nominal, this.currencyValue)
}


data class CHF(
    @SerializedName("CharCode")
    val code: String,
    val ID: String,
    @SerializedName("Name")
    val currencyName: String,
    val Nominal: Int,
    val NumCode: String,
    val Previous: Double,
    @SerializedName("Value")
    val currencyValue: Double
) : Stub(){
    fun toCurrencyData() = CurrencyData(this.code,this.currencyName,this.Nominal, this.currencyValue)
}


data class CNY(
    @SerializedName("CharCode")
    val code: String,
    val ID: String,
    @SerializedName("Name")
    val currencyName: String,
    val Nominal: Int,
    val NumCode: String,
    val Previous: Double,
    @SerializedName("Value")
    val currencyValue: Double
) : Stub(){
    fun toCurrencyData() = CurrencyData(this.code,this.currencyName,this.Nominal, this.currencyValue)
}


data class CZK(
    @SerializedName("CharCode")
    val code: String,
    val ID: String,
    @SerializedName("Name")
    val currencyName: String,
    val Nominal: Int,
    val NumCode: String,
    val Previous: Double,
    @SerializedName("Value")
    val currencyValue: Double
) : Stub(){
    fun toCurrencyData() = CurrencyData(this.code,this.currencyName,this.Nominal, this.currencyValue)
}


data class DKK(
    @SerializedName("CharCode")
    val code: String,
    val ID: String,
    @SerializedName("Name")
    val currencyName: String,
    val Nominal: Int,
    val NumCode: String,
    val Previous: Double,
    @SerializedName("Value")
    val currencyValue: Double
) : Stub(){
    fun toCurrencyData() = CurrencyData(this.code,this.currencyName,this.Nominal, this.currencyValue)
}


data class EGP(
    @SerializedName("CharCode")
    val code: String,
    val ID: String,
    @SerializedName("Name")
    val currencyName: String,
    val Nominal: Int,
    val NumCode: String,
    val Previous: Double,
    @SerializedName("Value")
    val currencyValue: Double
) : Stub(){
    fun toCurrencyData() = CurrencyData(this.code,this.currencyName,this.Nominal, this.currencyValue)
}


data class EUR(
    @SerializedName("CharCode")
    val code: String,
    val ID: String,
    @SerializedName("Name")
    val currencyName: String,
    val Nominal: Int,
    val NumCode: String,
    val Previous: Double,
    @SerializedName("Value")
    val currencyValue: Double
) : Stub(){
    fun toCurrencyData() = CurrencyData(this.code,this.currencyName,this.Nominal, this.currencyValue)
}


data class GBP(
    @SerializedName("CharCode")
    val code: String,
    val ID: String,
    @SerializedName("Name")
    val currencyName: String,
    val Nominal: Int,
    val NumCode: String,
    val Previous: Double,
    @SerializedName("Value")
    val currencyValue: Double
) : Stub()
{
    fun toCurrencyData() = CurrencyData(this.code,this.currencyName,this.Nominal, this.currencyValue)
}

data class GEL(
    @SerializedName("CharCode")
    val code: String,
    val ID: String,
    @SerializedName("Name")
    val currencyName: String,
    val Nominal: Int,
    val NumCode: String,
    val Previous: Double,
    @SerializedName("Value")
    val currencyValue: Double
) : Stub(){
    fun toCurrencyData() = CurrencyData(this.code,this.currencyName,this.Nominal, this.currencyValue)
}


data class HKD(
    @SerializedName("CharCode")
    val code: String,
    val ID: String,
    @SerializedName("Name")
    val currencyName: String,
    val Nominal: Int,
    val NumCode: String,
    val Previous: Double,
    @SerializedName("Value")
    val currencyValue: Double
) : Stub(){
    fun toCurrencyData() = CurrencyData(this.code,this.currencyName,this.Nominal, this.currencyValue)
}


data class HUF(
    @SerializedName("CharCode")
    val code: String,
    val ID: String,
    @SerializedName("Name")
    val currencyName: String,
    val Nominal: Int,
    val NumCode: String,
    val Previous: Double,
    @SerializedName("Value")
    val currencyValue: Double
) : Stub(){
    fun toCurrencyData() = CurrencyData(this.code,this.currencyName,this.Nominal, this.currencyValue)
}


data class IDR(
    @SerializedName("CharCode")
    val code: String,
    val ID: String,
    @SerializedName("Name")
    val currencyName: String,
    val Nominal: Int,
    val NumCode: String,
    val Previous: Double,
    @SerializedName("Value")
    val currencyValue: Double
) : Stub(){
    fun toCurrencyData() = CurrencyData(this.code,this.currencyName,this.Nominal, this.currencyValue)
}


data class INR(
    @SerializedName("CharCode")
    val code: String,
    val ID: String,
    @SerializedName("Name")
    val currencyName: String,
    val Nominal: Int,
    val NumCode: String,
    val Previous: Double,
    @SerializedName("Value")
    val currencyValue: Double
) : Stub(){
    fun toCurrencyData() = CurrencyData(this.code,this.currencyName,this.Nominal, this.currencyValue)
}


data class JPY(
    @SerializedName("CharCode")
    val code: String,
    val ID: String,
    @SerializedName("Name")
    val currencyName: String,
    val Nominal: Int,
    val NumCode: String,
    val Previous: Double,
    @SerializedName("Value")
    val currencyValue: Double
) : Stub(){
    fun toCurrencyData() = CurrencyData(this.code,this.currencyName,this.Nominal, this.currencyValue)
}


data class KGS(
    @SerializedName("CharCode")
    val code: String,
    val ID: String,
    @SerializedName("Name")
    val currencyName: String,
    val Nominal: Int,
    val NumCode: String,
    val Previous: Double,
    @SerializedName("Value")
    val currencyValue: Double
) : Stub(){
    fun toCurrencyData() = CurrencyData(this.code,this.currencyName,this.Nominal, this.currencyValue)
}


data class KRW(
    @SerializedName("CharCode")
    val code: String,
    val ID: String,
    @SerializedName("Name")
    val currencyName: String,
    val Nominal: Int,
    val NumCode: String,
    val Previous: Double,
    @SerializedName("Value")
    val currencyValue: Double
) : Stub(){
    fun toCurrencyData() = CurrencyData(this.code,this.currencyName,this.Nominal, this.currencyValue)
}


data class KZT(
    @SerializedName("CharCode")
    val code: String,
    val ID: String,
    @SerializedName("Name")
    val currencyName: String,
    val Nominal: Int,
    val NumCode: String,
    val Previous: Double,
    @SerializedName("Value")
    val currencyValue: Double
) : Stub()
{
    fun toCurrencyData() = CurrencyData(this.code,this.currencyName,this.Nominal, this.currencyValue)
}

data class MDL(
    @SerializedName("CharCode")
    val code: String,
    val ID: String,
    @SerializedName("Name")
    val currencyName: String,
    val Nominal: Int,
    val NumCode: String,
    val Previous: Double,
    @SerializedName("Value")
    val currencyValue: Double
) : Stub(){
    fun toCurrencyData() = CurrencyData(this.code,this.currencyName,this.Nominal, this.currencyValue)
}


data class NOK(
    @SerializedName("CharCode")
    val code: String,
    val ID: String,
    @SerializedName("Name")
    val currencyName: String,
    val Nominal: Int,
    val NumCode: String,
    val Previous: Double,
    @SerializedName("Value")
    val currencyValue: Double
) : Stub(){
    fun toCurrencyData() = CurrencyData(this.code,this.currencyName,this.Nominal, this.currencyValue)
}


data class NZD(
    @SerializedName("CharCode")
    val code: String,
    val ID: String,
    @SerializedName("Name")
    val currencyName: String,
    val Nominal: Int,
    val NumCode: String,
    val Previous: Double,
    @SerializedName("Value")
    val currencyValue: Double
) : Stub(){
    fun toCurrencyData() = CurrencyData(this.code,this.currencyName,this.Nominal, this.currencyValue)
}


data class PLN(
    @SerializedName("CharCode")
    val code: String,
    val ID: String,
    @SerializedName("Name")
    val currencyName: String,
    val Nominal: Int,
    val NumCode: String,
    val Previous: Double,
    @SerializedName("Value")
    val currencyValue: Double
) : Stub(){
    fun toCurrencyData() = CurrencyData(this.code,this.currencyName,this.Nominal, this.currencyValue)
}


data class QAR(
    @SerializedName("CharCode")
    val code: String,
    val ID: String,
    @SerializedName("Name")
    val currencyName: String,
    val Nominal: Int,
    val NumCode: String,
    val Previous: Double,
    @SerializedName("Value")
    val currencyValue: Double
) : Stub(){
    fun toCurrencyData() = CurrencyData(this.code,this.currencyName,this.Nominal, this.currencyValue)
}


data class RON(
    @SerializedName("CharCode")
    val code: String,
    val ID: String,
    @SerializedName("Name")
    val currencyName: String,
    val Nominal: Int,
    val NumCode: String,
    val Previous: Double,
    @SerializedName("Value")
    val currencyValue: Double
) : Stub(){
    fun toCurrencyData() = CurrencyData(this.code,this.currencyName,this.Nominal, this.currencyValue)
}


data class RSD(
    @SerializedName("CharCode")
    val code: String,
    val ID: String,
    @SerializedName("Name")
    val currencyName: String,
    val Nominal: Int,
    val NumCode: String,
    val Previous: Double,
    @SerializedName("Value")
    val currencyValue: Double
) : Stub(){
    fun toCurrencyData() = CurrencyData(this.code,this.currencyName,this.Nominal, this.currencyValue)
}


data class SEK(
    @SerializedName("CharCode")
    val code: String,
    val ID: String,
    @SerializedName("Name")
    val currencyName: String,
    val Nominal: Int,
    val NumCode: String,
    val Previous: Double,
    @SerializedName("Value")
    val currencyValue: Double
) : Stub(){
    fun toCurrencyData() = CurrencyData(this.code,this.currencyName,this.Nominal, this.currencyValue)
}


data class SGD(
    @SerializedName("CharCode")
    val code: String,
    val ID: String,
    @SerializedName("Name")
    val currencyName: String,
    val Nominal: Int,
    val NumCode: String,
    val Previous: Double,
    @SerializedName("Value")
    val currencyValue: Double
) : Stub(){
    fun toCurrencyData() = CurrencyData(this.code,this.currencyName,this.Nominal, this.currencyValue)
}


data class THB(
    @SerializedName("CharCode")
    val code: String,
    val ID: String,
    @SerializedName("Name")
    val currencyName: String,
    val Nominal: Int,
    val NumCode: String,
    val Previous: Double,
    @SerializedName("Value")
    val currencyValue: Double
) : Stub(){
    fun toCurrencyData() = CurrencyData(this.code,this.currencyName,this.Nominal, this.currencyValue)
}


data class TJS(
    @SerializedName("CharCode")
    val code: String,
    val ID: String,
    @SerializedName("Name")
    val currencyName: String,
    val Nominal: Int,
    val NumCode: String,
    val Previous: Double,
    @SerializedName("Value")
    val currencyValue: Double
) : Stub(){
    fun toCurrencyData() = CurrencyData(this.code,this.currencyName,this.Nominal, this.currencyValue)
}


data class TMT(
    @SerializedName("CharCode")
    val code: String,
    val ID: String,
    @SerializedName("Name")
    val currencyName: String,
    val Nominal: Int,
    val NumCode: String,
    val Previous: Double,
    @SerializedName("Value")
    val currencyValue: Double
) : Stub(){
    fun toCurrencyData() = CurrencyData(this.code,this.currencyName,this.Nominal, this.currencyValue)
}


data class TRY(
    @SerializedName("CharCode")
    val code: String,
    val ID: String,
    @SerializedName("Name")
    val currencyName: String,
    val Nominal: Int,
    val NumCode: String,
    val Previous: Double,
    @SerializedName("Value")
    val currencyValue: Double
) : Stub(){
    fun toCurrencyData() = CurrencyData(this.code,this.currencyName,this.Nominal, this.currencyValue)
}


data class UAH(
    @SerializedName("CharCode")
    val code: String,
    val ID: String,
    @SerializedName("Name")
    val currencyName: String,
    val Nominal: Int,
    val NumCode: String,
    val Previous: Double,
    @SerializedName("Value")
    val currencyValue: Double
) : Stub(){
    fun toCurrencyData() = CurrencyData(this.code,this.currencyName,this.Nominal, this.currencyValue)
}


data class USD(
    @SerializedName("CharCode")
    val code: String,
    val ID: String,
    @SerializedName("Name")
    val currencyName: String,
    val Nominal: Int,
    val NumCode: String,
    val Previous: Double,
    @SerializedName("Value")
    val currencyValue: Double
) : Stub()
{
    fun toCurrencyData() = CurrencyData(this.code,this.currencyName,this.Nominal, this.currencyValue)
}

data class UZS(
    @SerializedName("CharCode")
    val code: String,
    val ID: String,
    @SerializedName("Name")
    val currencyName: String,
    val Nominal: Int,
    val NumCode: String,
    val Previous: Double,
    @SerializedName("Value")
    val currencyValue: Double
) : Stub(){
    fun toCurrencyData() = CurrencyData(this.code,this.currencyName,this.Nominal, this.currencyValue)
}


data class VND(
    @SerializedName("CharCode")
    val code: String,
    val ID: String,
    @SerializedName("Name")
    val currencyName: String,
    val Nominal: Int,
    val NumCode: String,
    val Previous: Double,
    @SerializedName("Value")
    val currencyValue: Double
) : Stub(){
    fun toCurrencyData() = CurrencyData(this.code,this.currencyName,this.Nominal, this.currencyValue)
}


data class XDR(
    @SerializedName("CharCode")
    val code: String,
    val ID: String,
    @SerializedName("Name")
    val currencyName: String,
    val Nominal: Int,
    val NumCode: String,
    val Previous: Double,
    @SerializedName("Value")
    val currencyValue: Double
) : Stub(){
    fun toCurrencyData() = CurrencyData(this.code,this.currencyName,this.Nominal, this.currencyValue)
}


data class ZAR(
    @SerializedName("CharCode")
    val code: String,
    val ID: String,
    @SerializedName("Name")
    val currencyName: String,
    val Nominal: Int,
    val NumCode: String,
    val Previous: Double,
    @SerializedName("Value")
    val currencyValue: Double
) : Stub(){
    fun toCurrencyData() = CurrencyData(this.code,this.currencyName,this.Nominal, this.currencyValue)
}


fun Valute.toList(): List<CurrencyData> {
    val list = mutableListOf<CurrencyData>()
    list.add(this.AED.toCurrencyData())
    list.add(this.AMD.toCurrencyData())
    list.add(this.AUD.toCurrencyData())
    list.add(this.AZN.toCurrencyData())
    list.add(this.BGN.toCurrencyData())
    list.add(this.BRL.toCurrencyData())
    list.add(this.BYN.toCurrencyData())
    list.add(this.CAD.toCurrencyData())
    list.add(this.CHF.toCurrencyData())
    list.add(this.CNY.toCurrencyData())
    list.add(this.CZK.toCurrencyData())
    list.add(this.DKK.toCurrencyData())
    list.add(this.EGP.toCurrencyData())
    list.add(this.EUR.toCurrencyData())
    list.add(this.GBP.toCurrencyData())
    list.add(this.GEL.toCurrencyData())
    list.add(this.HKD.toCurrencyData())
    list.add(this.HUF.toCurrencyData())
    list.add(this.IDR.toCurrencyData())
    list.add(this.INR.toCurrencyData())
    list.add(this.JPY.toCurrencyData())
    list.add(this.KGS.toCurrencyData())
    list.add(this.KRW.toCurrencyData())
    list.add(this.KZT.toCurrencyData())
    list.add(this.MDL.toCurrencyData())
    list.add(this.NOK.toCurrencyData())
    list.add(this.NZD.toCurrencyData())
    list.add(this.PLN.toCurrencyData())
    list.add(this.QAR.toCurrencyData())
    list.add(this.RON.toCurrencyData())
    list.add(this.RSD.toCurrencyData())
    list.add(this.SEK.toCurrencyData())
    list.add(this.SGD.toCurrencyData())
    list.add(this.THB.toCurrencyData())
    list.add(this.TJS.toCurrencyData())
    list.add(this.TMT.toCurrencyData())
    list.add(this.TRY.toCurrencyData())
    list.add(this.UAH.toCurrencyData())
    list.add(this.USD.toCurrencyData())
    list.add(this.UZS.toCurrencyData())
    list.add(this.VND.toCurrencyData())
    list.add(this.XDR.toCurrencyData())
    list.add(this.ZAR.toCurrencyData())
    return list
}