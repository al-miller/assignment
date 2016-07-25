package com.alex.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "is_dead",
        "name",
        "tags",
        "address_line_1",
        "address_line_2",
        "city",
        "postal_code",
        "telephone",
        "fax",
        "latitude",
        "longitude",
        "products_count",
        "inventory_count",
        "inventory_price_in_cents",
        "inventory_volume_in_milliliters",
        "has_wheelchair_accessability",
        "has_bilingual_services",
        "has_product_consultant",
        "has_tasting_bar",
        "has_beer_cold_room",
        "has_special_occasion_permits",
        "has_vintages_corner",
        "has_parking",
        "has_transit_access",
        "sunday_open",
        "sunday_close",
        "monday_open",
        "monday_close",
        "tuesday_open",
        "tuesday_close",
        "wednesday_open",
        "wednesday_close",
        "thursday_open",
        "thursday_close",
        "friday_open",
        "friday_close",
        "saturday_open",
        "saturday_close",
        "updated_at",
        "store_no"
})
public class StoreBean2 {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("is_dead")
    private Boolean isDead;
    @JsonProperty("name")
    private String name;
    @JsonProperty("tags")
    private String tags;
    @JsonProperty("address_line_1")
    private String addressLine1;
    @JsonProperty("address_line_2")
    private Object addressLine2;
    @JsonProperty("city")
    private String city;
    @JsonProperty("postal_code")
    private String postalCode;
    @JsonProperty("telephone")
    private String telephone;
    @JsonProperty("fax")
    private String fax;
    @JsonProperty("latitude")
    private Double latitude;
    @JsonProperty("longitude")
    private Double longitude;
    @JsonProperty("products_count")
    private Integer productsCount;
    @JsonProperty("inventory_count")
    private Integer inventoryCount;
    @JsonProperty("inventory_price_in_cents")
    private Integer inventoryPriceInCents;
    @JsonProperty("inventory_volume_in_milliliters")
    private Integer inventoryVolumeInMilliliters;
    @JsonProperty("has_wheelchair_accessability")
    private Boolean hasWheelchairAccessability;
    @JsonProperty("has_bilingual_services")
    private Boolean hasBilingualServices;
    @JsonProperty("has_product_consultant")
    private Boolean hasProductConsultant;
    @JsonProperty("has_tasting_bar")
    private Boolean hasTastingBar;
    @JsonProperty("has_beer_cold_room")
    private Boolean hasBeerColdRoom;
    @JsonProperty("has_special_occasion_permits")
    private Boolean hasSpecialOccasionPermits;
    @JsonProperty("has_vintages_corner")
    private Boolean hasVintagesCorner;
    @JsonProperty("has_parking")
    private Boolean hasParking;
    @JsonProperty("has_transit_access")
    private Boolean hasTransitAccess;
    @JsonProperty("sunday_open")
    private Integer sundayOpen;
    @JsonProperty("sunday_close")
    private Integer sundayClose;
    @JsonProperty("monday_open")
    private Integer mondayOpen;
    @JsonProperty("monday_close")
    private Integer mondayClose;
    @JsonProperty("tuesday_open")
    private Integer tuesdayOpen;
    @JsonProperty("tuesday_close")
    private Integer tuesdayClose;
    @JsonProperty("wednesday_open")
    private Integer wednesdayOpen;
    @JsonProperty("wednesday_close")
    private Integer wednesdayClose;
    @JsonProperty("thursday_open")
    private Integer thursdayOpen;
    @JsonProperty("thursday_close")
    private Integer thursdayClose;
    @JsonProperty("friday_open")
    private Integer fridayOpen;
    @JsonProperty("friday_close")
    private Integer fridayClose;
    @JsonProperty("saturday_open")
    private Integer saturdayOpen;
    @JsonProperty("saturday_close")
    private Integer saturdayClose;
    @JsonProperty("updated_at")
    private String updatedAt;
    @JsonProperty("store_no")
    private Integer storeNo;

//    @JsonIgnore
//    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public StoreBean2() {
    }

    /**
     * @param wednesdayOpen
     * @param hasSpecialOccasionPermits
     * @param productsCount
     * @param mondayClose
     * @param saturdayOpen
     * @param sundayClose
     * @param inventoryCount
     * @param city
     * @param hasBeerColdRoom
     * @param storeNo
     * @param id
     * @param inventoryVolumeInMilliliters
     * @param hasBilingualServices
     * @param hasTransitAccess
     * @param postalCode
     * @param name
     * @param hasParking
     * @param hasVintagesCorner
     * @param longitude
     * @param saturdayClose
     * @param tags
     * @param fridayOpen
     * @param fax
     * @param thursdayClose
     * @param isDead
     * @param hasTastingBar
     * @param hasWheelchairAccessability
     * @param addressLine2
     * @param fridayClose
     * @param addressLine1
     * @param wednesdayClose
     * @param sundayOpen
     * @param updatedAt
     * @param inventoryPriceInCents
     * @param hasProductConsultant
     * @param tuesdayOpen
     * @param thursdayOpen
     * @param mondayOpen
     * @param latitude
     * @param telephone
     * @param tuesdayClose
     */
    public StoreBean2(Integer id, Boolean isDead, String name, String tags, String addressLine1, Object addressLine2, String city, String postalCode, String telephone, String fax, Double latitude, Double longitude, Integer productsCount, Integer inventoryCount, Integer inventoryPriceInCents, Integer inventoryVolumeInMilliliters, Boolean hasWheelchairAccessability, Boolean hasBilingualServices, Boolean hasProductConsultant, Boolean hasTastingBar, Boolean hasBeerColdRoom, Boolean hasSpecialOccasionPermits, Boolean hasVintagesCorner, Boolean hasParking, Boolean hasTransitAccess, Integer sundayOpen, Integer sundayClose, Integer mondayOpen, Integer mondayClose, Integer tuesdayOpen, Integer tuesdayClose, Integer wednesdayOpen, Integer wednesdayClose, Integer thursdayOpen, Integer thursdayClose, Integer fridayOpen, Integer fridayClose, Integer saturdayOpen, Integer saturdayClose, String updatedAt, Integer storeNo) {
        this.id = id;
        this.isDead = isDead;
        this.name = name;
        this.tags = tags;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.postalCode = postalCode;
        this.telephone = telephone;
        this.fax = fax;
        this.latitude = latitude;
        this.longitude = longitude;
        this.productsCount = productsCount;
        this.inventoryCount = inventoryCount;
        this.inventoryPriceInCents = inventoryPriceInCents;
        this.inventoryVolumeInMilliliters = inventoryVolumeInMilliliters;
        this.hasWheelchairAccessability = hasWheelchairAccessability;
        this.hasBilingualServices = hasBilingualServices;
        this.hasProductConsultant = hasProductConsultant;
        this.hasTastingBar = hasTastingBar;
        this.hasBeerColdRoom = hasBeerColdRoom;
        this.hasSpecialOccasionPermits = hasSpecialOccasionPermits;
        this.hasVintagesCorner = hasVintagesCorner;
        this.hasParking = hasParking;
        this.hasTransitAccess = hasTransitAccess;
        this.sundayOpen = sundayOpen;
        this.sundayClose = sundayClose;
        this.mondayOpen = mondayOpen;
        this.mondayClose = mondayClose;
        this.tuesdayOpen = tuesdayOpen;
        this.tuesdayClose = tuesdayClose;
        this.wednesdayOpen = wednesdayOpen;
        this.wednesdayClose = wednesdayClose;
        this.thursdayOpen = thursdayOpen;
        this.thursdayClose = thursdayClose;
        this.fridayOpen = fridayOpen;
        this.fridayClose = fridayClose;
        this.saturdayOpen = saturdayOpen;
        this.saturdayClose = saturdayClose;
        this.updatedAt = updatedAt;
        this.storeNo = storeNo;
    }

    /**
     * @return The id
     */
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    /**
     * @param id The id
     */
    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return The isDead
     */
    @JsonProperty("is_dead")
    public Boolean getIsDead() {
        return isDead;
    }

    /**
     * @param isDead The is_dead
     */
    @JsonProperty("is_dead")
    public void setIsDead(Boolean isDead) {
        this.isDead = isDead;
    }

    /**
     * @return The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * @param name The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return The tags
     */
    @JsonProperty("tags")
    public String getTags() {
        return tags;
    }

    /**
     * @param tags The tags
     */
    @JsonProperty("tags")
    public void setTags(String tags) {
        this.tags = tags;
    }

    /**
     * @return The addressLine1
     */
    @JsonProperty("address_line_1")
    public String getAddressLine1() {
        return addressLine1;
    }

    /**
     * @param addressLine1 The address_line_1
     */
    @JsonProperty("address_line_1")
    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    /**
     * @return The addressLine2
     */
    @JsonProperty("address_line_2")
    public Object getAddressLine2() {
        return addressLine2;
    }

    /**
     * @param addressLine2 The address_line_2
     */
    @JsonProperty("address_line_2")
    public void setAddressLine2(Object addressLine2) {
        this.addressLine2 = addressLine2;
    }

    /**
     * @return The city
     */
    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    /**
     * @param city The city
     */
    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return The postalCode
     */
    @JsonProperty("postal_code")
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * @param postalCode The postal_code
     */
    @JsonProperty("postal_code")
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * @return The telephone
     */
    @JsonProperty("telephone")
    public String getTelephone() {
        return telephone;
    }

    /**
     * @param telephone The telephone
     */
    @JsonProperty("telephone")
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * @return The fax
     */
    @JsonProperty("fax")
    public String getFax() {
        return fax;
    }

    /**
     * @param fax The fax
     */
    @JsonProperty("fax")
    public void setFax(String fax) {
        this.fax = fax;
    }

    /**
     * @return The latitude
     */
    @JsonProperty("latitude")
    public Double getLatitude() {
        return latitude;
    }

    /**
     * @param latitude The latitude
     */
    @JsonProperty("latitude")
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    /**
     * @return The longitude
     */
    @JsonProperty("longitude")
    public Double getLongitude() {
        return longitude;
    }

    /**
     * @param longitude The longitude
     */
    @JsonProperty("longitude")
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    /**
     * @return The productsCount
     */
    @JsonProperty("products_count")
    public Integer getProductsCount() {
        return productsCount;
    }

    /**
     * @param productsCount The products_count
     */
    @JsonProperty("products_count")
    public void setProductsCount(Integer productsCount) {
        this.productsCount = productsCount;
    }

    /**
     * @return The inventoryCount
     */
    @JsonProperty("inventory_count")
    public Integer getInventoryCount() {
        return inventoryCount;
    }

    /**
     * @param inventoryCount The inventory_count
     */
    @JsonProperty("inventory_count")
    public void setInventoryCount(Integer inventoryCount) {
        this.inventoryCount = inventoryCount;
    }

    /**
     * @return The inventoryPriceInCents
     */
    @JsonProperty("inventory_price_in_cents")
    public Integer getInventoryPriceInCents() {
        return inventoryPriceInCents;
    }

    /**
     * @param inventoryPriceInCents The inventory_price_in_cents
     */
    @JsonProperty("inventory_price_in_cents")
    public void setInventoryPriceInCents(Integer inventoryPriceInCents) {
        this.inventoryPriceInCents = inventoryPriceInCents;
    }

    /**
     * @return The inventoryVolumeInMilliliters
     */
    @JsonProperty("inventory_volume_in_milliliters")
    public Integer getInventoryVolumeInMilliliters() {
        return inventoryVolumeInMilliliters;
    }

    /**
     * @param inventoryVolumeInMilliliters The inventory_volume_in_milliliters
     */
    @JsonProperty("inventory_volume_in_milliliters")
    public void setInventoryVolumeInMilliliters(Integer inventoryVolumeInMilliliters) {
        this.inventoryVolumeInMilliliters = inventoryVolumeInMilliliters;
    }

    /**
     * @return The hasWheelchairAccessability
     */
    @JsonProperty("has_wheelchair_accessability")
    public Boolean getHasWheelchairAccessability() {
        return hasWheelchairAccessability;
    }

    /**
     * @param hasWheelchairAccessability The has_wheelchair_accessability
     */
    @JsonProperty("has_wheelchair_accessability")
    public void setHasWheelchairAccessability(Boolean hasWheelchairAccessability) {
        this.hasWheelchairAccessability = hasWheelchairAccessability;
    }

    /**
     * @return The hasBilingualServices
     */
    @JsonProperty("has_bilingual_services")
    public Boolean getHasBilingualServices() {
        return hasBilingualServices;
    }

    /**
     * @param hasBilingualServices The has_bilingual_services
     */
    @JsonProperty("has_bilingual_services")
    public void setHasBilingualServices(Boolean hasBilingualServices) {
        this.hasBilingualServices = hasBilingualServices;
    }

    /**
     * @return The hasProductConsultant
     */
    @JsonProperty("has_product_consultant")
    public Boolean getHasProductConsultant() {
        return hasProductConsultant;
    }

    /**
     * @param hasProductConsultant The has_product_consultant
     */
    @JsonProperty("has_product_consultant")
    public void setHasProductConsultant(Boolean hasProductConsultant) {
        this.hasProductConsultant = hasProductConsultant;
    }

    /**
     * @return The hasTastingBar
     */
    @JsonProperty("has_tasting_bar")
    public Boolean getHasTastingBar() {
        return hasTastingBar;
    }

    /**
     * @param hasTastingBar The has_tasting_bar
     */
    @JsonProperty("has_tasting_bar")
    public void setHasTastingBar(Boolean hasTastingBar) {
        this.hasTastingBar = hasTastingBar;
    }

    /**
     * @return The hasBeerColdRoom
     */
    @JsonProperty("has_beer_cold_room")
    public Boolean getHasBeerColdRoom() {
        return hasBeerColdRoom;
    }

    /**
     * @param hasBeerColdRoom The has_beer_cold_room
     */
    @JsonProperty("has_beer_cold_room")
    public void setHasBeerColdRoom(Boolean hasBeerColdRoom) {
        this.hasBeerColdRoom = hasBeerColdRoom;
    }

    /**
     * @return The hasSpecialOccasionPermits
     */
    @JsonProperty("has_special_occasion_permits")
    public Boolean getHasSpecialOccasionPermits() {
        return hasSpecialOccasionPermits;
    }

    /**
     * @param hasSpecialOccasionPermits The has_special_occasion_permits
     */
    @JsonProperty("has_special_occasion_permits")
    public void setHasSpecialOccasionPermits(Boolean hasSpecialOccasionPermits) {
        this.hasSpecialOccasionPermits = hasSpecialOccasionPermits;
    }

    /**
     * @return The hasVintagesCorner
     */
    @JsonProperty("has_vintages_corner")
    public Boolean getHasVintagesCorner() {
        return hasVintagesCorner;
    }

    /**
     * @param hasVintagesCorner The has_vintages_corner
     */
    @JsonProperty("has_vintages_corner")
    public void setHasVintagesCorner(Boolean hasVintagesCorner) {
        this.hasVintagesCorner = hasVintagesCorner;
    }

    /**
     * @return The hasParking
     */
    @JsonProperty("has_parking")
    public Boolean getHasParking() {
        return hasParking;
    }

    /**
     * @param hasParking The has_parking
     */
    @JsonProperty("has_parking")
    public void setHasParking(Boolean hasParking) {
        this.hasParking = hasParking;
    }

    /**
     * @return The hasTransitAccess
     */
    @JsonProperty("has_transit_access")
    public Boolean getHasTransitAccess() {
        return hasTransitAccess;
    }

    /**
     * @param hasTransitAccess The has_transit_access
     */
    @JsonProperty("has_transit_access")
    public void setHasTransitAccess(Boolean hasTransitAccess) {
        this.hasTransitAccess = hasTransitAccess;
    }

    /**
     * @return The sundayOpen
     */
    @JsonProperty("sunday_open")
    public Integer getSundayOpen() {
        return sundayOpen;
    }

    /**
     * @param sundayOpen The sunday_open
     */
    @JsonProperty("sunday_open")
    public void setSundayOpen(Integer sundayOpen) {
        this.sundayOpen = sundayOpen;
    }

    /**
     * @return The sundayClose
     */
    @JsonProperty("sunday_close")
    public Integer getSundayClose() {
        return sundayClose;
    }

    /**
     * @param sundayClose The sunday_close
     */
    @JsonProperty("sunday_close")
    public void setSundayClose(Integer sundayClose) {
        this.sundayClose = sundayClose;
    }

    /**
     * @return The mondayOpen
     */
    @JsonProperty("monday_open")
    public Integer getMondayOpen() {
        return mondayOpen;
    }

    /**
     * @param mondayOpen The monday_open
     */
    @JsonProperty("monday_open")
    public void setMondayOpen(Integer mondayOpen) {
        this.mondayOpen = mondayOpen;
    }

    /**
     * @return The mondayClose
     */
    @JsonProperty("monday_close")
    public Integer getMondayClose() {
        return mondayClose;
    }

    /**
     * @param mondayClose The monday_close
     */
    @JsonProperty("monday_close")
    public void setMondayClose(Integer mondayClose) {
        this.mondayClose = mondayClose;
    }

    /**
     * @return The tuesdayOpen
     */
    @JsonProperty("tuesday_open")
    public Integer getTuesdayOpen() {
        return tuesdayOpen;
    }

    /**
     * @param tuesdayOpen The tuesday_open
     */
    @JsonProperty("tuesday_open")
    public void setTuesdayOpen(Integer tuesdayOpen) {
        this.tuesdayOpen = tuesdayOpen;
    }

    /**
     * @return The tuesdayClose
     */
    @JsonProperty("tuesday_close")
    public Integer getTuesdayClose() {
        return tuesdayClose;
    }

    /**
     * @param tuesdayClose The tuesday_close
     */
    @JsonProperty("tuesday_close")
    public void setTuesdayClose(Integer tuesdayClose) {
        this.tuesdayClose = tuesdayClose;
    }

    /**
     * @return The wednesdayOpen
     */
    @JsonProperty("wednesday_open")
    public Integer getWednesdayOpen() {
        return wednesdayOpen;
    }

    /**
     * @param wednesdayOpen The wednesday_open
     */
    @JsonProperty("wednesday_open")
    public void setWednesdayOpen(Integer wednesdayOpen) {
        this.wednesdayOpen = wednesdayOpen;
    }

    /**
     * @return The wednesdayClose
     */
    @JsonProperty("wednesday_close")
    public Integer getWednesdayClose() {
        return wednesdayClose;
    }

    /**
     * @param wednesdayClose The wednesday_close
     */
    @JsonProperty("wednesday_close")
    public void setWednesdayClose(Integer wednesdayClose) {
        this.wednesdayClose = wednesdayClose;
    }

    /**
     * @return The thursdayOpen
     */
    @JsonProperty("thursday_open")
    public Integer getThursdayOpen() {
        return thursdayOpen;
    }

    /**
     * @param thursdayOpen The thursday_open
     */
    @JsonProperty("thursday_open")
    public void setThursdayOpen(Integer thursdayOpen) {
        this.thursdayOpen = thursdayOpen;
    }

    /**
     * @return The thursdayClose
     */
    @JsonProperty("thursday_close")
    public Integer getThursdayClose() {
        return thursdayClose;
    }

    /**
     * @param thursdayClose The thursday_close
     */
    @JsonProperty("thursday_close")
    public void setThursdayClose(Integer thursdayClose) {
        this.thursdayClose = thursdayClose;
    }

    /**
     * @return The fridayOpen
     */
    @JsonProperty("friday_open")
    public Integer getFridayOpen() {
        return fridayOpen;
    }

    /**
     * @param fridayOpen The friday_open
     */
    @JsonProperty("friday_open")
    public void setFridayOpen(Integer fridayOpen) {
        this.fridayOpen = fridayOpen;
    }

    /**
     * @return The fridayClose
     */
    @JsonProperty("friday_close")
    public Integer getFridayClose() {
        return fridayClose;
    }

    /**
     * @param fridayClose The friday_close
     */
    @JsonProperty("friday_close")
    public void setFridayClose(Integer fridayClose) {
        this.fridayClose = fridayClose;
    }

    /**
     * @return The saturdayOpen
     */
    @JsonProperty("saturday_open")
    public Integer getSaturdayOpen() {
        return saturdayOpen;
    }

    /**
     * @param saturdayOpen The saturday_open
     */
    @JsonProperty("saturday_open")
    public void setSaturdayOpen(Integer saturdayOpen) {
        this.saturdayOpen = saturdayOpen;
    }

    /**
     * @return The saturdayClose
     */
    @JsonProperty("saturday_close")
    public Integer getSaturdayClose() {
        return saturdayClose;
    }

    /**
     * @param saturdayClose The saturday_close
     */
    @JsonProperty("saturday_close")
    public void setSaturdayClose(Integer saturdayClose) {
        this.saturdayClose = saturdayClose;
    }

    /**
     * @return The updatedAt
     */
    @JsonProperty("updated_at")
    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     * @param updatedAt The updated_at
     */
    @JsonProperty("updated_at")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * @return The storeNo
     */
    @JsonProperty("store_no")
    public Integer getStoreNo() {
        return storeNo;
    }

    /**
     * @param storeNo The store_no
     */
    @JsonProperty("store_no")
    public void setStoreNo(Integer storeNo) {
        this.storeNo = storeNo;
    }

//    @JsonAnyGetter
//    public Map<String, Object> getAdditionalProperties() {
//        return this.additionalProperties;
//    }
//
//    @JsonAnySetter
//    public void setAdditionalProperty(String name, Object value) {
//        this.additionalProperties.put(name, value);
//    }

}