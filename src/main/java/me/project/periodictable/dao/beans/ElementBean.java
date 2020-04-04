package me.project.periodictable.dao.beans;

import javax.persistence.*;

/**
 * Created by sanketp on 4/4/20
 */

@Entity
@Table(name = "p_t")
public class ElementBean {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "atomic_mass")
    private String atomicMass;

    @Column(name = "atomic_number")
    private Integer atomicNumber;

    @Column(name = "atomic_radius")
    private Integer atomicRadius;

    @Column(name = "boiling_point")
    private Integer boilingPoint;

    @Column(name = "bonding_type")
    private String bondingType;

    @Column(name = "cpk_hex_color")
    private String cpkHexColor;

    @Column(name = "density")
    private String density;

    @Column(name = "electron_affinity")
    private Integer electronAffinity;

    @Column(name = "electronegativity")
    private String electronegativity;

    @Column(name = "electronic_configuration")
    private String electronicConfiguration;

    @Column(name = "group_block")
    private String groupBlock;

    @Column(name = "ion_radius")
    private String ionRadius;

    @Column(name = "ionization_energy")
    private Integer ionizationEnergy;

    @Column(name = "melting_point")
    private Integer meltingPoint;

    @Column(name = "name")
    private String name;

    @Column(name = "oxidation_states")
    private String oxidationStates;

    @Column(name = "standard_state")
    private String standardState;

    @Column(name = "symbol")
    private String symbol;

    @Column(name = "van_del_waals_radius")
    private Integer vanDelWaalsRadius;

    @Column(name = "year_discovered")
    private String yearDiscovered;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public Integer getElectronAffinity() {
        return electronAffinity;
    }

    public void setElectronAffinity(Integer electronAffinity) {
        this.electronAffinity = electronAffinity;
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

