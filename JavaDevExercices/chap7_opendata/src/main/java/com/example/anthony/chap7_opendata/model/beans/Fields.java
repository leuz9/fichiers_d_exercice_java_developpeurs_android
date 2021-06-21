package com.example.anthony.chap7_opendata.model.beans;

import java.io.Serializable;
import java.util.List;

/**
 * Created by booth09-mgr2 on 22/03/2017.
 */

public class Fields implements Serializable {

    private String manifestation_gratuite;
    private String commune;
    private String tranche_age_enfant;
    private String descriptif_court;
    private String theme_de_la_manifestation;
    private String type_de_manifestation;
    private String categorie_de_la_manifestation;
    private String descriptif_long;
    private Float googlemap_latitude;
    private String dates_affichage_horaires;
    private List<Float> geo_point = null;
    private String date_fin;
    private String lieu_nom;
    private String reservation_site_internet;
    private Float googlemap_longitude;
    private String station_metro_tram_a_proximite;
    private String nom_de_la_manifestation;
    private String identifiant;
    private String date_debut;
    private Integer code_postal;
    private String lieu_adresse_2;
    private String horaires;
    private String tarif_normal;
    private String lieu_adresse_1;
    private String reservation_telephone;
    private String reservation_email;

    public String getManifestationGratuite() {
        return manifestation_gratuite;
    }

    public void setManifestationGratuite(String manifestation_gratuite) {
        this.manifestation_gratuite = manifestation_gratuite;
    }

    public String getCommune() {
        return commune;
    }

    public void setCommune(String commune) {
        this.commune = commune;
    }

    public String getTrancheAgeEnfant() {
        return tranche_age_enfant;
    }

    public void setTrancheAgeEnfant(String tranche_age_enfant) {
        this.tranche_age_enfant = tranche_age_enfant;
    }

    public String getDescriptifCourt() {
        return descriptif_court;
    }

    public void setDescriptifCourt(String descriptif_court) {
        this.descriptif_court = descriptif_court;
    }

    public String getThemeDeLaManifestation() {
        return theme_de_la_manifestation;
    }

    public void setThemeDeLaManifestation(String theme_de_la_manifestation) {
        this.theme_de_la_manifestation = theme_de_la_manifestation;
    }

    public String getTypeDeManifestation() {
        return type_de_manifestation;
    }

    public void setTypeDeManifestation(String type_de_manifestation) {
        this.type_de_manifestation = type_de_manifestation;
    }

    public String getCategorieDeLaManifestation() {
        return categorie_de_la_manifestation;
    }

    public void setCategorieDeLaManifestation(String categorie_de_la_manifestation) {
        this.categorie_de_la_manifestation = categorie_de_la_manifestation;
    }

    public String getDescriptifLong() {
        return descriptif_long;
    }

    public void setDescriptifLong(String descriptif_long) {
        this.descriptif_long = descriptif_long;
    }

    public Float getGooglemapLatitude() {
        return googlemap_latitude;
    }

    public void setGooglemapLatitude(Float googlemap_latitude) {
        this.googlemap_latitude = googlemap_latitude;
    }

    public String getDatesAffichageHoraires() {
        return dates_affichage_horaires;
    }

    public void setDatesAffichageHoraires(String dates_affichage_horaires) {
        this.dates_affichage_horaires = dates_affichage_horaires;
    }

    public List<Float> getGeoPoint() {
        return geo_point;
    }

    public void setGeoPoint(List<Float> geo_point) {
        this.geo_point = geo_point;
    }

    public String getDateFin() {
        return date_fin;
    }

    public void setDateFin(String date_fin) {
        this.date_fin = date_fin;
    }

    public String getLieuNom() {
        return lieu_nom;
    }

    public void setLieuNom(String lieu_nom) {
        this.lieu_nom = lieu_nom;
    }

    public String getReservationSiteInternet() {
        return reservation_site_internet;
    }

    public void setReservationSiteiInternet(String reservation_site_internet) {
        this.reservation_site_internet = reservation_site_internet;
    }

    public Float getGooglemapLongitude() {
        return googlemap_longitude;
    }

    public void setGooglemapLongitude(Float googlemap_longitude) {
        this.googlemap_longitude = googlemap_longitude;
    }

    public String getStationMetroTramAProximite() {
        return station_metro_tram_a_proximite;
    }

    public void setStationMetroTramAProximite(String station_metro_tram_a_proximite) {
        this.station_metro_tram_a_proximite = station_metro_tram_a_proximite;
    }

    public String getNomDeLaManifestation() {
        return nom_de_la_manifestation;
    }

    public void setNomDeLaManifestation(String nom_de_la_manifestation) {
        this.nom_de_la_manifestation = nom_de_la_manifestation;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public String getDateDebut() {
        return date_debut;
    }

    public void setDateDebut(String date_debut) {
        this.date_debut = date_debut;
    }

    public Integer getCodePostal() {
        return code_postal;
    }

    public void setCodePostal(Integer code_postal) {
        this.code_postal = code_postal;
    }

    public String getLieuAdresse2() {
        return lieu_adresse_2;
    }

    public void setLieuAdresse2(String lieu_adresse_2) {
        this.lieu_adresse_2 = lieu_adresse_2;
    }

    public String getHoraires() {
        return horaires;
    }

    public void setHoraires(String horaires) {
        this.horaires = horaires;
    }

    public String getTarifNormal() {
        return tarif_normal;
    }

    public void setTarifNormal(String tarif_normal) {
        this.tarif_normal = tarif_normal;
    }

    public String getLieuAdresse1() {
        return lieu_adresse_1;
    }

    public void setLieuAdresse1(String lieu_adresse_1) {
        this.lieu_adresse_1 = lieu_adresse_1;
    }

    public String getReservationTelephone() {
        return reservation_telephone;
    }

    public void setReservationTelephone(String reservation_telephone) {
        this.reservation_telephone = reservation_telephone;
    }

    public String getReservationEmail() {
        return reservation_email;
    }

    public void setReservationEmail(String reservation_email) {
        this.reservation_email = reservation_email;
    }
}
