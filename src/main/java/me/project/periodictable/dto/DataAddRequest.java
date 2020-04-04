package me.project.periodictable.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by sanketp on 4/4/20
 */
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class DataAddRequest {

    @JsonProperty("atomicMass")
    private String atomicMass;

    @JsonProperty("atomicNumber")
    private Integer atomicNumber;

    @JsonProperty("atomicRadius")
    private Integer atomicRadius;

    @JsonProperty("boilingPoint")
    private Integer boilingPoint;

    @JsonProperty("bondingType")
    private String bondingType;

    @JsonProperty("cpkHexColor")
    private String cpkHexColor;

    @JsonProperty("density")
    private String density;

    @JsonProperty("electronAffinity")
    private Integer electronAffinity;

    @JsonProperty("electronegativity")
    private String electronegativity;

    @JsonProperty("electronicConfiguration")
    private String electronicConfiguration;

    @JsonProperty("groupBlock")
    private String groupBlock;

    @JsonProperty("ionRadius")
    private String ionRadius;

    @JsonProperty("ionizationEnergy")
    private Integer ionizationEnergy;

    @JsonProperty("meltingPoint")
    private Integer meltingPoint;

    @JsonProperty("name")
    private String name;

    @JsonProperty("oxidationStates")
    private String oxidationStates;

    @JsonProperty("standardState")
    private String standardState;

    @JsonProperty("symbol")
    private String symbol;

    @JsonProperty("vanDelWaalsRadius")
    private Integer vanDelWaalsRadius;

    @JsonProperty("yearDiscovered")
    private String yearDiscovered;

    public String getAtomicMass() {
        return atomicMass;
    }

    public void setAtomicMass(String atomicMass) {
        this.atomicMass = atomicMass;
    }

    public Integer getAtomicNumber() {
        return atomicNumber;
    }

    public void setAtomicNumber(Integer atomicNumber) {
        this.atomicNumber = atomicNumber;
    }

    public Integer getAtomicRadius() {
        return atomicRadius;
    }

    public void setAtomicRadius(Integer atomicRadius) {
        this.atomicRadius = atomicRadius;
    }

    public Integer getBoilingPoint() {
        return boilingPoint;
    }

    public void setBoilingPoint(Integer boilingPoint) {
        this.boilingPoint = boilingPoint;
    }

    public String getBondingType() {
        return bondingType;
    }

    public void setBondingType(String bondingType) {
        this.bondingType = bondingType;
    }

    public String getCpkHexColor() {
        return cpkHexColor;
    }

    public void setCpkHexColor(String cpkHexColor) {
        this.cpkHexColor = cpkHexColor;
    }

    public String getDensity() {
        return density;
    }

    public void setDensity(String density) {
        this.density = density;
    }

    public Integer getElectronAffinity() {
        return electronAffinity;
    }

    public void setElectronAffinity(Integer electronAffinity) {
        this.electronAffinity = electronAffinity;
    }

    public String getElectronegativity() {
        return electronegativity;
    }

    public void setElectronegativity(String electronegativity) {
        this.electronegativity = electronegativity;
    }

    public String getElectronicConfiguration() {
        return electronicConfiguration;
    }

    public void setElectronicConfiguration(String electronicConfiguration) {
        this.electronicConfiguration = electronicConfiguration;
    }

    public String getGroupBlock() {
        return groupBlock;
    }

    public void setGroupBlock(String groupBlock) {
        this.groupBlock = groupBlock;
    }

    public String getIonRadius() {
        return ionRadius;
    }

    public void setIonRadius(String ionRadius) {
        this.ionRadius = ionRadius;
    }

    public Integer getIonizationEnergy() {
        return ionizationEnergy;
    }

    public void setIonizationEnergy(Integer ionizationEnergy) {
        this.ionizationEnergy = ionizationEnergy;
    }

    public Integer getMeltingPoint() {
        return meltingPoint;
    }

    public void setMeltingPoint(Integer meltingPoint) {
        this.meltingPoint = meltingPoint;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOxidationStates() {
        return oxidationStates;
    }

    public void setOxidationStates(String oxidationStates) {
        this.oxidationStates = oxidationStates;
    }

    public String getStandardState() {
        return standardState;
    }

    public void setStandardState(String standardState) {
        this.standardState = standardState;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Integer getVanDelWaalsRadius() {
        return vanDelWaalsRadius;
    }

    public void setVanDelWaalsRadius(Integer vanDelWaalsRadius) {
        this.vanDelWaalsRadius = vanDelWaalsRadius;
    }

    public String getYearDiscovered() {
        return yearDiscovered;
    }

    public void setYearDiscovered(String yearDiscovered) {
        this.yearDiscovered = yearDiscovered;
    }
}
