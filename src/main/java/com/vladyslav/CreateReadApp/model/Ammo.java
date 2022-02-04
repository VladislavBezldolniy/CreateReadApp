package com.vladyslav.CreateReadApp.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity @NoArgsConstructor
public class Ammo implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ammo_id")
    Long id;
    @NotNull
    @Enumerated
    private Caliber caliber;

    private String name;
    private String type;
    private String acMod;
    private String drMod;
    private float damageMod;
    private float value;
    private float dollarPerRound;
    private float batchSize;
    private float costPerRound;
    private float weight;

    public Ammo(Caliber caliber){
        this.caliber = caliber;
        this.name = caliber.getName();
        this.type = caliber.getType();
        this.acMod = caliber.getAcMod();
        this.drMod = caliber.getDrMod();
        this.damageMod = caliber.getDamageMod();
        this.value = caliber.getValue();
        this.dollarPerRound = caliber.get$$perRound();
        this.batchSize = caliber.getBatchSize();
        this.costPerRound = caliber.getCostPerRound();
        this.weight = caliber.getWeight();
    }

    public Caliber getCaliber() {
        return caliber;
    }

    public void setCaliber(Caliber caliber) {
        this.caliber = caliber;
    }

    // I'm not going to even try to transfer all data manually, although the name and type are differ
    public enum Caliber{

        FMJ223(".223 FMJ", "FMJ", "-20%", "-20%", 1f, 200f, 100f, 50f, 4f, 2f),
        MagnumFMJ44(".44 Magnum FMJ", "FMJ", "-20%", "-20%", 1f, 200f, 100f, 50f, 4f, 2f),
        MagnumJHP44(".44 Magnum JHP", "JHP", "-20%", "-20%", 1f, 200f, 100f, 50f, 4f, 2f),
        Caliber45(".45 Caliber", "Caliber", "-20%", "-20%", 1f, 200f, 100f, 50f, 4f, 2f),
        EC2mm("2mm EC", "EC", "-20%", "-20%", 1f, 200f, 100f, 50f, 4f, 2f),
        caseless4d7("4.7mm caseless", "caseless", "-20%", "-20%", 1f, 200f, 100f, 50f, 4f, 2f),
        AP5mm("5mm AP", "AP", "-20%", "-20%", 1f, 200f, 100f, 50f, 4f, 2f),
        JHP5mm("5mm JHP", "JHP", "-20%", "-20%", 1f, 200f, 100f, 50f, 4f, 2f),
        Caliber7d62mm("7.62mm", "FMJ", "-20%", "-20%", 1f, 200f, 100f, 50f, 4f, 2f),
        Caliber9mm("9mm", "FMJ", "-20%", "-20%", 1f, 200f, 100f, 50f, 4f, 2f),
        ball9mm("9mm ball", "FMJ", "-20%", "-20%", 1f, 200f, 100f, 50f, 4f, 2f),
        AP10mm("10mm AP", "AP", "-20%", "-20%", 1f, 200f, 100f, 50f, 4f, 2f),
        JHP10mm("10mm JHP", "JHP", "-20%", "-20%", 1f, 200f, 100f, 50f, 4f, 2f),
        AP14mm("14mm AP", "AP", "-20%", "-20%", 1f, 200f, 100f, 50f, 4f, 2f),
        BBs("BB's", "BBs", "-20%", "-20%", 1f, 200f, 100f, 50f, 4f, 2f),
        gaugeSS12("12 gauge shotgun shells", "12 gauge shotgun shells", "-20%", "-20%", 1f, 200f, 100f, 50f, 4f, 2f),
        RocketExplosive("Explosive rocket", "Explosive rocket", "-20%", "-20%", 1f, 200f, 100f, 50f, 4f, 2f),
        APRocket("Rocket AP", "AP", "-20%", "-20%", 1f, 200f, 100f, 50f, 4f, 2f),
        FlamethrowerFuel("Flamethrower fuel", "FF", "-20%", "-20%", 1f, 200f, 100f, 50f, 4f, 2f),
        FlamethrowerFuelMk2("Flamethrower fuel Mk II", "FF2", "-20%", "-20%", 1f, 200f, 100f, 50f, 4f, 2f),
        HNNeedlerCartridge("HN Needler cartridge", "FMJ", "-20%", "-20%", 1f, 200f, 100f, 50f, 4f, 2f),
        HNAPNeedlerCartridge("HN AP Needler cartridge", "FMJ", "-20%", "-20%", 1f, 200f, 100f, 50f, 4f, 2f),
        MicrofusionCell("Microfusion cell", "MC", "-20%", "-20%", 1f, 200f, 100f, 50f, 4f, 2f),
        SmallEnergyCell("Small energy cell", "SMC", "-20%", "-20%", 1f, 200f, 100f, 50f, 4f, 2f);

        private final String name;
        private final String type;
        private final String acMod;
        private final String drMod;
        private final float damageMod;
        private final float value;
        private final float dollarPerRound;
        private final float batchSize;
        private final float costPerRound;
        private final float weight;

        Caliber(String name, String type, String acMod, String drMod, float damageMod, float value, float $$perRound, float batchSize, float costPerRound, float weight) {
            this.name = name;
            this.type = type;
            this.acMod = acMod;
            this.drMod = drMod;
            this.damageMod = damageMod;
            this.value = value;
            this.dollarPerRound = $$perRound;
            this.batchSize = batchSize;
            this.costPerRound = costPerRound;
            this.weight = weight;
        }

        public String getName() {
            return name;
        }

        public String getType() {
            return type;
        }

        public String getAcMod() {
            return acMod;
        }

        public String getDrMod() {
            return drMod;
        }

        public float getDamageMod() {
            return damageMod;
        }

        public float getValue() {
            return value;
        }

        public float get$$perRound() {
            return dollarPerRound;
        }

        public float getBatchSize() {
            return batchSize;
        }

        public float getCostPerRound() {
            return costPerRound;
        }

        public float getWeight() {
            return weight;
        }
    }

}
