package io.github.adorableskullmaster.pw4j.domains.subdomains;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class WarAttacksContainer {
    @SerializedName("war_attack_id")
    @Expose
    private String warAttackId;
    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("war_id")
    @Expose
    private String warId;
    @SerializedName("attacker_nation_id")
    @Expose
    private String attackerNationId;
    @SerializedName("defender_nation_id")
    @Expose
    private String defenderNationId;
    @SerializedName("attack_type")
    @Expose
    private String attackType;
    @SerializedName("victor")
    @Expose
    private String victor;
    @SerializedName("success")
    @Expose
    private String success;
    @SerializedName("attcas1")
    @Expose
    private String attcas1;
    @SerializedName("attcas2")
    @Expose
    private String attcas2;
    @SerializedName("defcas1")
    @Expose
    private String defcas1;
    @SerializedName("defcas2")
    @Expose
    private String defcas2;
    @SerializedName("city_id")
    @Expose
    private String cityId;
    @SerializedName("infra_destroyed")
    @Expose
    private String infraDestroyed;
    @SerializedName("improvements_destroyed")
    @Expose
    private String improvementsDestroyed;
    @SerializedName("money_looted")
    @Expose
    private String moneyLooted;
    @SerializedName("note")
    @Expose
    private String note;
    @SerializedName("city_infra_before")
    @Expose
    private String cityInfraBefore;
    @SerializedName("infra_destroyed_value")
    @Expose
    private String infraDestroyedValue;
    @SerializedName("att_gas_used")
    @Expose
    private String attGasUsed;
    @SerializedName("att_mun_used")
    @Expose
    private String attMunUsed;
    @SerializedName("def_gas_used")
    @Expose
    private String defGasUsed;
    @SerializedName("def_mun_used")
    @Expose
    private String defMunUsed;

    @Override
    public String toString() {
        return "WarAttacksContainer{" +
                "warAttackId='" + warAttackId + '\'' +
                ", date='" + date + '\'' +
                ", warId='" + warId + '\'' +
                ", attackerNationId='" + attackerNationId + '\'' +
                ", defenderNationId='" + defenderNationId + '\'' +
                ", attackType='" + attackType + '\'' +
                ", victor='" + victor + '\'' +
                ", success='" + success + '\'' +
                ", attcas1='" + attcas1 + '\'' +
                ", attcas2='" + attcas2 + '\'' +
                ", defcas1='" + defcas1 + '\'' +
                ", defcas2='" + defcas2 + '\'' +
                ", cityId='" + cityId + '\'' +
                ", infraDestroyed='" + infraDestroyed + '\'' +
                ", improvementsDestroyed='" + improvementsDestroyed + '\'' +
                ", moneyLooted='" + moneyLooted + '\'' +
                ", note='" + note + '\'' +
                ", cityInfraBefore='" + cityInfraBefore + '\'' +
                ", infraDestroyedValue='" + infraDestroyedValue + '\'' +
                ", attGasUsed='" + attGasUsed + '\'' +
                ", attMunUsed='" + attMunUsed + '\'' +
                ", defGasUsed='" + defGasUsed + '\'' +
                ", defMunUsed='" + defMunUsed + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WarAttacksContainer that = (WarAttacksContainer) o;
        return Objects.equals(warAttackId, that.warAttackId) &&
                Objects.equals(date, that.date) &&
                Objects.equals(warId, that.warId) &&
                Objects.equals(attackerNationId, that.attackerNationId) &&
                Objects.equals(defenderNationId, that.defenderNationId) &&
                Objects.equals(attackType, that.attackType) &&
                Objects.equals(victor, that.victor) &&
                Objects.equals(success, that.success) &&
                Objects.equals(attcas1, that.attcas1) &&
                Objects.equals(attcas2, that.attcas2) &&
                Objects.equals(defcas1, that.defcas1) &&
                Objects.equals(defcas2, that.defcas2) &&
                Objects.equals(cityId, that.cityId) &&
                Objects.equals(infraDestroyed, that.infraDestroyed) &&
                Objects.equals(improvementsDestroyed, that.improvementsDestroyed) &&
                Objects.equals(moneyLooted, that.moneyLooted) &&
                Objects.equals(note, that.note) &&
                Objects.equals(cityInfraBefore, that.cityInfraBefore) &&
                Objects.equals(infraDestroyedValue, that.infraDestroyedValue) &&
                Objects.equals(attGasUsed, that.attGasUsed) &&
                Objects.equals(attMunUsed, that.attMunUsed) &&
                Objects.equals(defGasUsed, that.defGasUsed) &&
                Objects.equals(defMunUsed, that.defMunUsed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(warAttackId, date, warId, attackerNationId, defenderNationId, attackType, victor, success, attcas1, attcas2, defcas1, defcas2, cityId, infraDestroyed, improvementsDestroyed, moneyLooted, note, cityInfraBefore, infraDestroyedValue, attGasUsed, attMunUsed, defGasUsed, defMunUsed);
    }

    public String getWarAttackId() {
        return warAttackId;
    }

    public void setWarAttackId(String warAttackId) {
        this.warAttackId = warAttackId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getWarId() {
        return warId;
    }

    public void setWarId(String warId) {
        this.warId = warId;
    }

    public String getAttackerNationId() {
        return attackerNationId;
    }

    public void setAttackerNationId(String attackerNationId) {
        this.attackerNationId = attackerNationId;
    }

    public String getDefenderNationId() {
        return defenderNationId;
    }

    public void setDefenderNationId(String defenderNationId) {
        this.defenderNationId = defenderNationId;
    }

    public String getAttackType() {
        return attackType;
    }

    public void setAttackType(String attackType) {
        this.attackType = attackType;
    }

    public String getVictor() {
        return victor;
    }

    public void setVictor(String victor) {
        this.victor = victor;
    }

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public String getAttcas1() {
        return attcas1;
    }

    public void setAttcas1(String attcas1) {
        this.attcas1 = attcas1;
    }

    public String getAttcas2() {
        return attcas2;
    }

    public void setAttcas2(String attcas2) {
        this.attcas2 = attcas2;
    }

    public String getDefcas1() {
        return defcas1;
    }

    public void setDefcas1(String defcas1) {
        this.defcas1 = defcas1;
    }

    public String getDefcas2() {
        return defcas2;
    }

    public void setDefcas2(String defcas2) {
        this.defcas2 = defcas2;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getInfraDestroyed() {
        return infraDestroyed;
    }

    public void setInfraDestroyed(String infraDestroyed) {
        this.infraDestroyed = infraDestroyed;
    }

    public String getImprovementsDestroyed() {
        return improvementsDestroyed;
    }

    public void setImprovementsDestroyed(String improvementsDestroyed) {
        this.improvementsDestroyed = improvementsDestroyed;
    }

    public String getMoneyLooted() {
        return moneyLooted;
    }

    public void setMoneyLooted(String moneyLooted) {
        this.moneyLooted = moneyLooted;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getCityInfraBefore() {
        return cityInfraBefore;
    }

    public void setCityInfraBefore(String cityInfraBefore) {
        this.cityInfraBefore = cityInfraBefore;
    }

    public String getInfraDestroyedValue() {
        return infraDestroyedValue;
    }

    public void setInfraDestroyedValue(String infraDestroyedValue) {
        this.infraDestroyedValue = infraDestroyedValue;
    }

    public String getAttGasUsed() {
        return attGasUsed;
    }

    public void setAttGasUsed(String attGasUsed) {
        this.attGasUsed = attGasUsed;
    }

    public String getAttMunUsed() {
        return attMunUsed;
    }

    public void setAttMunUsed(String attMunUsed) {
        this.attMunUsed = attMunUsed;
    }

    public String getDefGasUsed() {
        return defGasUsed;
    }

    public void setDefGasUsed(String defGasUsed) {
        this.defGasUsed = defGasUsed;
    }

    public String getDefMunUsed() {
        return defMunUsed;
    }

    public void setDefMunUsed(String defMunUsed) {
        this.defMunUsed = defMunUsed;
    }
}
