package dublinBikes;

import java.util.Date;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Root {
    @Id @GeneratedValue int identifier;

    public long id;
    public String harvestTimeUTC;

    public int stationId;

    public int availableBikeStands;

    public int bikeStands;

    public int availableBikes;
    public String banking;
    public boolean bonus;

    public Date lastUpdate;
    public String status;

    public String address;
    public String name;
    public String latitude;
    public String longitude;

    public Root(){}
    public Root(int identifier, long id, String harvestTimeUTC, int stationId, int availableBikeStands, int bikeStands, int availableBikes, String banking, boolean bonus, Date lastUpdate, String status, String address, String name, String latitude, String longitude) {
        this.identifier = identifier;
        this.id = id;
        this.harvestTimeUTC = harvestTimeUTC;
        this.stationId = stationId;
        this.availableBikeStands = availableBikeStands;
        this.bikeStands = bikeStands;
        this.availableBikes = availableBikes;
        this.banking = banking;
        this.bonus = bonus;
        this.lastUpdate = lastUpdate;
        this.status = status;
        this.address = address;
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Root)) return false;
        Root root = (Root) o;
        return identifier == root.identifier && id == root.id && stationId == root.stationId && availableBikeStands == root.availableBikeStands && bikeStands == root.bikeStands && availableBikes == root.availableBikes && bonus == root.bonus && Objects.equals(harvestTimeUTC, root.harvestTimeUTC) && Objects.equals(banking, root.banking) && Objects.equals(lastUpdate, root.lastUpdate) && Objects.equals(status, root.status) && Objects.equals(address, root.address) && Objects.equals(name, root.name) && Objects.equals(latitude, root.latitude) && Objects.equals(longitude, root.longitude);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identifier, id, harvestTimeUTC, stationId, availableBikeStands, bikeStands, availableBikes, banking, bonus, lastUpdate, status, address, name, latitude, longitude);
    }

    @Override
    public String toString() {
        return "Root{" +
                "identifier=" + identifier +
                ", id=" + id +
                ", harvestTimeUTC=" + harvestTimeUTC +
                ", stationId=" + stationId +
                ", availableBikeStands=" + availableBikeStands +
                ", bikeStands=" + bikeStands +
                ", availableBikes=" + availableBikes +
                ", banking='" + banking + '\'' +
                ", bonus=" + bonus +
                ", lastUpdate=" + lastUpdate +
                ", status='" + status + '\'' +
                ", address='" + address + '\'' +
                ", name='" + name + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }

    public int getIdentifier() {
        return identifier;
    }

    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getHarvestTimeUTC() {
        return harvestTimeUTC;
    }

    public void setHarvestTimeUTC(String harvestTimeUTC) {
        this.harvestTimeUTC = harvestTimeUTC;
    }

    public int getStationId() {
        return stationId;
    }

    public void setStationId(int stationId) {
        this.stationId = stationId;
    }

    public int getAvailableBikeStands() {
        return availableBikeStands;
    }

    public void setAvailableBikeStands(int availableBikeStands) {
        this.availableBikeStands = availableBikeStands;
    }

    public int getBikeStands() {
        return bikeStands;
    }

    public void setBikeStands(int bikeStands) {
        this.bikeStands = bikeStands;
    }

    public int getAvailableBikes() {
        return availableBikes;
    }

    public void setAvailableBikes(int availableBikes) {
        this.availableBikes = availableBikes;
    }

    public String getBanking() {
        return banking;
    }

    public void setBanking(String banking) {
        this.banking = banking;
    }

    public boolean isBonus() {
        return bonus;
    }

    public void setBonus(boolean bonus) {
        this.bonus = bonus;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
}
